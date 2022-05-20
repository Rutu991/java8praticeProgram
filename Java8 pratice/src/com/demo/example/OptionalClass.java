package com.demo.example;

import java.util.Optional;
//program demonstrates the use of the Optional class.

public class OptionalClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] str = new String[10];   
        Optional<String>checkNull =  
                       Optional.ofNullable(str[5]);   
        if (checkNull.isPresent()) {   
            String word = str[5].toLowerCase();   
            System.out.print(str);   
         } else 
           System.out.println("string is null");   
    }   

	}


