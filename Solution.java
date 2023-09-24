package com;
import java.util.*;
public class Solution {
	public static void main(String[] args) {
		System.out.println("Welcome to Calculator project");
		System.out.println("------------------------------");

		Scanner sc=new Scanner(System.in);
		//upcasting to achieve abstraction
		Calculator cal=new CalculatorImpl();

		//MENUDRIVEN PROGRAM
		while(true)//infinite loop
		{

			System.out.println("1:Addition\n2:substraction");
			System.out.println("3.Multiplication\n4:Division");
			System.out.println("5:Exit\nEnter choice");
			int choice=sc.nextInt();

			//local variable does not hava deafault value
			//so intializing to 0
			int a=0;
			int b=0;

			if(choice>=1 && choice<=4)
			{
				System.out.println("enter the 2 number:");
				a=sc.nextInt();
				b=sc.nextInt();
			}

			switch(choice)
			{
			case 1:System.out.println("entter the 2 integer values");

			System.out.println("sum of "+a+" & "+b+" is"+cal.add(a, b));
			break;

			case 2:System.out.println("entter the 2 integer values");

			System.out.println("sum of "+a+" & "+b+" is"+cal.sub(a, b));
			break;

			case 3:System.out.println("entter the 2 integer values");

			System.out.println("sum of "+a+" & "+b+" is"+cal.mul(a,b));
			break;

			case 4:System.out.println("entter the 2 integer values");

			System.out.println("sum of "+a+" & "+b+" is"+cal.div(a,b));
			break;

			case 5:System.out.println("thank you");
			System.exit(0);

			default :
				System.out.println("invalid choice");
			}//end the switch of statement
			System.out.println("--------------------");
			//end of while loop


		}//end of main method
	}
}
