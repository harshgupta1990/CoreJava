package exceptionhandling;

import java.io.*;

class Mother7{ 

  void smile(){

      System.out.println("parent smile");

  } 

} 

public class Child1 extends Mother7{ 

  void smile()throws ArithmeticException { 

    System.out.println("Child1 smile"); 

  } 

 

  public static void main(String args[]){ 

   Mother7 p=new Child1(); 

   p.smile(); 

  } 

} 
