package com.soat.test.changemaker.services;

import com.soat.test.changemaker.models.Change;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class ChangeMakerServiceImplTest {

    @Autowired
    private ChangeMakerService changeMakerService;

    @Test
    void makeChange_example_475_test() {
        Change expectedChange = new Change(4,1,1,0,2,1);
        Change result = changeMakerService.makeChange(475);
        assertEquals(expectedChange, result);
    }

    @Test
    void makeChange_oddNumber_test() {
        Change expectedChange = new Change(1,1,1,1,3,1);
        Change result = changeMakerService.makeChange(187);
        assertEquals(expectedChange, result);
    }

    @Test
    void makeChange_evenNumber_test() {
        Change expectedChange = new Change(2,0,2,0,2,0);
        Change result = changeMakerService.makeChange(244);
        assertEquals(expectedChange, result);
    }

    @Test
    void makeChange_zero_test() {
        Change expectedChange = new Change(0,0,0,0,0,0);
        Change result = changeMakerService.makeChange(0);
        assertEquals(expectedChange, result);
    }
}