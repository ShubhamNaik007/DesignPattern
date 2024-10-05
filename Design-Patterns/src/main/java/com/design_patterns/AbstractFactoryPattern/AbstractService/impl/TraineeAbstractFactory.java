package com.design_patterns.AbstractFactoryPattern.AbstractService.impl;

import com.design_patterns.AbstractFactoryPattern.AbstractService.AbstractFactory;
import com.design_patterns.AbstractFactoryPattern.TraineeService.impl.TraineeEngineer;
import com.design_patterns.AbstractFactoryPattern.TraineeService.impl.TraineeTeacher;
import com.design_patterns.FactoryPattern.services.Profession;

public class TraineeAbstractFactory extends AbstractFactory {

    @Override
    public Profession getProfession(String typeOfProfession) {
        System.out.println("typeOfProfession "+typeOfProfession);
        if(typeOfProfession == null){
            return null;
        } else if (typeOfProfession.equalsIgnoreCase("Engineer")) {
            return new TraineeEngineer();
        } else if (typeOfProfession.equalsIgnoreCase("Teacher")) {
            return new TraineeTeacher();
        }else {
            return null;
        }
    }
}

