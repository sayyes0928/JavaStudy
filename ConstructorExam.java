class Puppy
{
	String str;
	int i;
    public Puppy(){
	  System.out.println("������ public Puppy() ȣ��Ǿ����ϴ�!");
	  printPuppyName(); // �ٷ� ȣ��
	  this.str = "�޸�"; //this (�����ִ� class�� ����)
	  this.i = -98998;
}
    public void printPuppyName(){
	  System.out.println("printPuppyName() ȣ��Ǿ����ϴ�.");
	  System.out.println("���� str = " + str + ",i  = "+ i);
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
