package cn.itcast7;

public class Cat extends Animal{

	@Override
	public void eat() {
		System.out.println("猫吃鱼");
	}

	@Override
	public void sleep() {
		System.out.println("猫躺着睡");
		
	}
	//猫特有功能
	public void catchMouse(){
		System.out.println("猫抓耗子");
	}

}
