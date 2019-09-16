package com.shikhu.abstractionexample;

public class Circle extends Shape{

	int radius = 10;
	
	@Override
	public void drawShape() {
		
		
		System.out.println("I am drawing circular shape");
		
	}

	@Override
	public int calculateArea() {
		
		return 22 *  radius * radius / 7;
	}

}
