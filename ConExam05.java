import java.util.Scanner;

class ConExam05 
{
	static int maxOf(int[] a){  // static 이 붙어있으면 class이름. ~ 로 사용 , 같은 클래스 내에 속해있을 때에는 바로 호출해서 사용가능
	  int max = a[0];      //int[] a = 19#에서 입력한 값
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
		System.out.println("인원수는? : ");
		int person = stdin.nextInt();

		int [] height = new int [person]; //-> 입력된 값이 int[] a 에 담긴다 5#으로  
		int [] weight = new int [person];

		System.out.println(person + "명의 신장과 체중을 입력하시오");

		for (int i = 0; i <person ;i++ )
		{
			System.out.println( (i+1) + "번의 신장 : ");
			height[i] = stdin.nextInt();
			System.out.println( (i+1) + "번의 체중 : ");
			weight[i] = stdin.nextInt();
		}
		System.out.println("가장 키가 큰 사람의 신장 : "  + maxOf(height) + "cm");
		System.out.println("가장 뚱뚱한 사람의 체중 : " + maxOf(weight)+ "kg");


	}
}


