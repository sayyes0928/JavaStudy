class ArrayEx02 
{
	public static void main(String[] args) 
	{

		//����
		// �� ������ Ȱ���� ���� ����Ī
		int temp,k;
		int [] arr = {10,50,30,40,22};
		System.out.println("=====���� �� ��=====");
		for (k=0; k<5; k++)
		{
			System.out.println(arr[k]+" ");
		}
		for (int j =0 ; j<4 ; j++) // arr[0] = 10 �϶�
		{
			for (int i = j; i <5 ; i++) // arr[0] 10 vs arr[0] 10,    arr[0] 10 vs arr[1] 50
			{                            // arr [0] 50 vs arr[2] 30,    arr[0] 50 vs arr [3] 40 , arr [0] 50 vs arr[4] 22
				                         // arr[1] 10 vs arr[2] 30
				if (arr[j]<arr[i]) //  arr[0] 10 vs arr[1] 50
				                      // arr[1] 10 vs arr [2] 30
				{
					temp = arr[j]; // temp = 10 
					                    // temp = 10
					arr[j] = arr[i];// arr[j] = 50  -> arr[0] �� 10���� 50���� ��ȯ
					                   // arr[1] = 30
					arr[i] = temp;// arr[i] = temp = 10 -> arr[1] �� 50���� 10���� ��ȯ
					                   //arr [2] = 10  arr[k] = {50,30,10,40,22}
				}
			}
		}
		System.out.println("===== ���� ��  �� =====");
		for (k=0; k<5; k++)
		{
			System.out.println(arr[k]+" "); // arr[0] = 50, arr[1] = 10 �� ���
		}
 }
}