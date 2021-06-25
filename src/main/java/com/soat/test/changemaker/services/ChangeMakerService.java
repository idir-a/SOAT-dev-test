package com.soat.test.changemaker.services;

import com.soat.test.changemaker.models.Change;

public interface ChangeMakerService {
    Change makeChange(int amount);
}
