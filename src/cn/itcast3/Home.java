package cn.itcast3;
/*
 * ���������
 * 
 * һ��ʹ�ø������û�ӿڵĵط� �����Դ������������
 * 
 * 
 */
public class Home {

	
//	public void eatAtHome(Dog d){
//		System.out.println("�ڼҳԷ���");
//		d.eat();
//	}
//	
//	
//	public void eatAtHome(Cat c){
//		System.out.println("�ڼҳԷ���");
//		c.eat();
//	}
	//�����Ĳ�����Animal Animal�ǳ����� �����ܴ������� �����ǿ��Դ������������
	public void eatAtHome(Animal a){
		System.out.println("�ڼҳԷ���");
		//���󷽷������ܵ��ã� �������ڴ������������󣬵��õ���������д��ķ���
		a.eat();
	}
	
	
	//�����Ĳ�����LookHome�ӿڣ����ܴ������󣬵��ǿ��Դ�����ʵ�������
	public void lookHome(LookHome lk ){
		System.out.println("������");
		lk.lookDoor();
		lk.lookWindow();
	}
	
	
}
