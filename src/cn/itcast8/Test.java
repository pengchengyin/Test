package cn.itcast8;

public class Test {

	public static void main(String[] args) {
		NoteBook nb = new NoteBook();
		
		nb.open();
		
		Mouse m = new Mouse();
		//需要的是USb接口，可以传其实现类对象
		nb.useUSB(m);
		Keyboard kb = new Keyboard();
		
		nb.useUSB(kb);
		
		
		nb.close();
	}
}
