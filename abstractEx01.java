abstract class Shap
{ 
	abstract void draw();
}
class Poin extends Shap
{
	Poin(){} // ������
	void draw(){ // �������̵�
	 System.out.println("kkkk");
	}
}
class Rect extends Shap
{
	private int width;
	private int height;

	Rect(int width, int height){//������
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
		Shap[] a = new Shap[2]; //�迭�� �����, ��ü�� ������� �ƴϴ�.
		a[0] = new Poin();  //�θ��� �迭�� �ڽ��� ���� �ִ´�
		a[1] = new Rect(4,3);
		for ( Shap s : a ) // ������ ���� ofr( class x : �迭  ), �迭�� ���� �� ��ŭ �˼� ���� 
		{                      // �������� s �� Ÿ���� ���ƾ� �Ѵ�.
			s.draw();
		}
		System.out.println();
	}
}
