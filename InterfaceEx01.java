interface A0A //class�� �ƴϴ�. ������ ����� ������ '����' �Ѵٰ� ǥ��.
                   //inertface �� class�� �ƴϱ� ������ ��ü�� ���� �� �� ����.
				   //������ ��Ӷ����� ������� ��. ����� �θ��� ���Ҹ� �ϱ����� ����
{
	int i;
	void method();  //�߰�ȣ ����, -> ����� ����. ���¸� ������ �����Ͽ� ����Ѵ�
	                     // �ݵ�� ������ class�� ��� �޼ҵ带 ������(�������̵�) ���־���Ѵ�.
}
interface C0C extends A0A // interface ������ ��� ����
{
}

interface D0D extends A0A,C0C  // class�� �ƴϱ� ������ ���߻�� ����
{
}
class X0X
{
}
class B0B extends X0X implements A0A  // '���' -> '����' ����
//interface �� ���� �� ��, implementes
//interface �� ��� �� ��� ����
{
}

class InterfaceEx01 //����Ŭ�����ΰ�ó�� ���̰�
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
