import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("�������� �Է��ϼ���");
		System.out.println("�������� �Է��ϼ���");
		System.out.println("�������� �Է��ϼ���");

		int kor = scan.nextInt();
		int eng = scan.nextInt();
		int mat = scan.nextInt();

		if (kor >= 50 && eng >= 50 && mat >= 50) {
			int total = kor + eng + mat;
			int avg = total / 3;
			System.out.println("�� ������ ������");
			System.out.println("���� : " + kor);
			System.out.println("���� : " + eng);
			System.out.println("���� : " + mat);
			System.out.println("�� ������ �� ����");
			System.out.println(total + "�� �Դϴ�.");
			System.out.println("�� ������ ������");

			if (avg >= 90) {
				System.out.println("A���� �Դϴ�.");
			} else if (avg < 90 && avg >= 80) {
				System.out.println("B���� �Դϴ�.");
			} else {
				System.out.println("F���� �Դϴ�.");
			}
			scan.close();
		} else {
			while (kor < 50 || eng < 50 || mat < 50) {
				System.out.println("50���� �Ѱ� �ٽ� �Է��ϼ���");
				kor = scan.nextInt();
				eng = scan.nextInt();
				mat = scan.nextInt();
			}
			int total2 = kor + eng + mat;
			int avg2 = total2 / 3;
			System.out.println("�� ������ ������");
			System.out.println("���� : " + kor);
			System.out.println("���� : " + eng);
			System.out.println("���� : " + mat);
			System.out.println("�� ������ �� ����");
			System.out.println(total2 + "�� �Դϴ�.");
			System.out.println("�� ������ ������");

			if (avg2 >= 90) {
				System.out.println("A���� �Դϴ�.");
			} else if (avg2 < 90 && avg2 >= 80) {
				System.out.println("B���� �Դϴ�.");
			} else {
				System.out.println("F���� �Դϴ�.");
			}
			scan.close();
		}

	}
}
