class Saram
{
	String name;
	int age;
	
	void title(){
		System.out.println("<�ڹ� ��ü ����(�迭�̿�)>");
		System.out.println("*�Ż� ���*");
		System.out.println("----------------------");
	}
	int aaa(String a1, int a2){
		int a = a2;
		return a;
	}
/*	public Saram(){
		name = "���浿";
		age = 8;
	}
	public Saram(){
		name = "ȫ����";
		age = 6;
	}
*/

}

class TestNo5 
{
	public static void main(String[] args) 
	{
		Saram k[] = new Saram[3];
			for (int i = 0; i< k.length ; i++)
			{
			k[i] = new Saram();
			}
		
		int A = k[0].aaa("��浿", 35);
		int B = k[1].aaa("���浿", 8);
		int C = k[2].aaa("���浿", 6);

		int total = A+B+C;
		double avg = total/3;
		System.out.println(total);
		System.out.print(avg);

		
	}
}
