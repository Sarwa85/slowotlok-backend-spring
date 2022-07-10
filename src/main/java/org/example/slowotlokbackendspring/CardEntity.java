package org.example.slowotlokbackendspring;

import lombok.*; // TODO ogarnąć ten importy w ustawieniach IDE

import javax.persistence.*;

// TODO fformater jest lipny

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Table(name = "card")
public class CardEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String src;
    private String translation;
    private int good;
    private int bad;
}
