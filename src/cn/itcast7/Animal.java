package cn.itcast7;
/*
 * ���嶯����
 * ���� 
 * 	 ����
 *  ����
 * ��Ϊ
 *   ��
 *   ˯
 */
public abstract class Animal {

	private String name;
	private int age;
	
	
	public abstract void eat();
	public abstract void sleep();
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
