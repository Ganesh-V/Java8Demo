package com.symantec.demo.common;

public class Student {
	private String name;
	private Grade grade;
	private Gender gender;
	private int age; 
	
	public static Student newInstance(String name, Grade grade, Gender gender, int age) {
		Student student = new Student();
		student.setAge(age);
		student.setName(name);
		student.setGender(gender);
		student.setGrade(grade);
		return student;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Grade getGrade() {
		return grade;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", grade=" + grade + ", gender=" + gender + ", age=" + age + "]";
	}
}

