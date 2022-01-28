package com.sl.abs;

public class Abstraction {
	public static void main(String args[]){  
		Shape s=new Circle();//In a real scenario, object is provided through method, e.g., getShape() method  
		s.draw();  
		}  
}
