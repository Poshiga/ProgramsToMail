package com.abc.practice;

import java.util.Stack;

public class ReverseStringUsingStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            String s = "good morning";
            char a[] = s.toCharArray();
            Stack<Character> st = new Stack<Character>();
            
            //pushing character in a stack
            for(int i=0;i<s.length();i++)
            {
            	st.push(s.charAt(i));
            }
            
            //pop it all untill it becomes empty
            int j=0;
            while(st.isEmpty()!=true)
            {   
            	 a[j] = st.pop();
            	 j++;
            }
            for(int i=0;i<a.length;i++)
            {
            	System.out.print(a[i]);
            }
            System.out.println();
	}

}
