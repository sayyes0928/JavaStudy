import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		System.out.println("���ڸ� �Է��ϼ���");
		System.out.println("�ι�° ���ڸ� �Է��ϼ���");

		int a = scan.nextInt();
		int b = scan.nextInt();

		if (a < b) {
			for (; a <= b; a++) {
				for (int c = 1; c <= 9; c++) {
					System.out.println(a + "*" + c + "=" + (a * c));
				}
			}
		} else {
			while (a > b) {
				System.out.println("�ι�° ���ڸ� �� ū ���� �Է��ϼ���");
				a = scan.nextInt();
				b = scan.nextInt();
			}
			for (; a <= b; a++) {
				for (int c = 1; c <= 9; c++) {
					System.out.println(a + "*" + c + "=" + (a * c));
				}
			}
		}
	}
}
