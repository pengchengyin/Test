package cn.itcast3;

public class Dog extends Animal implements LookHome{

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

	@Override
	public void lookWindow() {
		System.out.println("����������");
		
	}

}
