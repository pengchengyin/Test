package cn.itcast4;
/*
 * 测试普通类多态
 */
public class Test {

	public static void main(String[] args) {
		Fu fu = new Fu();
		fu.method();
		Zi zi = new Zi();
		zi.method();
		System.out.println("----------------");
		//多态
		Fu fz = new Zi();
		//调用的是父类的方法 但是运行的是子类重写后的方法
		
		fz.method();
		
		//fz.method2(); 父类调用不了子类特有的方法
	}
}
