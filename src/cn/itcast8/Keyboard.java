package cn.itcast8;

public class Keyboard implements USB{

	@Override
	public void openUSB() {
		System.out.println("���̿���");
	}

	@Override
	public void closeUSB() {
		System.out.println("���̹ر�");
	}

}
