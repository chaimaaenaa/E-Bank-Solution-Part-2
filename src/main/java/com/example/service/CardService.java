package com.example.service;

import com.example.entity.Card;
import com.example.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CardService {

    @Autowired
    private CardRepository cardRepository;

    public Card createCard(Card card) {
        return cardRepository.save(card);
    }

    public Optional<Card> getCardById(Long id) {
        return cardRepository.findById(id);
    }

    public List<Card> getAllCards() {
        return cardRepository.findAll();
    }

    public Card updateCard(Long id, Card cardDetails) {
        Optional<Card> card = cardRepository.findById(id);
        if (card.isPresent()) {
            Card existingCard = card.get();
            existingCard.setCardNumber(cardDetails.getCardNumber());
            existingCard.setExpirationDate(cardDetails.getExpirationDate());
            existingCard.setCardType(cardDetails.getCardType());
            existingCard.setActive(cardDetails.getActive());
            return cardRepository.save(existingCard);
        }
        return null;
    }

    public void deleteCard(Long id) {
        cardRepository.deleteById(id);
    }
}
