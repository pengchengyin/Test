package cn.itcast5;

public class Zi extends Fu{
	
	String name = "子类名字";
	int age = 18;

	@Override 
	public void method(){
		System.out.println("子类重写父类方法");
	}
	
	public void method2(){
		System.out.println("子类特有方法");
	}
}
