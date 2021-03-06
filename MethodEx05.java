class MethodEx05
{
	public void aa(int i){
		System.out.println("aa 호출됨");
	}
	public void bb(int...i){ // 가변인자, 매개변수의 수에 따라 변한다.
		System.out.println("\n====bb호출");
		for (int a : i)
		{
			System.out.println(a+"\t");
		}
		System.out.println();

	}
	public void cc(String...s){
		System.out.println("\n====cc호출");
		for (String str : s)
		{
			System.out.println(str+"\t");
		}
		System.out.println();
	}
	public void dd(Object...ob){ //모든 걸 담아줄 수 있는 자료형 Object
		                                  // 하지만 구조상 제일 위에 있을뿐 섞어서 사용

for (Object obj : ob)
		{
			System.out.println(obj+"\t");
		}
		System.out.println();

		System.out.println("\n====dd호출");
	}
	public void ee(int i, String...s){ //또는 한쪽만 사용
		for (String kt : s)
		{
			System.out.println(kt+"\t");
		}
		System.out.println();
		System.out.println("ee호출");
	}
	public static void main(String[] args) 
	{
		MethodEx05 ve = new MethodEx05();
		ve.aa(3);
		ve.bb();
		ve.bb(1,2);
		ve.bb(3,4,5);
		ve.cc("String");
		ve.cc("String1","String2");
		ve.dd();
		ve.dd(3,2,"hello","haha");
		ve.dd(2.5,'a',"hoho",7);
		ve.ee(2);
		ve.ee(3,"a","b","c");

	}
}
