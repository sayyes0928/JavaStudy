import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		System.out.println("ù��° ���ڸ� �Է��ϼ���");
		System.out.println("�ι�° ���ڸ� �Է��ϼ���");

		int a = scan.nextInt(); //ù��° �Է� �� ����
		int b = scan.nextInt();//�ι�° �Է� �� ����

		while (true) { // ���� ���ö����� ���ѷ����� false ���� ������
			if (b < a || a < 0 || b < 0) { // �ι�° ���� �� Ŭ ���, ó������ �ǵ��ư���.
				System.out.println("�ι�° ���ڸ� �� ū ���� �Է��ϼ���");
				System.out.println("�Ǵ� 0���� ū ���� �Է��ϼ���");
				a = scan.nextInt();
				b = scan.nextInt();
			} else {
				for (a=a; a <= b; a++) {
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