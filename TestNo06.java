class Student
{  // ���� Ÿ�� ����
    String hak; 
	String a;
	int a2;
	int a3;
	int a4;
	int total;
	float avg;

	void input(String hak, String a, int a2, int a3, int a4){ //���� ���� �޼ҵ�
		this.hak = hak; //�ش� Ŭ������ ���� ����ϰڴ�.
		this.a = a;
		this.a2 = a2;
		this.a3 = a3;
		this.a4 = a4;
		total(); // ���� Ŭ���� �ٸ� �޼ҵ带 ȣ��
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
		System.out.println("�й�"+"\t"+"\t"+"�̸�"+"\t"+"\t" +"java"+" "+"fortran" +" "+"cobol"+" "+"total"+" "+"average");
		System.out.println("=================================");
		
		Student stu[] = new Student[5];
			for (int k = 0; k< 5 ; k++)
			{
			 stu[k] = new Student();
			}		

		 stu[0].input("0001","������",99,88,77);  // �迭�� �� �ֱ�  ****!!!!! sut[] = stu[].input();  �ƴ�!!!!!*****
		 stu[1].input("0002","������",100,90,95);
		 stu[2].input("0003","������",70,85,90); /// ****!!!!! sut[] = stu[].input();  �ƴ�!!!!!*****
		 stu[3].input("0004","������",60,65,70);
		 stu[4].input("0005","�۾���",80,80,80);

		Student temp[] = new Student[1];

		for (int j =0 ; j<4 ; j++) // arr[0] = 10 �϶�
		{
			for (int i = j; i <5 ; i++)
			{                            				                         
				if (stu[j].total>stu[i].total)  //ũ�⸦ ���ϱ� ���ؼ� ���� ���������Ѵ�
				{
					temp[0] = stu[j];			// �迭�� �迭�� ���� �� �ִ�. �� ������ ���������Ѵ�
					stu[j] = stu[i];				//�迭 �ȿ� ����ִ� �ڷ��� ���¿� ���� �޶�����              
					stu[i] = temp[0];					                   
				}
			}
		}
		System.out.println("===== ���� ��  �� =====");
		for (int k=0; k<5; k++)
		{
			stu[k].show();
	    }
	}
}
