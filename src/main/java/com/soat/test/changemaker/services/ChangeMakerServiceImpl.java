package com.soat.test.changemaker.services;

import com.soat.test.changemaker.models.Change;
import org.springframework.stereotype.Service;

@Service
class ChangeMakerServiceImpl implements  ChangeMakerService{
    @Override
    public Change makeChange(int amount) {
        Change change = new Change(0, 0, 0, 0, 0, 0);
        int rest =  amount;
        if(amount > 0) {
            int hundreds = Math.floorDiv(rest, 100);
            rest -= hundreds*100;
            int fifties = Math.floorDiv(rest, 50);
            rest -= fifties*50;
            int twenties = Math.floorDiv(rest, 20);
            rest -= twenties*20;
            int tens = Math.floorDiv(rest, 10);
            rest -= tens*10;
            int twos = Math.floorDiv(rest, 2);
            rest -= twos*2;
            int ones = rest;

            change.setHundreds(hundreds);
            change.setFifties(fifties);
            change.setTwenties(twenties);
            change.setTens(tens);
            change.setTwos(twos);
            change.setOnes(ones);
        }
        return change;
    }
}
