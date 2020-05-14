package com.nineleaps;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nineleaps.service.FactoryService;
import com.nineleaps.service.ShapeService;

@SpringBootApplication
public class SpringAopConceptsApplication {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("aopconfig.xml");
		ShapeService shapeService = context.getBean("shapeService", ShapeService.class);
		shapeService.getCircle();
//		shapeService.getCircle().setName("Dummy Argumenets");
//		shapeService.getCircle().setNameAndRetrun("Dummy Argumenets");
//		System.out.println(shapeService.getCircle().getName());
		
//		System.out.println(shapeService.getTriangle().getName());
		
			
		//((AbstractApplicationContext) context).close(); 
		
//		
//		FactoryService factoryService= FactoryService.getInstance();
//		ShapeService shapeService = (ShapeService) factoryService.getBean("shapeService");
//		
//		shapeService.getCircle();
	}

}
