package com.graetleanrning.BasicProgram;

public class Cbv {
int mark =99;
void subject(int mark){
	mark = mark-18;
//System.out.println(mark);
}
public static void main(String[] args) {
	Cbv m =new Cbv();
System.out.println("before any changes in mark" + m.mark);
m.subject(89);
System.out.println("after passing the value"+ m.mark);
}
}
