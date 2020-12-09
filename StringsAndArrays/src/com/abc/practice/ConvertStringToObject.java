package com.abc.practice;

public class ConvertStringToObject {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		
		//using assignment operator
        String s = "Its winter season";
        Object obj = s;
        System.out.println("Datatype of the variable 's' is:"+" "+obj.getClass().getName());
        System.out.println("Object name:"+" "+obj);
		
		//using Class.forName()
		
		/*Class name = Class.forName("java.lang.String");
		System.out.println(name.getName());
		System.out.println(name.getSuperclass().getName());*/
	}

}
