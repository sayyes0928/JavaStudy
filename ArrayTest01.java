import java.util.*;
class ArrayTest01 

{
	public static void main(String[] args) 
	{
		//Q1. 10���� �л��� ������ �Է¹޾� ����, ����� ���ϴ� ���α׷� �ۼ�
		//Q2. ������ �̿��� �迭�� ����� 10�� �迭�� ���� ����.  ���� ����(1~10 )
		// '�˻�' ���� ������ ���� �ϳ� �Է� �޴´� -> �Է� ���� ���� ������ ���� �迭 �ȿ� �����ϴ��� ����, ���� ��ġ Ȯ��
       // Q3. ������ �̿��� ����� 5�� �迭�� ���� ����(���� ���� : 1~10)
	   //       ������ ������ �ߺ����� �ʴ´�.
	  
	   
	   //Q1.
	  Scanner sc = new Scanner(System.in);
		int [] arr1 = new int [10]; //�迭 ũ�� ����
	    int total = 0;

		for (int i = 0; i <10 ; i++)
		{
		  int stu = sc.nextInt();
		  arr1[i] = stu;
		  total = total + arr1[i];
		 		}
		 int avg = total/10;
		  System.out.println("����: " + total);
		  System.out.println("��� : " + avg);

          System.out.println();
		  System.out.println();
          System.out.println();
		 //Q2

		 System.out.println("ã�� ���ڸ� �Է��ϼ���");
		 int [] arr2 = new int [5];
         int j;
		 
	 
		  for (j =0; j<5 ; j++)
		 {
			  arr2 [j]= (int)(Math.random()*10+1);
		 }
		 int input = sc.nextInt();

		 for (j =0; j<5 ; j++)
		 {
			if (input == arr2[0])
		 {
			 System.out.println("������ �� ����" + 0 +"��° ��ġ");
			 break;
		 } else if (input == arr2[1]){
		     System.out.println("������ �� ����" + 1 +"��° ��ġ");		
			 break;
		 }else if (input == arr2[2]){
		     System.out.println("������ �� ����" + 2 +"��° ��ġ");
			 break;
		}else if (input == arr2[3]){
		     System.out.println("������ �� ����" + 3 +"��° ��ġ");
			 break;
		} else if (input == arr2[4]){
		     System.out.println("������ �� ����" + 4 +"��° ��ġ");
			 break;
		}else {
			System.out.println("ã�� ���� �����ϴ�.");
			break;
		}
		 }

		
		  
	/*	else{
			 while(input != arr2[j]){
		     System.out.println("ã�� ���� �����ϴ�.");
			 input = sc.nextInt();
		 }
		 }*/
	}
}