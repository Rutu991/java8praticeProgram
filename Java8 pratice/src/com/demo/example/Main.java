package com.demo.example;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//lambda expression
        MyInterface fobj = (int x, int y)->System.out.println(x+y); 
 
        System.out.print("The result = ");
        fobj.abstract_func(5,5); 
        fobj.default_Fun();
    } 

	}


