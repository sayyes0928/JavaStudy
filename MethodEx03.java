class MethodEx03 
{
	public int methodExam01(int a1, int a2){
	int a = 2;
	System.out.println("Exam01�� �޼ҵ��Դϴ�.");
	return a;
	}

	public String methodExam02(String b1){
	String b = "JAVA";
	System.out.println("Exam02�� �޼ҵ��Դϴ�.");
	return b;
	}

	void methodExam03(int c1, String c2){
		System.out.println("Exam03�� �޼ҵ��Դϴ�.");
		System.out.println("���ϰ��� �����ϴ�.");
	}

	public double methodExam04(double d1, double d2, double d3){
	double d = 2.0;
	System.out.println("Exam04�� �޼ҵ��Դϴ�.");
	return d;
	}

	public static void main(String[] args) 
	{
		MethodEx03 met = new MethodEx03();

		int k = met.methodExam01(33,22);
		System.out.println("���ϰ��� : "+k);
		String s = met.methodExam02("���ϰ��� : "+"java");
		System.out.println("���ϰ��� : "+s);
		met.methodExam03(42,"green");
		double d = met.methodExam04(7, 5.5, 5);
		System.out.println("���ϰ��� : "+d);

	}
}