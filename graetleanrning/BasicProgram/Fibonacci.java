package com.graetleanrning.BasicProgram;
import java.util.Scanner;
public class Fibonacci 
{	public static void main(String[] args) 
	{	int first =0; int second = 1 ;
		System.out.println("ENTER A NUMBER UPTO WHICH FIBONACCI WILL GET");
		int n ;
		Scanner n1 = new Scanner(System.in);
		n = n1.nextInt();
		System.out.print(first +" "+ second );//for print  1st and 2nd digit
		for(int i = 0; i<=n-2;i++) 
		{	int	next = first + second;
			first = second;
			second = next;
			System.out.print( " "+ next);
		}
	}
}
