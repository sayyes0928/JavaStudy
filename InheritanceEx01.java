class Sup
{
	public Sup(){
	 System.out.println(1);
	}
	public Sup(int i){
	 System.out.println(2);
	}
	public Sup(boolean b){
	 System.out.println(3);
	}
}

class Sub extends Sup
{
	public Sub(){
		super(3); //sper를 사용 할 경우, 제일 첫줄에 사용한다
	 System.out.println(4);
	}
	public Sub(int a){
		this("A"); // 생성자는 첫줄에서 this 를 사용하면, 해당 매개변수를 사용하는 오버로딩 메소드를 호출한다.
	 System.out.println(5);
	}
	public Sub(String s){
		super(true);
	 System.out.println(6);
	}
}
class  InheritanceEx01
{
	public static void main(String[] args) 
	{  //자식은 무조건 부모를 불러야한다. 부모가 생성자가 있으면, 자식도 생성자가 있는것이 좋다.
	//	Sub a = new Sub();   // 상속받았을 경우, 생성자는 부모의 생성자부터 호출된다.
	//	Sub b = new Sub(3);
	//	Sub c = new Sub(true); // 매개변수의 기준은 부모가 아닌, 호출하는 클래스에서 먼저 고른다. 부모클래스 따라서 결정 X
	//	Sub d = new Sub("A");

	}
}
