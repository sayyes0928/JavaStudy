import java.util.*;

class WapperTst
{
	public static void boxingUnboxing(){
	 int i =10;
	 Integer in = new Integer(i); // boxing  ��ü�� ����ϱ�����
	 Boolean b = new Boolean(false);
	 Long l = new Long("10");
	 int j = in.intValue(); // ��ü�� �Ϲݺ���(�ڷ���)���� ������Ų��
	 boolean bl = b.booleanValue();
	 long lg = l.longValue();
	}

	public static void autoBoxingUnboxing(){ //new �� ���� ��ü�� ����
	 Integer in = 10;
	 Boolean bl = true;
	 int i = in;
	 boolean b = bl;
	}

	public static void StringToWapper(){
	 int r = Integer.parseInt("2030");
	 double d = Double.parseDouble("2030.12");
	 boolean b = Boolean.parseBoolean("false");
	 float f = Float.parseFloat("abcde");
//	 char c = Character.parseChar("a");
	}
}

class abstractEx02 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
