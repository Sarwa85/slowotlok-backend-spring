package org.example.slowotlokbackendspring;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CardController {

    private List<CardEntity> cards = new ArrayList<>();

    @GetMapping(path = "cards")
    public List<CardEntity> getCards() {
        return cards;
    }

    @PostMapping(path = "cards")
    public CardEntity addCard(@RequestBody AddCardRequest request) {
        CardEntity cardEntity = CardEntity.builder()
                .id(cards.size())
                .bad(0)
                .good(0)
                .src(request.src)
                .translation(request.tr)
                .build();
        cards.add(cardEntity);
        return cardEntity;
    }


    @GetMapping(path="cards/{id}")
    public CardEntity getCard(@PathVariable int id) {
        return cards.get(id);
    }
}
