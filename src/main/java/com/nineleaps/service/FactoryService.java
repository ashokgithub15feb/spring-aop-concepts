package com.nineleaps.service;

import com.nineleaps.model.Circle;
import com.nineleaps.model.Triangle;

public class FactoryService {

	public Object getBean(String beanType)
	{
		if(beanType.equals("shapeService")) 
		{
			return new ShapeServiceProxy();
		}
		
		if(beanType.equals("cirle")) 
		{
			return new Circle();
		}
		
		if(beanType.equals("trianble")) 
		{
			return new Triangle();
		}
		
		return null;
	}
	
	private FactoryService() {}
	
	public static FactoryService getInstance()
	{
		return new FactoryService();
	}
}
