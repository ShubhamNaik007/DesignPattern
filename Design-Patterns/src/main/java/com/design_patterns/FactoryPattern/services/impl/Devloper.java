package com.design_patterns.FactoryPattern.services.impl;

import com.design_patterns.FactoryPattern.services.Profession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Devloper implements Profession {

    private Logger logger = LoggerFactory.getLogger(Devloper.class);

    @Override
    public void print() {
        logger.info("Devloper is ready for service");
    }
}
