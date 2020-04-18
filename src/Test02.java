import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		System.out.println("숫자를 입력하세요");
		System.out.println("두번째 숫자를 입력하세요");

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
				System.out.println("두번째 숫자를 더 큰 수로 입력하세요");
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
