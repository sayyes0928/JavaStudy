interface A0A //class는 아니다. 때문에 사용할 때에는 '구현' 한다고 표현.
                   //inertface 는 class가 아니기 때문에 객체를 생성 할 수 없다.
				   //오로지 상속때문에 만들어진 것. 설계상 부모의 역할만 하기위해 존재
{
	int i;
	void method();  //중괄호 없음, -> 기능은 없다. 형태만 존재해 구현하여 사용한다
	                     // 반드시 구현한 class에 모든 메소드를 재정의(오버라이딩) 해주어야한다.
}
interface C0C extends A0A // interface 끼리는 상속 가능
{
}

interface D0D extends A0A,C0C  // class가 아니기 때문에 다중상속 가능
{
}
class X0X
{
}
class B0B extends X0X implements A0A  // '상속' -> '구현' 순서
//interface 를 구현 할 때, implementes
//interface 를 사용 후 상속 가능
{
}

class InterfaceEx01 //다중클래스인것처럼 보이게
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
