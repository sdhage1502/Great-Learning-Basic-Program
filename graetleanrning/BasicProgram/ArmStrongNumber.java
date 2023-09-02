package com.graetleanrning.BasicProgram;

public class ArmStrongNumber {
	public static void main(String[] args) {
		int n = 100 , r,sum=0, a=n;
		while(n>0) {
			r = n%10;
			sum = sum+r*r*r;
			n=n/10;
           }
		if(a==sum) 
			System.out.println("IT IS ARMSTRONG NUMBER");
		else 
			System.out.println("IT IS NOT ARMSTRONG NUMBER");

	}
}
