package cn.itcast6;
/*
 * ת��
 * 
 * ����ת��
 * 		int a = 10;
 * 		double b  = a;(�Զ�����ת��)
 * 		//��̬�����������ת��
 * 		Fu fz = new Zi();
 * 
 * 
 * ����ת��
 * 		double b = 10.1;
 * 		int a = (int)b; ǿ������ת��
 * 		
 * 		Fu fz = new Zi();
 * 		Zi	z	=(Zi)fz;
 */
public class Test {

	public static void main(String[] args) {
		//��̬��������ת��
		Fu fz = new Zi();
		//���õ��Ǹ��෽�� ����������д����
		fz.method();
		//��̬ʱ�޷������������з���
		//fz.method2();
		
		//Ҫ������������з��� ����ת��
		Zi zi = (Zi)fz;
		//����ת�ͺ���Ե����������й���
		zi.method2();
		
		System.out.println("-----------");
		//�����Ǹ��� ������ת���ɶ���
		Fu fu = new Fu();
		Zi z =(Zi)fu;//����ת���쳣
		
	}
}
