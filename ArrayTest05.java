import java.util.*;
class ArrayTest05 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		  
		  int sw = 0; // �÷��� ����
		  int [] arr2 = new int [5]; //�迭 ������ ����
		  int ran, j; 
		  for (j =0; j<arr2.length ; j++) //�迭 ���� ����
		 {	  		 
			 arr2[j] = (int)(Math.random()*10+1); //������ �迭 
			 // ran = (int)(Math.random()*10+1);
			 // arr2[j] = ran;

		 }
        System.out.println("ã�� ���ڸ� �Է��ϼ���");
	    int input = sc.nextInt();
		
		for (j =0; j<arr2.length ; j++) // �迭�� ���� �ִ� ���� �ƴ϶�, �迭�� �����Ѵ�
		 {	  		 
			  if (input == arr2[j])
			   { 
				  sw = 1; // if������ ����ϱ� ���� �÷��� ����,  
				 break;  //�ߺ��� ��´�
			   }
		 }
		 if (sw == 1) //���� ���� ������ ����� ������ ���Ѵ�.
		 {
			 System.out.println("������ �� :" + j + "��° ��ġ");
		 }else if (sw == 0 )
		 {
		     System.out.println("���� �� ����");
		 }
              
              
			 


		

		 /* else if (input == arr2[1]){
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
		}else if (input == arr2[5]){
		     System.out.println("������ �� ����" + 5 +"��° ��ġ");
			 break;
		}else {
			System.out.println("ã�� ���� �����ϴ�.");
			break;
			*/
		}
		 }


