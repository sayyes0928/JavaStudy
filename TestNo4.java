class Saram_5_x1
{
	String name;
	int age;
	
	void title(){
		System.out.println("<�ڹ� ��ü ����>");
		System.out.println("*�Ż� ���*");
		System.out.println("----------------------");
	}
	int age(String a1, int a2){
		int k = a2;
		System.out.println();
		return k;
	}
}


class TestNo4 
{
	public static void main(String[] args) 
	{
		Saram[] men = new Saram[3];//��ü�迭 ����

			men[0] = new Saram();
			men[1] = new Saram();
			men[2] = new Saram();

			men[0].name = "���ڹ�";
			men[1].age = 35;


		Saram_5_x1 p1 = new Saram_5_x1(); //��ü ����
		int A = p1.age("ȫ�浿",35);

		Saram_5_x1 p2 = new Saram_5_x1();
		int B = p1.age("���浿",8);

		Saram_5_x1 p3 = new Saram_5_x1();
		int C = p1.age("ȫ����",6);
		
		int total = A+B+C;
		double avg = (double)total/3;
		System.out.println("������ �� ���� : " + total);
		System.out.println("������ ����� : " + avg);
	}
}
