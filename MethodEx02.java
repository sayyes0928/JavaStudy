class MethodEx02 
{
	public int methodExam01(int a1){
	int a = 2;
	System.out.println("methodExam01이 호출되었습니다.");
	System.out.println(a1);
	return a;
	}

	public String methodExam02(String b1, int b2){
	String  b = b1 + "바보";
	System.out.println("methodExam02이 호출되었습니다.");
	System.out.println(b1 + "바보");
	return b;
	}

	void methodExam03(int c1, String c2){
	System.out.println("methodExam03이 호출되었습니다.");
	}

	public double methodExam04(int d1, double d2, int d3){
    double d = 3.0;
	System.out.println("methodExam04이 호출되었습니다.");
	return d;
	}

	
	public static void main(String[] args) 
	{ 
		MethodEx02 call = new MethodEx02();
		String k = "김석원"; // k에 "김석원" 을 담는 이유는, k가 포함된 문자열에서 값을 변경하고 싶을 때,
		                           // 각각의 값을 변경 할 필요가 없이, 선언한 변수의 값만 바꾸면 되기 때문
		int call01 = call.methodExam01(2);
		String call02 = call.methodExam02("k", 91);
		call.methodExam03(2, "k");
		double call03 = call.methodExam04(2, 3.0, 2);

		System.out.println("반환값 : "+ call01);
		System.out.println("반환값 : "+ call02);
		System.out.println("반환값 : "+ call03);

	}
}
