import java.util.Scanner;

class ConExam05 
{
	static int maxOf(int[] a){  // static �� �پ������� class�̸�. ~ �� ��� , ���� Ŭ���� ���� �������� ������ �ٷ� ȣ���ؼ� ��밡��
	  int max = a[0];      //int[] a = 19#���� �Է��� ��
	  for (int i = 1; i < a.length ; i++)
	  {
		  if (a[i]>max)
		     max= a[i];
	  	}
		  return max;	 	  
	}

	public static void main(String[] args) 
	{
		Scanner stdin = new Scanner(System.in);
		System.out.println("�ο�����? : ");
		int person = stdin.nextInt();

		int [] height = new int [person]; //-> �Էµ� ���� int[] a �� ���� 5#����  
		int [] weight = new int [person];

		System.out.println(person + "���� ����� ü���� �Է��Ͻÿ�");

		for (int i = 0; i <person ;i++ )
		{
			System.out.println( (i+1) + "���� ���� : ");
			height[i] = stdin.nextInt();
			System.out.println( (i+1) + "���� ü�� : ");
			weight[i] = stdin.nextInt();
		}
		System.out.println("���� Ű�� ū ����� ���� : "  + maxOf(height) + "cm");
		System.out.println("���� �׶��� ����� ü�� : " + maxOf(weight)+ "kg");


	}
}


