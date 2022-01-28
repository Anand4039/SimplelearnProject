package com.sl.dimond;

public class DemoClass  implements DemoInterface1, DemoInterface2 {
	public void display()   
	{  
	DemoInterface1.super.display();  
	DemoInterface2.super.display();  
	}  
	public static void main(String args[])   
	{  
	DemoClass obj = new DemoClass();  
	obj.display();  
	}  
}
