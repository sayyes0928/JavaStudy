import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		System.out.println("ù��° ���ڸ� �Է��ϼ���");
		System.out.println("�ι�° ���ڸ� �Է��ϼ���");

		int a = scan.nextInt();
		int b = scan.nextInt();

		while (true) {
			if (b < a) {
				System.out.println("�ι�° ���ڸ� �� ū ���� �Է��ϼ���");
				a = scan.nextInt();
				b = scan.nextInt();
			} else {
				for (; a <= b; a++) {
					System.out.println("=========");
					System.out.println(a + "�� ����");

					for (int c = 1; c <= 9; c++) {
						System.out.println(a + "*" + c + "=" + (a * c));
					}
				}
				break;
			}
		}
	}
}
