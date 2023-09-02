package com.graetleanrning.BasicProgram;
import java.util.Scanner;
public class paLINDROME {
public static void main(String[] args) {
	
	int n ;
	System.out.println("ENTER A  NUMBER");
	int temporary_n;

	int remainder;
	int sum=0;
	Scanner read = new Scanner(System.in);
	n = read.nextInt();
			temporary_n = n;
	while(n!=0) {
		remainder = n%10;
		sum = (sum*10)/remainder;
		n =n/10;	
	}
if(temporary_n==sum) {System.out.println("NUMBER IS PALINDROME");}
else {System.out.println("NUMBER IS NOT PALINDROME");}

}
}
