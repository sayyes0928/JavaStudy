class Method 
{
	void method(int val) //�޼ҵ� ����, **2**ȣ��� �޾��� ������ ��ȣ�� ����ش� ( �Ű� ����) ,��Ī
	                           // �ٸ� �޼ҵ�� �����ϴ� �Ű�ü�� �Ǵ� ����
							   // ȣ��� ������ ������ ������ �����.(����, Ÿ��)
							   // ������ �Ű������� �ڷ����� �������ش�. (int val, int val2, String val3...)
	{
		System.out.println("method�Դϴ�.");
		System.out.println("���� value = " + val); //**3** ���� �޼ҵ忡 ��� �Ű����� ���
	}

	int method02() // �̸� : method02, �Ű����� X
	{                  // ==2== �ش� �޼ҵ带 ���������� ���� �� ' return ' �� ����.
		               // return�� ��� ���� ȣ��� ������ ����( 30# �� re)�� ����
		int va = 456;
		System.out.println("Method02 �Դϴ�.");
		System.out.println("���� va = " + va);
		return va;  //��ȯ�� ���� �Ⱦ����� �ִ�.
	}

	public static void main(String[] args) //main �̶�� �̸��� ���� �޼ҵ�
	{
		int value =123; //�������� , ���� ������ ����ִ� ���� �ȿ����� ����
		System.out.println("���α׷� ����");
		System.out.println("���� value = " + value);
		Method test = new Method(); //��ü ����
		test.method(value); // �޼ҵ� ȣ��,  **1**  ( )�� ȣ���ϴ� �޼ҵ�� ������ ���������� �Է�
		                           // �������� ���������� ( , ) �� ������.
		System.out.println("�޼ҵ� ȣ�� �� ����");
		int re = test.method02();   // ==1== �� ������ ó�� ����Ǹ� ȣ��� �޼ҵ�� ���� 12#���� �̵�
	    System.out.println("���� va =" + re);
	}
	
}