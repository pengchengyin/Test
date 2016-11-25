package cn.itcast8;
/*
 * 笔记本类
 */
public class NoteBook {

	
	public void open(){
		System.out.println("笔记本开机了");
	}
	
	public void close(){
		System.out.println("笔记本关机了");
	}
	//参数是USB接口 接口不能创建对象 但是可以传入其实现类对象
	//接口的引用指向实现类的对象 调用的是usb的抽象方法 运行的是子类重写后的方法
	public void useUSB(USB usb){
		usb.openUSB();
		usb.closeUSB();
	}
}
