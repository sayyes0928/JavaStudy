class  ArrayEx01
{
	public static void main(String[] args) 
	{
		
		int data[] = {67,54,11,34,99,87,21,44,73,2};// 0~9번까지 배열 생성
		int i, max, min, hap=0; 
		int ran = (int)(Math.random()*10); //어떤 값이든 상관없다는 것을 보여주기 위한 식

		System.out.println("****rseult**** \n");
	
		max=data[ran]; //data[0]; 으로 기본 값 설정, 어떤 값이든 상관 없다.
		min=data[ran];
		
		for (i=0;i<10; i ++) //0~9까지 모든 배열을 반복한다.
		{
			if(max < data[i]){ //해당 과정을 통해 max는 data[i]보다 큰 수로 변환된다.
				max = data[i];
			}
			if (min > data[i]){
				min = data[i];
			}
			hap += data[i]; //hap 에 data[]를 넣는다.
		}
		System.out.println("minimum == " + min);
		System.out.println("maximum == " + max);
		System.out.println("total == " +hap);
	}
}
