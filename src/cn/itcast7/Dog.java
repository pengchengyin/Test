package cn.itcast7;

public class Dog extends Animal {

	@Override
	public void eat() {
		System.out.println("������");
	}

	@Override
	public void sleep() {
		System.out.println("��ſ��˯");
	}
	//�����й��� ����
	public void lookDoor(){
		System.out.println("������");
	}
}
