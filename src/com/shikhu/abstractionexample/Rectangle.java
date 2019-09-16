package com.shikhu.abstractionexample;

public class Rectangle extends Shape{

	int length = 10;
	int width = 20;
	
	@Override
	public void drawShape() {
		
		System.out.println("I am drawing rectangular shape");
		
	}

	@Override
	public int calculateArea() {
		
		return length * width;
	}

}
