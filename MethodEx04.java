class MethodEx04 
{
	int setOverload(int a){
	int a1 = a + 10;
	System.out.println("(Int)�����ε� 1�� ���");
	System.out.println("  - ���ϰ� : " + a1);
	return a1;
	}

	String setOverload(){
	String b1 = "�Ű����� ����";
	System.out.println("(String)�����ε� 2�� ���");
	System.out.println("  - ���ϰ� : " + b1);
	return b1;
	}

	boolean setOverload(boolean c1){
	boolean c = true;
	System.out.println("(Boolean)�����ε� 3�� ���");
	System.out.println("  - ���ϰ� : " + c);
	return c;
	}

	String setOverload(String d1, String d2){
	String d = d1 + " + " + d2;
	System.out.println("(String2)�����ε� 4�� ���");
	System.out.println("  - ���ϰ� : " + d);
	return d;
	}

	void getOverload(){
	System.out.println("(void)�����ε� 5�� ���");
	System.out.println("  - ���ϰ� : " + "����");
	}

	char getOverload(String e1){
	char e = 'B';
	System.out.println("(char)�����ε� 6�� ���");
	System.out.println("  - ���ϰ� : " + e);
	return e;
	}

	String getOverload(String f1, String f2){
	String f = f1 + f2;
	System.out.println("(String3)�����ε� 7�� ���");
	System.out.println("  - ���ϰ� : " + f);
	return f;
	}

	double getOverload(double g1){
	double g = 1.1;
	System.out.println("(Double)�����ε� 8�� ���");
	System.out.println("  - ���ϰ� : " + g);
	return g;
	}

	public static void main(String[] args) 
	{
		MethodEx04 om = new MethodEx04();
		int a = om.setOverload(5);
		String re = om.setOverload();
		boolean c = om.setOverload(false);
		String d = om.setOverload("A", "java");
		om.getOverload();
     	char ch = om.getOverload("Hello");
		String f = om.getOverload("aa", "BB");
		double g = om.getOverload(5.2f);
		System.out.println("=========================================");
		System.out.println("���ϰ��� : " + a);
		System.out.println("���ϰ��� : " + re);
		System.out.println("���ϰ��� : " + c);
		System.out.println("���ϰ��� : " + d);
		System.out.println("���ϰ��� : " + "����");
		System.out.println("���ϰ��� : " + ch);
		System.out.println("���ϰ��� : " + f);
		System.out.println("���ϰ��� : " + g);

	}
}