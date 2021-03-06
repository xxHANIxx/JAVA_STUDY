class Ex14_Casting 
{
	public static void main(String[] args) 
	{
		//Ex14_Casting.java(p49)

		//값형 형변환, Type Casting
		// - A라는 자료형을 B라는 자료형으로 바꾸는 작업

		//1. 암시적 형변환. 자동 타입 변환
		// - 큰형 = 작은형
		// - 100% 안전

		//2. 명시적 형변환. 강제 타입 변환
		// - 작은형 = 큰형
		// - 경우에 따라 다름(****)
		// - 오버플로우(Overflow) 발생
		//	a. 오버플로우(Overflow)
		//	b. 언더플로우(Underflow)


		int a = 30;
		int b = 30;

		int c = 20;
		int d = c;

		byte e = 10;
		int f = e; //int = byte

		//= 연산자
		//LValue = RValue
		//**** 반드시 LValue와 RValue의 자료형은 동일해야 한다. 다르면 에러가 발생한다.
		//int g = "10";

		

		byte b1 = 127; //원본
		short s1; //복사본

		//short = byte
		//큰형 = 작은형
		//byte -> short
		//s1 = b1;
		//() : 형변환 연산자
		s1 = (short)b1;

		System.out.println(s1); //복사본 확인



		byte b2 = 20;
		long l2;

		l2 = b2;

		System.out.println(l2);



		//명시적 변환
		short s3 = 200;
		byte b3;

		b3 = (byte)s3;

		System.out.println(b3);


		int a4 = 2100000000;

		short b4;

		b4 = (short)a4;

		System.out.println(b4);




		

		byte b5 = (byte)10; //명시적 형변환
		short s5 = (short)10; //명시적 형변환
		int n5 = 10; //X
		long l5 = 10; //암시적 형변환
		


		//정수 -> 정수
		//정수 -> 실수
		//실수 -> 정수
		int n6 = Integer.MAX_VALUE; //2100000000
		float f6;//2100000000.0 -> 2.1e9

		//2.14748365E9
		//2.14748365

		f6 = n6;

		System.out.println(f6);

		int n7;
		float f7 = 100F;

		//암시적(X) -> 명시적(O)
		//4byte = 4byte
		n7 = (int)f7;

		System.out.println(n7);

		long n8;
		float f8 = 200F;

		n8 = (long)f8;

		System.out.println(n8);


		//실수 -> 실수
		float f9 = 3.14F;
		double d9 = f9;
		System.out.println(d9);

		double f10 = 3.14F;
		float d10 = (float)f10;
		System.out.println(d10);

		
		//boolean
		//boolean m11 = true;
		//int n11;

		//n11 = m11;

		//System.out.println(n11);


		char c12 = 'A';
		int n12;

		n12 = c12;

		System.out.println(n12);

		char c13 = '가';
		short s13;

		s13 = (short)c13;

		System.out.println(s13);


		int n14 = 65;
		char c14;

		c14 = (char)n14;
		
		System.out.println(c14);


		//문자 코드값
		System.out.println((int)'A');
		System.out.println((int)'Z');
		System.out.println((int)'a');
		System.out.println((int)'z');
		System.out.println((int)'0');
		System.out.println((int)'9');

		System.out.println((int)'\r');
		System.out.println((int)'\n');
		System.out.println((int)'\t');
		System.out.println((int)'\b');
		System.out.println((int)' ');

		System.out.println((int)'가');
		System.out.println((int)'힣');

		//한글 : 완성형, 조합형


		System.out.printf("%d", "a");





	}
}


















