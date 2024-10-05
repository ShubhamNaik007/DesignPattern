package com.design_patterns.FactoryPattern.services.impl;

import com.design_patterns.FactoryPattern.services.Profession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Doctor implements Profession {

    private final Logger logger = LoggerFactory.getLogger(Doctor.class);

    @Override
    public void print() {
        logger.info("Doctor is ready for service");
    }
}
