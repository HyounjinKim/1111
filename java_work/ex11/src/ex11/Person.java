package ex11;

public class Person {

	String name;
	String phone;
	String gender;
	String remark;
	int age;

	// 다른 생성자를 선언하게 되면 기본생성자 생략 불가

	public void initValue(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public Person(String name, String phone, String gender, String remark, int age) {
		super();
		this.name = name;
		this.phone = phone;
		this.gender = gender;
		this.remark = remark;
		this.age = age;
	}

}
