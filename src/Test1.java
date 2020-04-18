import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("국어점수 입력하세요");
		System.out.println("영어점수 입력하세요");
		System.out.println("수학점수 입력하세요");

		int kor = scan.nextInt();
		int eng = scan.nextInt();
		int mat = scan.nextInt();
		int total = kor + eng + mat;
		int avg = total/3;
		
		if (kor >= 50 && eng >=50 && mat >= 50) {
			
			
			System.out.println("각 과목의 점수는");
			System.out.println("국어 : "+ kor);
			System.out.println("영어 : "+ eng);
			System.out.println("수학 : "+ mat);
			System.out.println("세 과목의 총 합은");
			System.out.println(total + "점 입니다.");
			System.out.println("각 과목의 학점은");
			
			if (avg >= 90) {
				System.out.println("A학점 입니다.");
			} else if(avg <90 && avg>=80){
				System.out.println("B학점 입니다.");
			}else {
				System.out.println("F학점 입니다.");
			}
			scan.close();
			
		} else {
			System.out.println("50점이 넘게 다시 입력하세요");
			while(kor<50 && eng<50 && mat<50) {
				 kor = scan.nextInt();
				 eng = scan.nextInt();
			     mat = scan.nextInt();
			     System.out.println("50점이 넘게 다시 입력하세요");
			}
		}
	

	}

}
