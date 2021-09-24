package com.Automation_Practise;

public class POJO_B {

	public static void main(String[] args) {
		
		POJO_A n = new POJO_A();
		
		int a = n.getA();
		
		System.out.println("Value : "+a);
		
		System.out.println("After Setters");
		
		n.setA(15);
		
		int a2 = n.getA();
		
		System.out.println("After setters value : "+a2);
	}

}
