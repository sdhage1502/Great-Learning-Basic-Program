package com.graetleanrning.BasicProgram;
import java.util.Scanner;
public class Factorial {
public static void main(String[] args) {
	int n = 5;
	 // Scanner n1 = new Scanner(System.in); 
	 // int n = n1.nextInt(); 
	  int num = n;
	 	for(int i =1; i<n; i++) {
		num = num*(n-i);}
		
	
	 System.out.println(num);
}
}
