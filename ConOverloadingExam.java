class ConExam01
{
	int A;

 	ConExam01(){
	  System.out.println("1번");
	  this.A = 0;
	}
	ConExam01(String a){
	 System.out.println("2번");
	}
	ConExam01(String b, String c){
	 System.out.println("3번");
	}
	ConExam01(char d){
	 System.out.println("4번");
	}
	ConExam01(boolean e){
	 System.out.println("5번");
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
		System.out.println("========1번 완료 =========");

	    ConExam01 p2 = new ConExam01("A");
		System.out.println("========2번 완료 =========");

	    ConExam01 p3 = new ConExam01 ("Java","Hi");
		System.out.println("========3번 완료 =========");

		ConExam01 p4 = new ConExam01('F');
		System.out.println("========4번 완료 =========");

		ConExam01 p5 = new ConExam01(true);
		System.out.println("========5번 완료 =========");

		p1.show();


	}
}
