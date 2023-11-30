package org.stepdefinition;


import java.util.LinkedList;
import java.util.*;

public class A {
	public static void main(String[] args) {
		List<String> a= new LinkedList<>();
		a.add("kavi");
		a.add("34567");
		List<String> b= new LinkedList<>();
		b.add("hema");
		b.add("56789");
		List<String> c= new LinkedList<>();
		c.add("ravi");
		c.add("567839");
		List<List<String>> li=new LinkedList<>();
		li.add(a);
		li.add(b);
		li.add(c);
		List<String> hema = li.get(1);
		String user = hema.get(0);
		System.out.println(user);
		System.out.println(li.get(1).get(1));
	}

}
