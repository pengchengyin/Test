package cn.itcast7;

import cn.itcast2.Fu;

/*
 * instanceOf 
 * 
 * �ж�ĳ������ �Ƿ����� ĳ������
 * boolean b = ����  instanceOf ��������;
 * ���ڷ���true ������ ����false
 */
public class Test {

	public static void main(String[] args) {
//		Animal a = new Cat();
//		method(a);
		
		Animal d = new Dog();
		method(d);
		
		
	}
	public static void method(Animal a){
		
		if(a instanceof Cat){
			
			//����������ת�ͳ�è
			Cat c =(Cat)a;
			c.catchMouse();
		}else{
			System.out.println("����è");
		}
	}
}
