package com.cgi.b3;
public class GreetAll1{
private String s="Hello World-1";
private int x=10;

GreetAll1(){
s="HI PPL!";
}
GreetAll1(String s){
this.s=s;
}

void greet(){
System.out.println(s);
}
public static void main(String args[]){
GreetAll1 ga = new GreetAll1();
com.cgi.b3.GreetAll1 ga1 = new GreetAll1("HI from PAraetrrised const");
ga.greet();
ga1.greet();
}
}