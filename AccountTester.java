class  AccountTester
{
	public static void main(String[] args) 
	{
		String chulName = "ö��";
		String chulNo ="123456";
		long chulBalance = 1000;

		String younglName = "����";
		String youngNo ="654321";
		long youngBalance = 200;

		chulBalance -= 200;
		youngBalance += 100;

		System.out.println(" * ö���� ����");
		System.out.println(" ���¸��� : " + chulName);
		System.out.println(" ���¹�ȣ : " + chulNo);
		System.out.println(" �����ܰ� : " + chulBalance);


		System.out.println(" * ������ ����");
		System.out.println(" ���¸��� : " + younglName);
		System.out.println(" ���¹�ȣ : " + youngNo);
		System.out.println(" �����ܰ� : " + youngBalance);


	}
}
