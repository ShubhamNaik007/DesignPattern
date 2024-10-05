package com.design_patterns;

import com.design_patterns.AbstractFactoryPattern.AbstractFactoryProducer;
import com.design_patterns.AbstractFactoryPattern.AbstractService.AbstractFactory;
import com.design_patterns.AbstractFactoryPattern.TraineeService.impl.Teacher;
import com.design_patterns.FactoryPattern.MainFactory.ProfessionalFactory;
import com.design_patterns.FactoryPattern.services.Profession;
import com.design_patterns.Singleton.SingletonClass;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternsApplication {

	public static void main(String[] args) {

		SpringApplication.run(DesignPatternsApplication.class, args);

		//Factory Pattern
//		ProfessionalFactory factory = new ProfessionalFactory();
//		Profession user = factory.getProfession("Devloper");
//
//		if(user != null)
//			user.print();
//		else
//			System.out.println("Not ready to serve");

		//Abstract Factory Pattern
//		AbstractFactory factory = AbstractFactoryProducer.getProfession(false);
//		Profession profession = factory.getProfession("Teacher");
//		profession.print();

		//Singleton
		SingletonClass s1 = SingletonClass.getInstance();
		s1.printHashCod();

		SingletonClass s2 = SingletonClass.getInstance();
		s2.printHashCod();

		Teacher t1 = new Teacher();
		System.out.println(t1);

		Teacher t2 = new Teacher();
		System.out.println(t2);
	}

}
