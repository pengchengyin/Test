package cn.itcast4;
/*
 * 测试接口多态
 */
public class Test03 {

	public static void main(String[] args) {
		//接口   变量名 = new 实现类类型();
		Fly f = new Bird();
		f.fly();
	}
}
