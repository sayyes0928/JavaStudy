class Saram
{
	String name;
	int age;
	
	void title(){
		System.out.println("<자바 객체 생성(배열이용)>");
		System.out.println("*신상 출력*");
		System.out.println("----------------------");
	}
	int aaa(String a1, int a2){
		int a = a2;
		return a;
	}
/*	public Saram(){
		name = "개길동";
		age = 8;
	}
	public Saram(){
		name = "홍가동";
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
		
		int A = k[0].aaa("헝길동", 35);
		int B = k[1].aaa("개길동", 8);
		int C = k[2].aaa("가길동", 6);

		int total = A+B+C;
		double avg = total/3;
		System.out.println(total);
		System.out.print(avg);

		
	}
}
