package cn.itcast8;

public class Keyboard implements USB{

	@Override
	public void openUSB() {
		System.out.println("¼üÅÌ¿ªÆô");
	}

	@Override
	public void closeUSB() {
		System.out.println("¼üÅÌ¹Ø±Õ");
	}

}
