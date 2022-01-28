package com.sl.methods2;

public class callMethod {
	int val=150;

	int operation(int val) {
		val =val*12/10;
		return(val);
	}

	public static void main(String args[]) {
		callMethod d = new callMethod();
		//System.out.println("Before operation value of data is "+d.val);
		d.operation(10);
		System.out.println("After operation value of data is "+d.val);
		}

}
