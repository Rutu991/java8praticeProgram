package com.demo.example;

 interface DefaultMethod {
	default void default_method(){
        System.out.println("I am default method of interface");
   }
}
class derived_class implements DefaultMethod{

}
  class Test{
  public static void main(String[] args){
       derived_class obj1 = new derived_class();
       obj1.default_method();
   }
}


