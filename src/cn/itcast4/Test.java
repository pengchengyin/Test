package cn.itcast4;
/*
 * ������ͨ���̬
 */
public class Test {

	public static void main(String[] args) {
		Fu fu = new Fu();
		fu.method();
		Zi zi = new Zi();
		zi.method();
		System.out.println("----------------");
		//��̬
		Fu fz = new Zi();
		//���õ��Ǹ���ķ��� �������е���������д��ķ���
		
		fz.method();
		
		//fz.method2(); ������ò����������еķ���
	}
}
