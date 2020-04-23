class SuperClass
{
	int num;
	String str = "String in SuperClass";
	SuperClass(){
	 System.out.println("생성자 SuperClass() 호출");
	}
	public void methodZero(){
	  System.out.println("methodZero()메소드");
	  System.out.println("num" + num + "\t"+"str"+str);
	}
	void methodOwn(){
	  System.out.println(" methodOwn()메소드");
	  System.out.println("num" + num + "\t"+"str"+str);
	}
}

class SubClass extends SuperClass
{
	SubClass(){
	 str = "subClass의 생성자가 입력한 String";
	 System.out.println("생성자  subClass()호출");
}
   public void methodZero(){
	  System.out.println("subClass객체 methodZero()메소드");
	  System.out.println("num" + num + "\t"+"str"+str);
	}
  int methodTwo(int a){
	  num = a;
	  System.out.println("subClass객체 methodTwo()");
	  System.out.println("num" + num + "\t"+"str"+str);
	  return num;
	}
	String methodThree(String s, int k){
		num =k ;
	    str  = s;
		System.out.println("subClass객체 methodThree()");
	    System.out.println("num" + num + "\t"+"str"+str);
		return str;

	}
}


class Overriding
{
	public static void main(String[] args) 
	{
		SuperClass sp = new SuperClass();
		System.out.println("====================");
		SubClass sb = new SubClass();
		System.out.println("====================");

		sp.methodZero();
		sp.methodOwn();
		//sp.methodTwo(2); //부모는 자식클래스 사용 불가
		//sp.methodThree(3, "MetodOverriding");
		System.out.println("====================");

     	sb.methodZero();
		sb.methodOwn();
		sb.methodTwo(2222);
	//	sb.methodThree(2223, "또 MetodOverriding");
		System.out.println("====================");
	}
}
