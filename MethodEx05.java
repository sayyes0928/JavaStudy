class MethodEx05
{
	public void aa(int i){
		System.out.println("aa ȣ���");
	}
	public void bb(int...i){ // ��������, �Ű������� ���� ���� ���Ѵ�.
		System.out.println("\n====bbȣ��");
		for (int a : i)
		{
			System.out.println(a+"\t");
		}
		System.out.println();

	}
	public void cc(String...s){
		System.out.println("\n====ccȣ��");
		for (String str : s)
		{
			System.out.println(str+"\t");
		}
		System.out.println();
	}
	public void dd(Object...ob){ //��� �� ����� �� �ִ� �ڷ��� Object
		                                  // ������ ������ ���� ���� ������ ��� ���

for (Object obj : ob)
		{
			System.out.println(obj+"\t");
		}
		System.out.println();

		System.out.println("\n====ddȣ��");
	}
	public void ee(int i, String...s){ //�Ǵ� ���ʸ� ���
		for (String kt : s)
		{
			System.out.println(kt+"\t");
		}
		System.out.println();
		System.out.println("eeȣ��");
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