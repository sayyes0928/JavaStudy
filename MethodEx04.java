class MethodEx04 
{
	int setOverload(int a){
	int a1 = a + 10;
	System.out.println("(Int)오버로딩 1값 출력");
	System.out.println("  - 리턴값 : " + a1);
	return a1;
	}

	String setOverload(){
	String b1 = "매개변수 없음";
	System.out.println("(String)오버로딩 2값 출력");
	System.out.println("  - 리턴값 : " + b1);
	return b1;
	}

	boolean setOverload(boolean c1){
	boolean c = true;
	System.out.println("(Boolean)오버로딩 3값 출력");
	System.out.println("  - 리턴값 : " + c);
	return c;
	}

	String setOverload(String d1, String d2){
	String d = d1 + " + " + d2;
	System.out.println("(String2)오버로딩 4값 출력");
	System.out.println("  - 리턴값 : " + d);
	return d;
	}

	void getOverload(){
	System.out.println("(void)오버로딩 5값 출력");
	System.out.println("  - 리턴값 : " + "없음");
	}

	char getOverload(String e1){
	char e = 'B';
	System.out.println("(char)오버로딩 6값 출력");
	System.out.println("  - 리턴값 : " + e);
	return e;
	}

	String getOverload(String f1, String f2){
	String f = f1 + f2;
	System.out.println("(String3)오버로딩 7값 출력");
	System.out.println("  - 리턴값 : " + f);
	return f;
	}

	double getOverload(double g1){
	double g = 1.1;
	System.out.println("(Double)오버로딩 8값 출력");
	System.out.println("  - 리턴값 : " + g);
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
		System.out.println("리턴값은 : " + a);
		System.out.println("리턴값은 : " + re);
		System.out.println("리턴값은 : " + c);
		System.out.println("리턴값은 : " + d);
		System.out.println("리턴값은 : " + "없음");
		System.out.println("리턴값은 : " + ch);
		System.out.println("리턴값은 : " + f);
		System.out.println("리턴값은 : " + g);

	}
}
