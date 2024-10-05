package com.design_patterns.AbstractFactoryPattern.TraineeService.impl;

import com.design_patterns.FactoryPattern.services.Profession;

public class TraineeTeacher implements Profession {
    @Override
    public void print() {
        System.out.println("Trainee Teacher called");
    }
}
