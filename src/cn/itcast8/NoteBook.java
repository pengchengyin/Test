package cn.itcast8;
/*
 * �ʼǱ���
 */
public class NoteBook {

	
	public void open(){
		System.out.println("�ʼǱ�������");
	}
	
	public void close(){
		System.out.println("�ʼǱ��ػ���");
	}
	//������USB�ӿ� �ӿڲ��ܴ������� ���ǿ��Դ�����ʵ�������
	//�ӿڵ�����ָ��ʵ����Ķ��� ���õ���usb�ĳ��󷽷� ���е���������д��ķ���
	public void useUSB(USB usb){
		usb.openUSB();
		usb.closeUSB();
	}
}
