package com.example.service;

import com.example.entity.Account;
import com.example.entity.User;
import com.example.repository.AccountRepository;
import com.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private UserRepository userRepository;

    public Account createAccount(Long userId, Account account) {
        User user = userRepository.findById(userId).get();
        account.setUser(user);
        account.setActive(Boolean.TRUE);
        account.setDateCreated(new Date(System.currentTimeMillis()));
        return accountRepository.save(account);
    }

    public List<Account> getAccountById(Long id) {
        return accountRepository.findByUserId(id);
    }

    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }

    public Account updateAccount(Long id, Account accountDetails) {
        Optional<Account> account = accountRepository.findById(id);
        if (account.isPresent()) {
            Account existingAccount = account.get();
            existingAccount.setAccountType(accountDetails.getAccountType());
            existingAccount.setBalance(accountDetails.getBalance());
            existingAccount.setDateCreated(accountDetails.getDateCreated());
            existingAccount.setActive(accountDetails.getActive());
            return accountRepository.save(existingAccount);
        }
        return null;
    }

    public void deleteAccount(Long id) {
        accountRepository.deleteById(id);
    }

}
