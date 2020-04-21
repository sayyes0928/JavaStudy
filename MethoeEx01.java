class MethoeEx01 
{
	public void sub1(){
	System.out.println("Welcome to JAVA!");
	System.out.println("JAVA is very fun!\n");
	}

	public void sub2(int a, int b){
	int c;
	c = a+b;
	System.out.println(a+"+" + b +"=" +c);
	}

	public double sub3(int m, int n){
	 double k;
	 k = m+n;
	 System.out.println(m + " + " + n + "=" + k);
	 return k;
	}
	public static void main(String[] args) //메인 메소드는 보편적으로 생성 할 메소드 아래에 위치시킨다.
	{
		double w, z;
	    MethoeEx01 ken = new  MethoeEx01();
		System.out.println("****method result******");
		ken.sub1();
		ken.sub2(30,50);
		w = ken.sub3(40,50);
		z = w + 100;
		System.out.println("sub3(x,y)=" + w + ",z=" +z);

	}
}
