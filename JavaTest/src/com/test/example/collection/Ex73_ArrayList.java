﻿package com.test.example.collection;

import java.util.ArrayList;

public class Ex73_ArrayList {

	public static void main(String[] args) {
		
		//Ex73_ArrayList.java
		
		m1();
	}

	private static void m1() {
		
		ArrayList<Integer> list = new ArrayList<Integer>(100);
		
		//list.add(100);
		//list.add(200);
		//list.add(300);
		
		//비권장
		for (int i=0; i<100; i++) {
			list.add(i);
		}
		
		list.add(101);
		
		list.trimToSize();
	
	}	
}



//class MyArrayList {
//	
//	private int[] list;
//	
//	public MyArrayList() {
//		list = new int[??];
//	}
//	
//}

