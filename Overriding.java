class SuperClass
{
	int num;
	String str = "String in SuperClass";
	SuperClass(){
	 System.out.println("������ SuperClass() ȣ��");
	}
	public void methodZero(){
	  System.out.println("methodZero()�޼ҵ�");
	  System.out.println("num" + num + "\t"+"str"+str);
	}
	void methodOwn(){
	  System.out.println(" methodOwn()�޼ҵ�");
	  System.out.println("num" + num + "\t"+"str"+str);
	}
}

class SubClass extends SuperClass
{
	SubClass(){
	 str = "subClass�� �����ڰ� �Է��� String";
	 System.out.println("������  subClass()ȣ��");
}
   public void methodZero(){
	  System.out.println("subClass��ü methodZero()�޼ҵ�");
	  System.out.println("num" + num + "\t"+"str"+str);
	}
  int methodTwo(int a){
	  num = a;
	  System.out.println("subClass��ü methodTwo()");
	  System.out.println("num" + num + "\t"+"str"+str);
	  return num;
	}
	String methodThree(String s, int k){
		num =k ;
	    str  = s;
		System.out.println("subClass��ü methodThree()");
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
		//sp.methodTwo(2); //�θ�� �ڽ�Ŭ���� ��� �Ұ�
		//sp.methodThree(3, "MetodOverriding");
		System.out.println("====================");

     	sb.methodZero();
		sb.methodOwn();
		sb.methodTwo(2222);
	//	sb.methodThree(2223, "�� MetodOverriding");
		System.out.println("====================");
	}
}
