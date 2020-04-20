class ArrayEx03 
{
	public static void main(String[] args) 
	{
		// 배열의 크기를 나중에 결정 할 수 있다는 예시**자바만 가능
		int [] arr;
		int num = (int)(Math.random()*5+1); //배열의 크기 설정, 
		arr = new int [num]; // 랜덤한 배열을 배정 받는다,, *** 자바는 변수값에 해당하는 부분을 쓸 수 있도록 한다.
		                             //num 자리에 특정한 숫자가 들어와야하지만, 자바는 특별히 변수를 넣을 수 있다.
									 // 배열의 수가 가변적인 것이 아니라, 배열의 수를 결정하는 것을 나중에 결정 할 수 있다는 것

		System.out.println(arr.length + " 갯수 ");
		for (int x =0; x<arr.length ; x++) // 0~num 번째 배열까지 값을 랜덤하게 채워 넣는다
		{
			arr[x] =(int)(Math.random()*10); //0~9까지의 랜덤한 수를 배열 순서에 맞추어 값을 넣는다.
			System.out.println(arr[x]);
		}
	}
}
