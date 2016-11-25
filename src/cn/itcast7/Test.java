package cn.itcast7;

import cn.itcast2.Fu;

/*
 * instanceOf 
 * 
 * 判断某个对象 是否属于 某种类型
 * boolean b = 对象  instanceOf 数据类型;
 * 属于返回true 不属于 返回false
 */
public class Test {

	public static void main(String[] args) {
//		Animal a = new Cat();
//		method(a);
		
		Animal d = new Dog();
		method(d);
		
		
	}
	public static void method(Animal a){
		
		if(a instanceof Cat){
			
			//将动物向下转型成猫
			Cat c =(Cat)a;
			c.catchMouse();
		}else{
			System.out.println("不是猫");
		}
	}
}
