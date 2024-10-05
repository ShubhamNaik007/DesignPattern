package com.design_patterns.AbstractFactoryPattern.AbstractService.impl;

import com.design_patterns.AbstractFactoryPattern.AbstractService.AbstractFactory;
import com.design_patterns.AbstractFactoryPattern.TraineeService.impl.Engineer;
import com.design_patterns.AbstractFactoryPattern.TraineeService.impl.Teacher;
import com.design_patterns.FactoryPattern.services.Profession;

public class ProfessionAbstractFactory extends AbstractFactory {
    @Override
    public Profession getProfession(String typeOfProfession) {
        if(typeOfProfession == null){
            return null;
        } else if (typeOfProfession.equalsIgnoreCase("Engineer")) {
            return new Engineer();
        } else if (typeOfProfession.equalsIgnoreCase("Teacher")) {
            return new Teacher();
        }else {
            return null;
        }
    }
}
