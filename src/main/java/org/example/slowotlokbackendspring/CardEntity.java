package org.example.slowotlokbackendspring;

import lombok.*; // TODO ogarnąć ten importy w ustawieniach IDE

// TODO fformater jest lipny

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class CardEntity {
    private int id;
    private String src;
    private String translation;
    private int good;
    private int bad;
}
