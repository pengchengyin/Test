package cn.itcast8;

public class Mouse implements USB{

	@Override
	public void openUSB() {
		System.out.println("��꿪��");
		
	}

	@Override
	public void closeUSB() {
		System.out.println("���ر�");
		
	}

}
