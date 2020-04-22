class ConExam
{
	String hak;
	String name;
	int jum;


void title(){
	System.out.println("자바의 생성자");
}
public ConExam(){
	hak = "213";
	name = "java";
	jum = 80;
}
public ConExam(String con_hak){
	hak = con_hak;
	name = "babo";
	jum = 95;
}
public ConExam(String con_hak, String con_name){
	hak=con_hak;
	name=con_name;
	jum = 95;
}
void show(){
	System.out.println(hak + "     " + name + "     " + jum);
 }
}

class ConExamMain 
{
	public static void main(String[] args) 
	{
		ConExam c1 = new ConExam();
		ConExam c2 = new ConExam("1234567");
		ConExam c3 = new ConExam("98765432","goo");
		c1.title();
		c1.show();
		c2.show();
		c3.show();
		int a = c1.jum;
		System.out.println(a);
	}
}
