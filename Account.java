class AccountTester01
{
	String name;
	String no;
	long balance;
	
//	private void printShow(){ //  private�� �����ִ� class �ȿ����� ��� �����ϴ�.
    void printShow(){ //���
	System.out.println(" ���¸��� : " + name);
	System.out.println(" ���¹�ȣ : " + no);
	System.out.println(" �����ܰ� : " + balance);
	}
}



class Account  // ��ü�� ���������  Ʋ, �Ӽ�(����)�� ����(�޼ҵ�)���� �̷��������.
{
	public static void main(String[] args) 
	{
		AccountTester chul = new AccountTester(); // ö���� �����͸� ���� ��ü ����
		AccountTester young = new AccountTester();

		chul.name = "ö��"; // AccountTester class (�ٸ� Ŭ����) �� �����鿡 ���� �ִ´�.
		chul.no = "123456"; // ��ü�� �ش� Ŭ���� ���� ������ ���´�
		chul.balance = 1000;

		young.name = "����";
		young.no = "654321";
		young.balance = 200;

		chul.balance -= 200; //��ü�� ��� ���� ����. �ֹ߼��� �ƴ϶� �����Ͱ� ������
		young.balance += 100;
		
		chul.printShow(); //��ü ���� �޼ҵ� ȣ��
		young.printShow();


	}
}