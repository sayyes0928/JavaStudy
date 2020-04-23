class Car
{
	/*pulibc */ /*private*/ protected String carname;  // public -> private 로 변경시 접근 불가, 상속 받았어도 사용 불가, 블럭을 나갔을 경우 직접적인 접근 안됨
	public int cost;              // Audi class 에서 Car class의 parivate 사용 불가
	Car(){  //생성자는 자식에게 상속 안된다.
	 System.out.println("부모 생성자"); // 자식은 객체가 만들어질 때, 둘 다 실행된다. 벤다이어그램으로 이해
	}
	protected void printAttributes(){  // 상속받은(자식) class 만 사용 가능하게 제한, 외부 클래스에서는 사용 불가
	  System.out.println("carname = " + carname + "\tcost = " + cost);
	}
}

class Audi extends Car
{
	public Audi(){ // 매개변수는 있을 수 있으나, 리턴은 없다.
		// 부모클래스 생성자 호출이 생략되어있다. 자식의 생성자 첫 줄에 무조건 호출
		System.out.println("자식 생성자");
	 carname = "Audi"; //상속받은 Car 의 carname
//	 super.carname = "Audi"; 와 같다. 상속받은 class의 요소를 사용할 때.
	 this.cost = 20000; //
	}
}

class Bmw extends Car
{
	int a = 10;  // 부모 ( Car ) 는 자식( Bmw )의 요소를 쓸 수 없다. (접근불가, 일방통행)
	public Bmw(){
	 carname = "Bmw";
	 cost = 10000;
	}
}

class Benz extends Car
{
	public Benz(){
	carname = "Benz";
	cost = 25000;
	}
}

public class  Inheritance  //class 앞에 publid 을 붙이는 것은 안된다.
                               // main 이 들어있는 class 앞에 public 을 붙여 시작점을 나타내준다.
{                             // 붙이지 않는다고 문제가 되는건 아니지만, 모든 클래스에 붙이는건 안된다.
	// 다중상속 불가  ex) class A extends B, C -> (X)
	// But, 상속받는 class의 부모class가 있을 경우, 해당 class의 기능도 사용 가능
	// ex) A extends B  , B extends C ,,일때 A는 C 의 기능 사용 가능
	// 상속은 여러개의 class가 공통된 요소를 필요로 할 때, 공통분모의 class를 만들어 상속받는다. 설계시 고려, 상속의 목적
	// main class는 상속받지 않는다 (받을 수는 있으나,)
	public static void main(String[] args) 
	{
		Car c = new Car(); //생성자가 없기 때문에 객체만 만든다.
		Audi au = new Audi(); //부모에게 생성자가 있을 경우, 부모의 생성자와 자식의 생성자를 함께 호출
		Bmw bm = new Bmw();
		Benz be = new Benz();

		System.out.println(c); //이상한 코드로 출력되는 이유는?
		System.out.println(au); // 객체가 생성되었음을 의미, 메모리 어딘가에 생성.
		System.out.println(bm);
		System.out.println(be);

		c.printAttributes(); 
		au.printAttributes(); //상속받은 class Car 의 메소드를 사용 할 수 있다. 
		bm.printAttributes();
		be.printAttributes();
	}
}
