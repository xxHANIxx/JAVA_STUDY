class Ex15_Op
{
	public static void main(String[] args) 
	{
		//Ex15_Op.java(ch3)

		//연산자, Operator
		// - 피연산자(Operand)를 대상으로 미리 정해진 연산(계산,행동)을 한 후에 결과값을 반환하는 역할(주로 기호로 표현)
		// 1. 문장(Statement)
		// 2. 표현식(Expression)
		// 3. 연산자
		// 4. 피연산자
		// 5. 연산 우선순위
		// 6. 연산 방향
		int sum;

		sum = 1 + 2 + 3;

		System.out.println(sum);


		//1. 산술 연산자
		// - +, -, *, /, %(나머지 연산자, mod)
		// - 피연산자 2개 > 2항 연산자

		int a = 10;
		int b = 3;

		System.out.println(a + b); //13
		System.out.println(a - b); //7
		System.out.println(a * b); //30
		System.out.println(a / b); //3, 정수/정수 = 정수(몫)
		System.out.println(a % b); //1, 나머지

		//정수/정수 = 정수
		//정수/실수 = 실수
		//실수/정수 = 실수
		//실수/실수 = 실수
		//*** 산술 연산의 결과는 두 피연산자 중 더 큰 자료형으로 반환된다.
		System.out.println(10 / 3); //int
		System.out.println(10 / 3.0); //double
		System.out.println(10.0 / 3); //double
		System.out.println(10.0 / 3.0); //double

		System.out.println(10 + 10L); //long

		//***
		System.out.println(2100000000 + 2100000000L);

		System.out.println(-2100000000 - 2100000000);



		//reader
		//사용자에게 숫자를 입력 : 
		//int num = 0;
		//System.out.println(100 / num);
		

		//에러, Error
		// - 버그(Bug), 오류, 예외(Exception)

		//1. 컴파일 에러
		// - 컴파일러가 컴파일 작업 중 발견 하는 오류
		// - 문법이 틀린 경우 발생
		// - 발생 빈도 높음(초보자)
		// - 수정 난이도 낮음 > 오류 메시지 출력

		//2. 런타임 에러
		// - 런타임(Runtime) : 프로그램이 실행 중인 상태
		// - 실행 중 발생하는 에러
		// - 예외(Exception)
		// - 입출력 작업(외부 자원에 대한)
		// - 발생 빈도 높음(예상 힘듬 - 경험 부족하면)
		// - 수정 난이도 높음(발견 못하면.. 남아있어서..)

		//3. 논리 에러
		// - 컴파일O, 실행O, 결과 이상
		//System.out.println(10 - 20);



		//2. 비교 연산자
		// - >, >=, <, <=, ==(equal), !=(not equal)
		// - 2항 연산자
		// - 피연산자들의 비교 우위를 반환하는 역할
		// - 연산의 결과가 항상 boolean으로 반환(***)

		int c = 10;
		int d = 5;

		System.out.println(c > d);
		System.out.println(c >= d);
		System.out.println(c < d);
		System.out.println(c <= d);
		System.out.println(c == d);
		System.out.println(c != d);


		//사용자의 입력 올바른지 검사? -> 유효성 검사(Validation)
		
		//사용자 나이 입력 : 25
		int age = 15;

		System.out.println(age >= 19);
		//System.out.println(19 <= age);
		
		//사용자 문자 입력 : g
		// -> 영소문자만 입력 가능
		char c1 = 'A';

		//a(97) ~ z(122)
		System.out.println((int)c1 >= 97);
		System.out.println((int)c1 <= 122);


		c1 = 'c'; //숫자만 입력 가능

		//0(48) ~ 9(57)
		System.out.println((int)c1 >= 48);
		System.out.println((int)c1 <= 57);


		c1 = 'c'; //한글만 입력 가능

		//가 ~ 힝
		System.out.println((int)c1 >= (int)'가');
		System.out.println((int)c1 <= (int)'힣');

		System.out.println(c1 >= '가');
		System.out.println(c1 <= '힣');
		

		//==, !=
		// -> 문자열 비교
		//System.out.println("홍길동" > "아무개");
		System.out.println("홍길동" == "아무개"); //XXX
		System.out.println("홍길동" == "홍길동"); //XXX

		
		String name1 = "홍길동";
		String name2 = "홍길동";
		String name3 = "홍";
		name3 = name3 + "길동";

		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);

		System.out.println(name1 == name2);
		System.out.println(name1 == name3);

		System.out.println(name1.equals(name2));
		System.out.println(name1.equals(name3));



		//3. 논리 연산자
		// - &&(and), ||(or), !(not)
		// - 피연산자를 가지고 특정 규칙에 따라 정해진 결과값을 반환
		// - &&, || : 2항 연산자
		// - ! : 1항 연산자
		// - 피연산자는 반드시 boolean
		// - 연산의 결과는 boolean을 반환

		boolean b1 = true;
		boolean b2 = false;

		System.out.println(b1 && b2);
		System.out.println(b1 || b2);

		//논리연산자 + 비교연산자
		//age : 19 이상 ~ 60 미만
		// 19 <= age < 60
		age = 100;

		//System.out.println(19 <= age < 60);
		System.out.println(19 <= age && age < 60);
		System.out.println(age >= 19 && age < 60);
		System.out.println((age >= 19) && (age < 60));

		//연산자 우선 순위
		// - 산술 > 비교 > 논리
		//연산자 방향
		// - 왼쪽 -> 오른쪽

		c1 = 'v';
		System.out.println(c1 >= '가' && c1 <= '힣');
		System.out.println(c1 < '가' || c1 > '힣'); //v
		System.out.println(!(c1 >= '가' && c1 <= '힣')); //v

		//쇼핑몰 의류
		// - 빨, 파, 노
		String color = "black";

		System.out.println(color.equals("red") || color.equals("blue") || color.equals("yellow"));


		//4. 대입(할당) 연산자
		// - =
		// - +=, -=, *=, /=, %= //복합 대입 연산자
		// - LValue(변수) = RValue(상수, 변수)
		// - LValue와 RValue의 자료형 반드시 동일
		// - 대입 연산자는 모든 연산자를 통들어서 연산자 우선 순위가 가장 낮다.
		// - 연산자 방향이 오른쪽 -> 왼쪽 이다.

		int n = 10;

		n = n + 1; //누적
		System.out.println(n); //11
		
		n += 1;
		System.out.println(n); //12

		n = n - 3;
		System.out.println(n); //9

		n -= 3;
		System.out.println(n); //6

		n = 100 - n;
		n -= 100; //n = n - 100

		n = n * 2;
		System.out.println(n); //12

		n *= 2;
		System.out.println(n); //24

		n = n / 3;
		System.out.println(n); //8

		n /= 3;
		System.out.println(n); //2

		n = 10;
		n = n % 3;
		System.out.println(n); //1

		n = 10;
		n %= 3;
		System.out.println(n); //1



		//5. 증감 연산자
		// - ++(증가), --(감소)
		// - 1항 연산자(단항 연산자)
		// - 숫자인 피연산자를 +1, -1
		// - 연산자의 결과가 경우에 따라 달라진다.(연산자 우선 순위가 변함)
		// - ++n : 전위 배치(전치). 연산자 우선 순위 가장 높음
		// - n++ : 후위 배치(후치). 연산자 우선 순위 가장 낮음

		n = 10;

		n = n + 1;

		n += 1;

		++n;

		System.out.println(n);

		n = n - 1;

		n -= 1;

		--n;

		System.out.println(n);


		n = 10;

		sum = 10 + ++n;

		++n; //n++;
		sum = 10 + n;

		
		sum = 10 + n++;

		sum = 10 + n;
		++n; //n++;

		System.out.println(sum);
		System.out.println(n);

		int o = 10;
		System.out.println(--o-o--);// --o - o--
		
		//--o;
		//o - o;
		//--o;



		//6. 조건 연산자
		// - A ? B : C
		// - 3항 연산자
		// - A : boolean
		// - B, C : 상수 or 변수 or 표현식 -> 값
		// - B와 C는 자료형이 동일해야 한다.
		// - if문 역할과 유사

		age = 15;

		//결과? 성인 or 미성년자
		String result = age >= 19 ? "성인" : "미성년자"; 
		System.out.println(result);


		int money = age >= 19 ? 1000 : 500;
		System.out.println(money);

	}
}

















