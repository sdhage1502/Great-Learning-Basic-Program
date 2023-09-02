package com.graetleanrning.BasicProgram;
import java.util.*;
public class PrimeNumber {
	public static void main(String[] args) {
		int n  ,a=0;
		System.out.println("ENTER A NUMBER TO CHECK WHETHER IT IS PRIME OR NOT :- ");
		Scanner read = new Scanner(System.in);
		n = read.nextInt();


for(int i =2; i<=n-1;i++) {
	if(n%i==0) {
	a=+1;	
	}}
if (a>0)System.out.println(n +" :- "+"THIS NUMBER IS NOT PRIME");
else System.out.println(n +" :- "+"THIS NUMBER IS PRIME");
	}
}
