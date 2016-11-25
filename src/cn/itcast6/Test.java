package cn.itcast6;
/*
 * 转型
 * 
 * 向上转型
 * 		int a = 10;
 * 		double b  = a;(自动类型转换)
 * 		//多态本身就是向上转型
 * 		Fu fz = new Zi();
 * 
 * 
 * 向下转型
 * 		double b = 10.1;
 * 		int a = (int)b; 强制类型转换
 * 		
 * 		Fu fz = new Zi();
 * 		Zi	z	=(Zi)fz;
 */
public class Test {

	public static void main(String[] args) {
		//多态就是向上转型
		Fu fz = new Zi();
		//调用的是父类方法 运行子类重写方法
		fz.method();
		//多态时无法调用子类特有方法
		//fz.method2();
		
		//要想调用子类特有方法 向下转型
		Zi zi = (Zi)fz;
		//向下转型后可以调用子类特有功能
		zi.method2();
		
		System.out.println("-----------");
		//本来是父亲 不可以转换成儿子
		Fu fu = new Fu();
		Zi z =(Zi)fu;//类型转换异常
		
	}
}
