class A2A
{
	private int a = 15; //초기 값 설정. 생성자 호출시 해당 인스턴스 변수가 변경 될 경우, 값을 저장한다.
	static int c = 15;
	A2A(){
	a = 50;
	System.out.println("출력" + a);
	a = 25;
    System.out.println("출력" + a);
	}
	int getA(){
	 return a;
	}
}
class B2B extends A2A
{
}

class  InheritanceEx02
{
	public static void main(String[] args) 
	{
		B2B x = new B2B();
		System.out.println("x.getA() = " + x.getA());
		System.out.println(A2A.c); //static 변수는 클래스명.변수이름

 // class A extends Scanner
		A(){
		  super(System.im); //부모인 스캐너의 생성자 매개변수에 System.in 을 넣어야 해당 생성자를 실행 할 수 있다.

		}

		 void method(){
		  int i = nextInt();
		 }

		 //오버로딩 : 하나의 클래스에서 같은 이름(인수는 무조건 달라야한다)메소드를 여러개 만들어 내는것
		 //오버라이딩 : 부모클래스안에 정의된 메소드를 자식클래스에서 새롭게 정의하는 것.
		 // 메소드 이름, 리턴값, 인수가 무조건 같아야한다
	}
}
