package com.design_patterns.AbstractFactoryPattern.AbstractService;

import com.design_patterns.FactoryPattern.services.Profession;

public abstract class AbstractFactory {
    public abstract Profession getProfession(String typeOfProfession);
}
