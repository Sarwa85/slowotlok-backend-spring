package org.example.slowotlokbackendspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class CardController {
    @Autowired
    private CardRepository repo;

    @GetMapping(path = "cards")
    public List<CardEntity> getCards() {
        return repo.findAll();
    }

    @PostMapping(path = "cards")
    public CardEntity addCard(@RequestBody AddCardRequest request) {
        CardEntity cardEntity = CardEntity.builder()
                .bad(0)
                .good(0)
                .src(request.src)
                .translation(request.tr)
                .build();
        repo.save(cardEntity);
        return cardEntity;
    }

    @GetMapping(path = "cards/{id}")
    public CardEntity getCard(@PathVariable Long id) {
        return repo.findById(id).orElse(new CardEntity());
    }

    @DeleteMapping(path = "cards/{id}")
    public void delCard(@PathVariable Long id) {
        repo.deleteAllById(Arrays.asList(id));
    }
}
