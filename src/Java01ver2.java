import java.util.Scanner;

public class Java01ver2 {

	public static void main(String[] args) {

		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("각 과목의 점수를 입력하세요");
			System.out.println("1.국어");
			System.out.println("2.영어");
			System.out.println("3.수학");

			int kor = sc.nextInt();
			int eng = sc.nextInt();
			int mat = sc.nextInt();

			int total = kor + eng + mat;
			int avg = total / 3;

			if (kor < 50 || eng < 50 || mat <50) {
				System.out.println("50점 이상으로 입력하십시오.");
				 kor = sc.nextInt();
				 eng = sc.nextInt();
				 mat = sc.nextInt();
			} else {
				System.out.println("입력한 성적은");
				System.out.println("1.국어 : " + kor);
				System.out.println("2.영어 : " + eng);
				System.out.println("3.수학 : " + mat);
				System.out.println("총점은 : " + total);
				System.out.println("평균은 : " + avg);
				if (avg >= 90) {
					System.out.println("학점은 : A학점");
				} else if (avg < 90 && avg >= 80) {
					System.out.println("학점은 : B학점");
				} else {
					System.out.println("학점은 : F학점");
				}
				break;
			}
		}
	}
}
