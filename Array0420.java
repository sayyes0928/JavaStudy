class Array0420
{
	public static void main(String[] args) 
	{
		//�迭����
		//�ڷ��� [] �迭�� = new (������)�ڷ��� [����];
	/*	int [] f = new int[2];
			f[]  = 100; //�迭 ���� ������ �Է��ϴ� ���
		                  // ���� ,�̸��� �ƴ� ����
						  // ���۽� ������ ������ �����ϴ� ���� ����
						  // �迭�� 0������ ����
						  // �迭 ���� ���� ǥ��
                          // ****�迭 ���� �ݺ���(for)���
						 
						  f[0] = 100 ;
						  f[1] = 200 ;
				for (int) i dx <5  ;idx ;idx++ )
				{
					System.out.prineln(f[idx]); 
				}
*/
				//������ 5�� double �� �迭 ����, ������ -> ���
				double [] d = new double [5]; // ���� ����
					d[0] = 1.0; // ������ ������ �� �Է�
					d[1] = 2.0;
					d[2] = 3.0;
					d[3] = 4.0;
					d[4] = 5.0;
					for (int x = 0; x <d.length ; x++ ) //�迭�� ������ �������� **int x�� double�� �򰥸��� �ʵ����Ѵ�.
					{
					System.out.println("double�� ��°� : " + d[x]);
					}
					
				char [] c = new char [5];
					c[0] = 'a';
					c[1] = 'b';
					c[2] = 'c';
					c[3] = 'd';
					c[4] = 'e';
					for (int x = 0; x <c.length ; x++ ){ //�ݺ����� �迭�� �־� �迭���� ���� ���. �ݺ��۾��� ���δ�.
					System.out.println("char�� ��°� : " + c[x]);
					}
				String [] s = new String [5];
					s[0] = "������";
					s[1] = "�󸶹�";
					s[2] = "�����";
					s[3] = "��īŸ";
					s[4] = "����";
					for (int x = 0; x <s.length ; x++ ){
					System.out.println("String�� ��°� : " + s[x]);
					}
	}
}
