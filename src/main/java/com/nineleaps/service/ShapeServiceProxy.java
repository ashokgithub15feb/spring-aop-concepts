package com.nineleaps.service;

import com.nineleaps.aspect.LoggingAspect;
import com.nineleaps.model.Circle;

public class ShapeServiceProxy extends ShapeService{

	@Override
	public Circle getCircle() {
		
		new LoggingAspect().loggingAdvice();
		return super.getCircle();
	}
}
