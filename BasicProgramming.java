package com.model;

import java.util.Scanner;

public class BasicProgramming {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first number: ");
	
	double a=sc.nextDouble();
	System.out.println("Enter second number: ");
	double b=sc.nextDouble();
	
	System.out.println("Enter an operator (+ or - or * or / : )");
	char operator=sc.next().charAt(0);
	
	boolean issValid=true;
	double result=0;
	switch(operator)
	{
	case '+' :
		result=a+b;
		break;
		
	case '-':
		result =a-b;
		break;
		
	case '*':
		result =a*b;
		break;
		
	case '/':
		result = a/b;
		break;
		default:
			System.out.println("Unknow operator. please select only(+ or - or * or /)");
			issValid=false;
			break;
			
	}
	if(issValid) System.out.println(a + " " +b + " = " + result);
	
		
}
}