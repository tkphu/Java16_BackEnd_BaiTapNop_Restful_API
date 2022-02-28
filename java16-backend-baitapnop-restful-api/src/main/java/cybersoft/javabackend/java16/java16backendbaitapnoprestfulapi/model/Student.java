package cybersoft.javabackend.java16.java16backendbaitapnoprestfulapi.model;
/*
 * Mục đích: Đối tượng Student
 * Người tạo: Trần Kim Phú
 * Ngày tạo: 28/02/2022
 * Version: 1.0
 * */
public class Student {
	private String name;
	private int age;
	
	public Student() {
		
	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

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
