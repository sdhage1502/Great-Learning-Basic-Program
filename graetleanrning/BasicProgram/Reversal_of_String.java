package com.graetleanrning.BasicProgram;
import java.util.Scanner;
public class Reversal_of_String {
public static void main(String[] args) {
	String s ;
	System.out.println("ENTER A STRING");
	Scanner s1 = new Scanner(System.in);
	s = s1.nextLine();
	
	String rev =" ";
	for(int i = s.length()-1; i>=0; i--) {
		rev = rev + s.charAt(i);
	}
System.out.println("Reverse string is " + rev);


}
}
