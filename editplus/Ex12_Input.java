class Ex12_Input 
{
	public static void main(String[] args) throws Exception
	{
		//Ex12_Input.java

		//콘솔 입력
		//1. System.in.read() 메소드
		//	- 1글자만 읽기
		//2. BufferedReader 클래스 
		//3. Scanner 클래스

		//요구사항] 사용자에게 문자를 1개 입력받아서 화면에 그대로 출력하시오.
		int input = System.in.read(); //입력 대기 상태, 블럭

		//문자 코드값(암기)
		//1. a(97), z(122)
		//2. A(65), Z(90)
		//3. 0(48), 9(57)
		//4. 가, 힣
		System.out.println(input);

		input = System.in.read();
		System.out.println(input);

		input = System.in.read();
		System.out.println(input);

		input = System.in.read();
		System.out.println(input);

		input = System.in.read();
		System.out.println(input);

		System.out.println("종료");


	}
}










