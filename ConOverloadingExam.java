class ConExam01
{
	int A;

 	ConExam01(){
	  System.out.println("1��");
	  this.A = 0;
	}
	ConExam01(String a){
	 System.out.println("2��");
	}
	ConExam01(String b, String c){
	 System.out.println("3��");
	}
	ConExam01(char d){
	 System.out.println("4��");
	}
	ConExam01(boolean e){
	 System.out.println("5��");
	}
	void show(){
		System.out.println(A);
	}
}

class ConOverloadingExam 
{
	public static void main(String[] args) 
	{
		ConExam01 p1 = new ConExam01();
		System.out.println("========1�� �Ϸ� =========");

	    ConExam01 p2 = new ConExam01("A");
		System.out.println("========2�� �Ϸ� =========");

	    ConExam01 p3 = new ConExam01 ("Java","Hi");
		System.out.println("========3�� �Ϸ� =========");

		ConExam01 p4 = new ConExam01('F');
		System.out.println("========4�� �Ϸ� =========");

		ConExam01 p5 = new ConExam01(true);
		System.out.println("========5�� �Ϸ� =========");

		p1.show();


	}
}
