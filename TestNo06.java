class Student
{  // 변수 타입 지정
    String hak; 
	String a;
	int a2;
	int a3;
	int a4;
	int total;
	float avg;

	void input(String hak, String a, int a2, int a3, int a4){ //값을 넣을 메소드
		this.hak = hak; //해당 클래스의 값을 사용하겠다.
		this.a = a;
		this.a2 = a2;
		this.a3 = a3;
		this.a4 = a4;
		total(); // 같은 클래스 다른 메소드를 호출
		avg();
		System.out.println(hak+"\t"+a + "\t" + a2 + "\t"+ a3 + "\t"+ a4+"\t"+total+ "\t" + avg);
	}
	int total(){
		this.total = a2 + a3+a4;
		return total;
	}
	float avg(){
		this.avg = (float)total/3;
		return avg;
	}
	void show(){
	System.out.println(hak+"\t"+a + "\t" + a2 + "\t"+ a3 + "\t"+ a4+"\t"+total+ "\t" + avg);
	}
}

class TestNo06 
{
	public static void main(String[] args) 
	{
		
		System.out.println("=================================");
		System.out.println("학번"+"\t"+"\t"+"이름"+"\t"+"\t" +"java"+" "+"fortran" +" "+"cobol"+" "+"total"+" "+"average");
		System.out.println("=================================");
		
		Student stu[] = new Student[5];
			for (int k = 0; k< 5 ; k++)
			{
			 stu[k] = new Student();
			}		

		 stu[0].input("0001","강아지",99,88,77);  // 배열에 값 넣기  ****!!!!! sut[] = stu[].input();  아님!!!!!*****
		 stu[1].input("0002","구아지",100,90,95);
		 stu[2].input("0003","강가지",70,85,90); /// ****!!!!! sut[] = stu[].input();  아님!!!!!*****
		 stu[3].input("0004","개아지",60,65,70);
		 stu[4].input("0005","송아지",80,80,80);

		Student temp[] = new Student[1];

		for (int j =0 ; j<4 ; j++) // arr[0] = 10 일때
		{
			for (int i = j; i <5 ; i++)
			{                            				                         
				if (stu[j].total>stu[i].total)  //크기를 비교하기 위해서 값이 정해져야한다
				{
					temp[0] = stu[j];			// 배열은 배열로 받을 수 있다. 빈 공간을 만들어줘야한다
					stu[j] = stu[i];				//배열 안에 들어있는 자료의 형태에 따라 달라진다              
					stu[i] = temp[0];					                   
				}
			}
		}
		System.out.println("===== 실행 후  값 =====");
		for (int k=0; k<5; k++)
		{
			stu[k].show();
	    }
	}
}
