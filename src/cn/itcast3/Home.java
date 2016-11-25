package cn.itcast3;
/*
 * 定义个家类
 * 
 * 一切使用父类引用或接口的地方 都可以传入其子类对象
 * 
 * 
 */
public class Home {

	
//	public void eatAtHome(Dog d){
//		System.out.println("在家吃饭了");
//		d.eat();
//	}
//	
//	
//	public void eatAtHome(Cat c){
//		System.out.println("在家吃饭了");
//		c.eat();
//	}
	//方法的参数是Animal Animal是抽象类 ，不能创建对象 ，但是可以传入其子类对象
	public void eatAtHome(Animal a){
		System.out.println("在家吃饭了");
		//抽象方法本身不能调用， 但是由于传入的是子类对象，调用的是子类重写后的方法
		a.eat();
	}
	
	
	//方法的参数是LookHome接口，不能创建对象，但是可以传入其实现类对象
	public void lookHome(LookHome lk ){
		System.out.println("看家了");
		lk.lookDoor();
		lk.lookWindow();
	}
	
	
}
