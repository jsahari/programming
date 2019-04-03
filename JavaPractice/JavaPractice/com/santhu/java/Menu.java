package com.santhu.java;

public class Menu {

	public static void main(String[] args) 
			throws java.io.IOException  {
		// TODO Auto-generated method stub
		char choice;
		do {
			System.out.println(" Menu :");
			System.out.println(" 1. if ");
			System.out.println(" 2. While ");
			System.out.println(" 3. for ");
			System.out.println("4.do-while\n");
			System.out.println("choose one :");
			choice= (char) System.in.read();
		} while(choice < '1' || choice > '4');
		 
		System.out.println("\n");
		
		switch(choice) {
		case '1':
			System.out.println("if (condition) { ");
			System.out.println("//body;");
			System.out.println("}");
		case '2':
			System.out.println(" while (condition) ");
			System.out.println("//body;");
			System.out.println("}");
		case '3':
			System.out.println("for(initialization,condition,increment)");
			System.out.println("body;");
			System.out.println("}");
		case '4':
			System.out.println("do {");
			System.out.println("//body;");
			System.out.println("}while(condition);");
		
		}
		
		
	}

}
