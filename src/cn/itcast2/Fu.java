package cn.itcast2;
/*
 * 接口的成员特点
 * 
 * 成员变量
 * 		是常量
 * 		被 public static final  int a = 10;
 *     a =20;//不能修改
 *     
 * 		 public static final叫做固定修饰符 如果你不写 java会为你默认添加
 * 		 甚至可以选择性写修饰符
 * 
 * 成员方法
 * 		默认public abstract修饰 固定修饰符  不写 java默认补齐
 * 
 */
public interface Fu {

	//public static final int a =10;
	
	  abstract void method();
	
	
}
