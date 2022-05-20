package com.demo.example;

 interface MethodRefernce {
	 
	 void display();
 }
 class MethodRef{
  
     public void classMethod(){  
             System.out.println("Derived class Method");  
     }
 }
 class Test1{
      public static void main(String[] args){
         derived_class obj1 = new derived_class();
         MethodRefernce  ref = obj1::classMethod; 
         ref.display();
     }

}
