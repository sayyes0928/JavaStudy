import java.util.Scanner;

public class Java01ver2 {

	public static void main(String[] args) {

		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("�� ������ ������ �Է��ϼ���");
			System.out.println("1.����");
			System.out.println("2.����");
			System.out.println("3.����");

			int kor = sc.nextInt();
			int eng = sc.nextInt();
			int mat = sc.nextInt();

			int total = kor + eng + mat;
			int avg = total / 3;

			if (kor < 50 || eng < 50 || mat <50) {
				System.out.println("50�� �̻����� �Է��Ͻʽÿ�.");
				 kor = sc.nextInt();
				 eng = sc.nextInt();
				 mat = sc.nextInt();
			} else {
				System.out.println("�Է��� ������");
				System.out.println("1.���� : " + kor);
				System.out.println("2.���� : " + eng);
				System.out.println("3.���� : " + mat);
				System.out.println("������ : " + total);
				System.out.println("����� : " + avg);
				if (avg >= 90) {
					System.out.println("������ : A����");
				} else if (avg < 90 && avg >= 80) {
					System.out.println("������ : B����");
				} else {
					System.out.println("������ : F����");
				}
				break;
			}
		}
	}
}
