class Puppy
{
	String str;
	int i;
    public Puppy(){
	  System.out.println("생성자 public Puppy() 호출되었습니다!");
	  printPuppyName(); // 바로 호출
	  this.str = "메리"; //this (속해있는 class의 변수)
	  this.i = -98998;
}
    public void printPuppyName(){
	  System.out.println("printPuppyName() 호출되었습니다.");
	  System.out.println("변수 str = " + str + ",i  = "+ i);
}

}

class ConstructorExam 
{
	public static void main(String[] args) 
	{
		Puppy p = new Puppy();
		p.printPuppyName();

	}
}
