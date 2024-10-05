package com.design_patterns.AbstractFactoryPattern;

import com.design_patterns.AbstractFactoryPattern.AbstractService.AbstractFactory;
import com.design_patterns.AbstractFactoryPattern.AbstractService.impl.ProfessionAbstractFactory;
import com.design_patterns.AbstractFactoryPattern.AbstractService.impl.TraineeAbstractFactory;

public class AbstractFactoryProducer {

    public static AbstractFactory getProfession(boolean isTrainee){
        if (isTrainee){
            return new TraineeAbstractFactory();
        }else{
            return new ProfessionAbstractFactory();
        }
    }
}
