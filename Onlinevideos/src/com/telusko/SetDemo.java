package com.telusko;

import java.util.Set;
import java.util.TreeSet;

/*public class SetDemo
{

	public static void main(String[] args) 
	{
		Set<Integer>values = new HashSet<>(); // set has Unique value
		                                      //HashSet will not give value in sequence
		
		System.out.println(values.add(97));
		System.out.println(values.add(87));
		System.out.println(values.add(34));
		System.out.println(values.add(92));
		
		for (int i: values)
		{
			System.out.println(i);
		}
		

	}

}
*/
public class SetDemo
{

	public static void main(String[] args) 
	{
		Set<Integer>values = new TreeSet<>(); // set has Unique value
		                                      //TreeSet will give value in sequence
		
		System.out.println(values.add(97));
		System.out.println(values.add(87));
		System.out.println(values.add(34));
		System.out.println(values.add(92));
		
		for (int i: values)
		{
			System.out.println(i);
		}
		

	}

}
