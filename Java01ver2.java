import java.util.Scanner;

public class Java01ver2 {

	public static void main(String[] args) {

		while (true) {
			Scanner sc = new Scanner(System.in); // Ű���� �Է�
			System.out.println("�� ������ ������ �Է��ϼ���");
			System.out.println("1.����");
			System.out.println("2.����");
			System.out.println("3.����");

			int kor = sc.nextInt(); //�Է¹޴� ���� nextInt(); �� ������ �Է� ���� ��
			int eng = sc.nextInt();
			int mat = sc.nextInt();
			String grade ;
		      
	   	    while(kor < 50 || eng < 50 || mat <50){
		 System.out.println("50�� �̻����� �Է��Ͻʽÿ�.");
				 kor = sc.nextInt();
				 eng = sc.nextInt();
				 mat = sc.nextInt();
		 }
		 int total = kor + eng + mat;
		int avg = total / 3;

     			if (avg >= 90) {
					grade = " A����";					
				} else if (avg < 90 && avg >= 80) {
					grade = " B����";
				} else {
					grade = " F����";
				}

			
			System.out.println("�Է��� ������");
			System.out.println("1.���� : " + kor);
			System.out.println("2.���� : " + eng);
			System.out.println("3.���� : " + mat);
			System.out.println("������ : " + total);
			System.out.println("����� : " + avg);
			System.out.println("������ : " + grade);
			break;
		}
	}
}