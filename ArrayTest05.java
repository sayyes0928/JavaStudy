import java.util.*;
class ArrayTest05 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		  
		  int sw = 0; // 플래그 변수
		  int [] arr2 = new int [5]; //배열 사이즈 지정
		  int ran, j; 
		  for (j =0; j<arr2.length ; j++) //배열 범위 지정
		 {	  		 
			 arr2[j] = (int)(Math.random()*10+1); //난수인 배열 
			 // ran = (int)(Math.random()*10+1);
			 // arr2[j] = ran;

		 }
        System.out.println("찾을 숫자를 입력하세요");
	    int input = sc.nextInt();
		
		for (j =0; j<arr2.length ; j++) // 배열에 값을 넣는 것이 아니라, 배열만 나열한다
		 {	  		 
			  if (input == arr2[j])
			   { 
				  sw = 1; // if문으로 출력하기 위한 플래그 변수,  
				 break;  //중복을 잡는다
			   }
		 }
		 if (sw == 1) //변수 값을 지정해 출력할 내용을 정한다.
		 {
			 System.out.println("동일한 값 :" + j + "번째 위치");
		 }else if (sw == 0 )
		 {
		     System.out.println("동일 값 없음");
		 }
              
              
			 


		

		 /* else if (input == arr2[1]){
		     System.out.println("동일한 값 존재" + 1 +"번째 위치");		
			 break;
		 }else if (input == arr2[2]){
		     System.out.println("동일한 값 존재" + 2 +"번째 위치");
			 break;
		}else if (input == arr2[3]){
		     System.out.println("동일한 값 존재" + 3 +"번째 위치");
			 break;
		} else if (input == arr2[4]){
		     System.out.println("동일한 값 존재" + 4 +"번째 위치");
			 break;
		}else if (input == arr2[5]){
		     System.out.println("동일한 값 존재" + 5 +"번째 위치");
			 break;
		}else {
			System.out.println("찾는 값이 없습니다.");
			break;
			*/
		}
		 }


