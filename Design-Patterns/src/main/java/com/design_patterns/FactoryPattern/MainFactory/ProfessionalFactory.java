package com.design_patterns.FactoryPattern.MainFactory;

import com.design_patterns.FactoryPattern.services.Profession;
import com.design_patterns.FactoryPattern.services.impl.Devloper;
import com.design_patterns.FactoryPattern.services.impl.Doctor;

public class ProfessionalFactory {

    public Profession getProfession(String typeOfProfessoin){
        if(typeOfProfessoin == null){
            return null;
        }
        if(typeOfProfessoin.equalsIgnoreCase("Doctor")){
            return new Doctor();
        }else if (typeOfProfessoin.equalsIgnoreCase("Devloper")){
            return new Devloper();
        }

        return null;
    }
}
