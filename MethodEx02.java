class MethodEx02 
{
	public int methodExam01(int a1){
	int a = 2;
	System.out.println("methodExam01�� ȣ��Ǿ����ϴ�.");
	System.out.println(a1);
	return a;
	}

	public String methodExam02(String b1, int b2){
	String  b = b1 + "�ٺ�";
	System.out.println("methodExam02�� ȣ��Ǿ����ϴ�.");
	System.out.println(b1 + "�ٺ�");
	return b;
	}

	void methodExam03(int c1, String c2){
	System.out.println("methodExam03�� ȣ��Ǿ����ϴ�.");
	}

	public double methodExam04(int d1, double d2, int d3){
    double d = 3.0;
	System.out.println("methodExam04�� ȣ��Ǿ����ϴ�.");
	return d;
	}

	
	public static void main(String[] args) 
	{ 
		MethodEx02 call = new MethodEx02();
		String k = "�輮��"; // k�� "�輮��" �� ��� ������, k�� ���Ե� ���ڿ����� ���� �����ϰ� ���� ��,
		                           // ������ ���� ���� �� �ʿ䰡 ����, ������ ������ ���� �ٲٸ� �Ǳ� ����
		int call01 = call.methodExam01(2);
		String call02 = call.methodExam02("k", 91);
		call.methodExam03(2, "k");
		double call03 = call.methodExam04(2, 3.0, 2);

		System.out.println("��ȯ�� : "+ call01);
		System.out.println("��ȯ�� : "+ call02);
		System.out.println("��ȯ�� : "+ call03);

	}
}