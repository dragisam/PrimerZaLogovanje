package com.dragisaStari.contrllerStari;

public class Dummyclass {
 private String name;
 private int number;
 public void seValuesIV(){
	 name="Andreja";
	 number=5;
 }
 
 public void method1(){
	 int number2=8;
	 seValuesIV();
	 System.out.println(name+" "+number);
 }
 public void method2(){
	 System.out.println(name+" "+number);
	
 }
}
