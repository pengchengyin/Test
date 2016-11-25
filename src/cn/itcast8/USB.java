package cn.itcast8;
/*
 * 定义一个USB接口 
 * 开启
 * 关闭
 */
public interface USB {

	public abstract void openUSB();
	
	public abstract void closeUSB();
	
}
