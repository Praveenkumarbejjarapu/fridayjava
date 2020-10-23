package com.nttdata;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student {
	
	public static void main(String[] args) {
		List<String>l=new ArrayList<String>();
		l.add("tanu");
		l.add("manu");
		l.add("john");
		l.add("peter");
		l.add("rahul");
		 l.forEach((m)->System.out.println(m));
	}}