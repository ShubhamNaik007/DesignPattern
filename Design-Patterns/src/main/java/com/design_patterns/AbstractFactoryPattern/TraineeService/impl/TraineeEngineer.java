package com.design_patterns.AbstractFactoryPattern.TraineeService.impl;

import com.design_patterns.FactoryPattern.services.Profession;

public class TraineeEngineer implements Profession {
    @Override
    public void print() {
        System.out.println("Trainee Engineer called");
    }
}
