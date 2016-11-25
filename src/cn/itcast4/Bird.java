package cn.itcast4;
/*
 * 鸟实现类会飞的接口
 */
public class Bird implements Fly{

	@Override
	public void fly() {
		System.out.println("傻了吧!老子会飞！");
	}

}
