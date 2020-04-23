abstract class Shap
{ 
	abstract void draw();
}
class Poin extends Shap
{
	Poin(){} // 생성자
	void draw(){ // 오버라이딩
	 System.out.println("kkkk");
	}
}
class Rect extends Shap
{
	private int width;
	private int height;

	Rect(int width, int height){//생성자
	 this.width = width;
	 this.height = height;
	}

	void draw(){
	 for (int i = 1; i <=height; i++)
	 {
		 for (int j = 1;j <=width ;j++ )
		  System.out.println("9");
		 System.out.println();
	 }
	}
}
class abstractEx01

{
	public static void main(String[] args) 
	{
		Shap[] a = new Shap[2]; //배열을 만든것, 객체를 만든것이 아니다.
		a[0] = new Poin();  //부모의 배열에 자식의 값을 넣는다
		a[1] = new Rect(4,3);
		for ( Shap s : a ) // 개선된 루프 ofr( class x : 배열  ), 배열이 가진 수 만큼 알서 돈다 
		{                      // 받으려는 s 의 타입이 같아야 한다.
			s.draw();
		}
		System.out.println();
	}
}
