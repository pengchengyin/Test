package cn.itcast4;
/*
 * 测试抽象类多态
 */
public class Test02 {

	public static void main(String[] args) {
		//父类引用指向子类对象
		Person p = new Student();
		//父类eat方法为抽象的 但是多态后运行的是子类重写后的方法
		p.eat();
	}
}
