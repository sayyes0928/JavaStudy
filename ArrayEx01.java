class  ArrayEx01
{
	public static void main(String[] args) 
	{
		
		int data[] = {67,54,11,34,99,87,21,44,73,2};// 0~9������ �迭 ����
		int i, max, min, hap=0; 
		int ran = (int)(Math.random()*10); //� ���̵� ������ٴ� ���� �����ֱ� ���� ��

		System.out.println("****rseult**** \n");
	
		max=data[ran]; //data[0]; ���� �⺻ �� ����, � ���̵� ��� ����.
		min=data[ran];
		
		for (i=0;i<10; i ++) //0~9���� ��� �迭�� �ݺ��Ѵ�.
		{
			if(max < data[i]){ //�ش� ������ ���� max�� data[i]���� ū ���� ��ȯ�ȴ�.
				max = data[i];
			}
			if (min > data[i]){
				min = data[i];
			}
			hap += data[i]; //hap �� data[]�� �ִ´�.
		}
		System.out.println("minimum == " + min);
		System.out.println("maximum == " + max);
		System.out.println("total == " +hap);
	}
}