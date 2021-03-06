class AccountTester01
{
	String name;
	String no;
	long balance;
	
//	private void printShow(){ //  private는 속해있는 class 안에서만 사용 가능하다.
    void printShow(){ //출력
	System.out.println(" 계좌명의 : " + name);
	System.out.println(" 계좌번호 : " + no);
	System.out.println(" 예금잔고 : " + balance);
	}
}



class Account  // 객체를 만들기위한  틀, 속성(변수)과 동작(메소드)으로 이루어져있음.
{
	public static void main(String[] args) 
	{
		AccountTester chul = new AccountTester(); // 철수의 데이터를 담을 객체 생성
		AccountTester young = new AccountTester();

		chul.name = "철수"; // AccountTester class (다른 클래스) 의 변수들에 값을 넣는다.
		chul.no = "123456"; // 객체는 해당 클래스 안의 권한을 갖는다
		chul.balance = 1000;

		young.name = "영희";
		young.no = "654321";
		young.balance = 200;

		chul.balance -= 200; //객체에 담긴 값을 수정. 휘발성이 아니라 데이터가 유지됨
		young.balance += 100;
		
		chul.printShow(); //객체 안의 메소드 호출
		young.printShow();


	}
}
