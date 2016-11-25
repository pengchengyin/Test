package cn.itcast6;

public class Zi extends Fu{
	
	String name = "子类名字";

	@Override 
	public void method(){
		System.out.println("子类重写父类方法");
	}
	
	public void method2(){
		System.out.println("子类特有方法");
	}
}
