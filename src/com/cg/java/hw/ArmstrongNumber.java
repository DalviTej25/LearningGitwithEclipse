package com.cg.java.hw;
import java.util.Scanner;
public class ArmstrongNumber {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = s.nextInt();
		int temp1 = num;
		int length = 0;
		while(temp1 != 0)
		{
			length = length +1;
			temp1 = temp1/10;
			
		}
		int temp2 = num;
		int rem;
		int arm =0;
		while(temp2 != 0) 
		{
			int mul=1;
			rem = temp2%10; //reverse logic
			for(int i=1; i<=length; i++ )
			{
				mul = mul * rem;
			}
			arm = arm+mul;
			temp2 = temp2/10;
			
		}
		if(arm == num)
		{
			System.out.println(num+" is an armstrong number");
		}
		else
		{
			System.out.println(num+" is not an armstrong number");
		}
	}

}
