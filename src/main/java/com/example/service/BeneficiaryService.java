package com.example.service;

import com.example.entity.Beneficiary;
import com.example.repository.BeneficiaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BeneficiaryService {

    @Autowired
    private BeneficiaryRepository beneficiaryRepository;

    public Beneficiary createBeneficiary(Beneficiary beneficiary) {
        return beneficiaryRepository.save(beneficiary);
    }

    public Optional<Beneficiary> getBeneficiaryById(Long id) {
        return beneficiaryRepository.findById(id);
    }

    public List<Beneficiary> getAllBeneficiaries() {
        return beneficiaryRepository.findAll();
    }

    public Beneficiary updateBeneficiary(Long id, Beneficiary beneficiaryDetails) {
        Optional<Beneficiary> beneficiary = beneficiaryRepository.findById(id);
        if (beneficiary.isPresent()) {
            Beneficiary existingBeneficiary = beneficiary.get();
            existingBeneficiary.setName(beneficiaryDetails.getName());
            existingBeneficiary.setAccountDetails(beneficiaryDetails.getAccountDetails());
            return beneficiaryRepository.save(existingBeneficiary);
        }
        return null;
    }

    public void deleteBeneficiary(Long id) {
        beneficiaryRepository.deleteById(id);
    }
}
