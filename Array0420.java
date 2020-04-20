class Array0420
{
	public static void main(String[] args) 
	{
		//배열선언
		//자료형 [] 배열명 = new (동일한)자료형 [갯수];
	/*	int [] f = new int[2];
			f[]  = 100; //배열 안의 변수를 입력하는 방법
		                  // 번지 ,이름이 아닌 변수
						  // 시작시 번지를 찍어놓고 시작하는 것이 좋다
						  // 배열은 0번부터 시작
						  // 배열 사용시 번지 표시
                          // ****배열 사용시 반복문(for)사용
						 
						  f[0] = 100 ;
						  f[1] = 200 ;
				for (int) i dx <5  ;idx ;idx++ )
				{
					System.out.prineln(f[idx]); 
				}
*/
				//사이즈 5인 double 형 배열 선언, 값지정 -> 출력
				double [] d = new double [5]; // 공간 생성
					d[0] = 1.0; // 생선된 공간에 값 입력
					d[1] = 2.0;
					d[2] = 3.0;
					d[3] = 4.0;
					d[4] = 5.0;
					for (int x = 0; x <d.length ; x++ ) //배열의 번지를 쓰기위해 **int x를 double과 헷갈리지 않도록한다.
					{
					System.out.println("double형 출력값 : " + d[x]);
					}
					
				char [] c = new char [5];
					c[0] = 'a';
					c[1] = 'b';
					c[2] = 'c';
					c[3] = 'd';
					c[4] = 'e';
					for (int x = 0; x <c.length ; x++ ){ //반복문에 배열을 넣어 배열안의 값을 출력. 반복작업을 줄인다.
					System.out.println("char형 출력값 : " + c[x]);
					}
				String [] s = new String [5];
					s[0] = "가나다";
					s[1] = "라마바";
					s[2] = "사아자";
					s[3] = "차카타";
					s[4] = "파하";
					for (int x = 0; x <s.length ; x++ ){
					System.out.println("String형 출력값 : " + s[x]);
					}
	}
}
