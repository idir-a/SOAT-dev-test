package com.soat.test.changemaker.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Change {
    private int hundreds;
    private int fifties;
    private int twenties;
    private int tens;
    private int twos;
    private int ones;
}
