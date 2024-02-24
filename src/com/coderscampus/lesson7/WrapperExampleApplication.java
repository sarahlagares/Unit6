package com.coderscampus.lesson7;

public class WrapperExampleApplication {
	public static void main(String[] args) {
		
		/**
		 * byte 	-> Byte
		 * short	-> Short
		 * int		-> Integer
		 * long		-> Long
		 * float	-> Float
		 * double	-> Double
		 * char		-> Character 
		 * boolean	-> Boolean
		 * 
		 **/
		
		int primitiveInt = 8;
		Integer wrapperInt = 9; //auto-boxing
		primitiveInt = Integer.valueOf(9); //un-boxing
		
		String someNumber = "123";
		String someOtherNumber = "456";
		
		if ("456".equals(someNumber)) {
			
		}
		
		System.out.println(someNumber + someOtherNumber);
		System.out.println(Integer.parseInt(someNumber) + Integer.parseInt(someOtherNumber));
		
		
		Integer anotherIntWrapper = Integer.valueOf(9);
		
		Boolean someBoolean = null;
		
		//a safer way to do Boolean evaluation to avoid
		//a NullPointerExeption
		if (Boolean.TRUE.equals(someBoolean) == true) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		
		long firstLong = 10L;
		long secondLong = 10L;
		
		if (firstLong == secondLong) {
			System.out.println("primitive long comparison works!");
		}
		
		Long firstLongWrapper = 10L;
		Long secondLongWrapper = 10L;
		
		//Here's atypical 'Gotcha' scenario... when comparing object
		// wrapper values, be sure to use .equals(), not ==
		if (firstLongWrapper.equals(secondLongWrapper)) {
			System.out.println("Object wrapper long comparison works!");
		}
	}
}
