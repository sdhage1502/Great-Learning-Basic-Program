package com.graetleanrning.BasicProgram;
import java.util.*;
public class SortingArray {
public static void main(String[] args) {
	int a[]= {85,69,86,23,98,12};
	Arrays.sort(a);
	for(int i=0;i<=a.length-1;i++) {
		System.out.print(" "+ a[i]);
	}
}
}
