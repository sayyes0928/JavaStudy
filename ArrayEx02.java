class ArrayEx02 
{
	public static void main(String[] args) 
	{

		//정렬
		// 세 변수를 활용해 값을 스위칭
		int temp,k;
		int [] arr = {10,50,30,40,22};
		System.out.println("=====실행 전 값=====");
		for (k=0; k<5; k++)
		{
			System.out.println(arr[k]+" ");
		}
		for (int j =0 ; j<4 ; j++) // arr[0] = 10 일때
		{
			for (int i = j; i <5 ; i++) // arr[0] 10 vs arr[0] 10,    arr[0] 10 vs arr[1] 50
			{                            // arr [0] 50 vs arr[2] 30,    arr[0] 50 vs arr [3] 40 , arr [0] 50 vs arr[4] 22
				                         // arr[1] 10 vs arr[2] 30
				if (arr[j]<arr[i]) //  arr[0] 10 vs arr[1] 50
				                      // arr[1] 10 vs arr [2] 30
				{
					temp = arr[j]; // temp = 10 
					                    // temp = 10
					arr[j] = arr[i];// arr[j] = 50  -> arr[0] 을 10에서 50으로 변환
					                   // arr[1] = 30
					arr[i] = temp;// arr[i] = temp = 10 -> arr[1] 을 50에서 10으로 변환
					                   //arr [2] = 10  arr[k] = {50,30,10,40,22}
				}
			}
		}
		System.out.println("===== 실행 후  값 =====");
		for (k=0; k<5; k++)
		{
			System.out.println(arr[k]+" "); // arr[0] = 50, arr[1] = 10 을 출력
		}
 }
}
