class Sup
{
	public Sup(){
	 System.out.println(1);
	}
	public Sup(int i){
	 System.out.println(2);
	}
	public Sup(boolean b){
	 System.out.println(3);
	}
}

class Sub extends Sup
{
	public Sub(){
		super(3); //sper�� ��� �� ���, ���� ù�ٿ� ����Ѵ�
	 System.out.println(4);
	}
	public Sub(int a){
		this("A"); // �����ڴ� ù�ٿ��� this �� ����ϸ�, �ش� �Ű������� ����ϴ� �����ε� �޼ҵ带 ȣ���Ѵ�.
	 System.out.println(5);
	}
	public Sub(String s){
		super(true);
	 System.out.println(6);
	}
}
class  InheritanceEx01
{
	public static void main(String[] args) 
	{  //�ڽ��� ������ �θ� �ҷ����Ѵ�. �θ� �����ڰ� ������, �ڽĵ� �����ڰ� �ִ°��� ����.
	//	Sub a = new Sub();   // ��ӹ޾��� ���, �����ڴ� �θ��� �����ں��� ȣ��ȴ�.
	//	Sub b = new Sub(3);
	//	Sub c = new Sub(true); // �Ű������� ������ �θ� �ƴ�, ȣ���ϴ� Ŭ�������� ���� ������. �θ�Ŭ���� ���� ���� X
	//	Sub d = new Sub("A");

	}
}