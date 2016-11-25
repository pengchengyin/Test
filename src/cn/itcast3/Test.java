package cn.itcast3;
/*
 * 测试家类看家的方法
 */
public class Test {

	public static void main(String[] args) {
		Home h = new Home();
		
		Dog d = new Dog();
		//该方法需要的是LookHome接口 传入的是该接口的实现类对象Dog
		//一切使用父类引用的地方都可以传入其子类对象
		h.lookHome(d);
	}
}
