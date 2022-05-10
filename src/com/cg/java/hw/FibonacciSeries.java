package com.cg.java.hw;
import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = s.nextInt();
		
		int a=0, b=1;
		System.out.println(a+" "+b);
		int c;
		for(int i=1; i<=num; i++ )
		{
			c = a+b;
			System.out.println(""+c);
			
			//Swapping
			a=b;
			b=c;
		}

	}

}
