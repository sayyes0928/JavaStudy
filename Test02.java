import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		System.out.println("첫번째 숫자를 입력하세요");
		System.out.println("두번째 숫자를 입력하세요");

		int a = scan.nextInt(); //첫번째 입력 될 변수
		int b = scan.nextInt();//두번째 입력 될 변수

		while (true) { // 답이 나올때까지 무한루프로 false 값을 돌려줌
			if (b < a || a < 0 || b < 0) { // 두번째 값이 더 클 경우, 처음으로 되돌아간다.
				System.out.println("두번째 숫자를 더 큰 수로 입력하세요");
				System.out.println("또는 0보다 큰 수를 입력하세요");
				a = scan.nextInt();
				b = scan.nextInt();
			} else {
				for (a=a; a <= b; a++) {
					System.out.println("=========");
					System.out.println(a + "단 시작");
					for (int c = 1; c <= 9; c++) {
						System.out.println(a + "*" + c + "=" + (a * c));
					}
				}
				break;
			}
		}
	}
}
