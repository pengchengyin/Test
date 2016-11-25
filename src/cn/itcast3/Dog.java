package cn.itcast3;

public class Dog extends Animal implements LookHome{

	@Override
	public void eat() {
		System.out.println("狗吃肉");
	}

	@Override
	public void sleep() {
		System.out.println("狗趴着睡");
	}
	//狗特有功能 看门
	public void lookDoor(){
		System.out.println("狗看门");
	}

	@Override
	public void lookWindow() {
		System.out.println("狗看窗户了");
		
	}

}
