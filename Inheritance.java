class Car
{
	/*pulibc */ /*private*/ protected String carname;  // public -> private �� ����� ���� �Ұ�, ��� �޾Ҿ ��� �Ұ�, ������ ������ ��� �������� ���� �ȵ�
	public int cost;              // Audi class ���� Car class�� parivate ��� �Ұ�
	Car(){  //�����ڴ� �ڽĿ��� ��� �ȵȴ�.
	 System.out.println("�θ� ������"); // �ڽ��� ��ü�� ������� ��, �� �� ����ȴ�. �����̾�׷����� ����
	}
	protected void printAttributes(){  // ��ӹ���(�ڽ�) class �� ��� �����ϰ� ����, �ܺ� Ŭ���������� ��� �Ұ�
	  System.out.println("carname = " + carname + "\tcost = " + cost);
	}
}

class Audi extends Car
{
	public Audi(){ // �Ű������� ���� �� ������, ������ ����.
		// �θ�Ŭ���� ������ ȣ���� �����Ǿ��ִ�. �ڽ��� ������ ù �ٿ� ������ ȣ��
		System.out.println("�ڽ� ������");
	 carname = "Audi"; //��ӹ��� Car �� carname
//	 super.carname = "Audi"; �� ����. ��ӹ��� class�� ��Ҹ� ����� ��.
	 this.cost = 20000; //
	}
}

class Bmw extends Car
{
	int a = 10;  // �θ� ( Car ) �� �ڽ�( Bmw )�� ��Ҹ� �� �� ����. (���ٺҰ�, �Ϲ�����)
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

public class  Inheritance  //class �տ� publid �� ���̴� ���� �ȵȴ�.
                               // main �� ����ִ� class �տ� public �� �ٿ� �������� ��Ÿ���ش�.
{                             // ������ �ʴ´ٰ� ������ �Ǵ°� �ƴ�����, ��� Ŭ������ ���̴°� �ȵȴ�.
	// ���߻�� �Ұ�  ex) class A extends B, C -> (X)
	// But, ��ӹ޴� class�� �θ�class�� ���� ���, �ش� class�� ��ɵ� ��� ����
	// ex) A extends B  , B extends C ,,�϶� A�� C �� ��� ��� ����
	// ����� �������� class�� ����� ��Ҹ� �ʿ�� �� ��, ����и��� class�� ����� ��ӹ޴´�. ����� ����, ����� ����
	// main class�� ��ӹ��� �ʴ´� (���� ���� ������,)
	public static void main(String[] args) 
	{
		Car c = new Car(); //�����ڰ� ���� ������ ��ü�� �����.
		Audi au = new Audi(); //�θ𿡰� �����ڰ� ���� ���, �θ��� �����ڿ� �ڽ��� �����ڸ� �Բ� ȣ��
		Bmw bm = new Bmw();
		Benz be = new Benz();

		System.out.println(c); //�̻��� �ڵ�� ��µǴ� ������?
		System.out.println(au); // ��ü�� �����Ǿ����� �ǹ�, �޸� ��򰡿� ����.
		System.out.println(bm);
		System.out.println(be);

		c.printAttributes(); 
		au.printAttributes(); //��ӹ��� class Car �� �޼ҵ带 ��� �� �� �ִ�. 
		bm.printAttributes();
		be.printAttributes();
	}
}