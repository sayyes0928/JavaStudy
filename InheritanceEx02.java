class A2A
{
	private int a = 15; //�ʱ� �� ����. ������ ȣ��� �ش� �ν��Ͻ� ������ ���� �� ���, ���� �����Ѵ�.
	static int c = 15;
	A2A(){
	a = 50;
	System.out.println("���" + a);
	a = 25;
    System.out.println("���" + a);
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
		System.out.println(A2A.c); //static ������ Ŭ������.�����̸�

 // class A extends Scanner
		A(){
		  super(System.im); //�θ��� ��ĳ���� ������ �Ű������� System.in �� �־�� �ش� �����ڸ� ���� �� �� �ִ�.

		}

		 void method(){
		  int i = nextInt();
		 }

		 //�����ε� : �ϳ��� Ŭ�������� ���� �̸�(�μ��� ������ �޶���Ѵ�)�޼ҵ带 ������ ����� ���°�
		 //�������̵� : �θ�Ŭ�����ȿ� ���ǵ� �޼ҵ带 �ڽ�Ŭ�������� ���Ӱ� �����ϴ� ��.
		 // �޼ҵ� �̸�, ���ϰ�, �μ��� ������ ���ƾ��Ѵ�
	}
}