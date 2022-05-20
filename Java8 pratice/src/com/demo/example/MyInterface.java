package com.demo.example;

//Let’s implement a program that demonstrates Lambda Expressions.
 interface MyInterface {
	 void abstract_func(int x,int y); 
	 
     default void default_Fun() 
    { 
         System.out.println("This is default method"); 
    } 

}
