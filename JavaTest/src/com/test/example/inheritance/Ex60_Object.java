package com.test.example.inheritance;

import java.util.Calendar;
import java.util.Random;

public class Ex60_Object {
	
	public static void main(String[] args) {
		
		//Ex60_Object.java
		//Object 클래스
		
		AA a = new AA();//O
		AA b = new BB();//부모 O
		AA c = new CC();//할아버지 O
		AA d = new DD();//부모 O
		
		//Object 변수는 모든 타입을 담을 수 있는 변수
		Object[] list = new Object[100];
		
		Object o1 = new Object();//본인 -> 쓸모 X
		Object o2 = new AA();//부모
		Object o3 = new BB();
		Object o4 = new CC();
		Object o5 = new Random();
		Object o6 = Calendar.getInstance();
		Object o7 = new MyRandom();
		//-------- 참조형변수 = 객체
		
		//-------- 참조형변수 = 값
		//박싱(Boxing)
		// - 값형의 데이터를 참조형 변수에 대입할 때 벌어지는 현상
		Object o8 = 10;
		Object o9 = true;
		
		//다운캐스팅 + 언박싱
		// - 참조형 변수안의 객체(값형)의 값을 꺼내서 다시 값으로 되돌리는 현상
		System.out.println((int)o8 * 2);
		System.out.println(o9);
		
		
		
		
		
		
		//주의점!!!
		//System.out.println((Random)o6);
		
		//결론
		// - 물리적으론 만능이지만 1가지 타입만 넣는 용도로 사용할 것
		//Object[] list = new Object[100];
		//list[0] = new AA();
		//list[1] = new AA();
		//list[2] = new AA();
		
		
		
		
	}

}

class AA { }
class BB extends AA { }
class CC extends BB { }
class DD extends AA { }




















