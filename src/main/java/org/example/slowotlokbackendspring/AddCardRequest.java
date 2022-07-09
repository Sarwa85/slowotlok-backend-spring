package org.example.slowotlokbackendspring;

import lombok.AllArgsConstructor;
import lombok.Data;

//@NoArgsConstructor
@AllArgsConstructor
@Data
public class AddCardRequest {
    String src;
    String tr;
}
