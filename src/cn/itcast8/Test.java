package cn.itcast8;

public class Test {

	public static void main(String[] args) {
		NoteBook nb = new NoteBook();
		
		nb.open();
		
		Mouse m = new Mouse();
		//��Ҫ����USb�ӿڣ����Դ���ʵ�������
		nb.useUSB(m);
		Keyboard kb = new Keyboard();
		
		nb.useUSB(kb);
		
		
		nb.close();
	}
}
