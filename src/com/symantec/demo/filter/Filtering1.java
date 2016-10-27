package com.symantec.demo.filter;

import static com.symantec.demo.common.Gender.Female;
import static com.symantec.demo.common.Gender.Male;
import static com.symantec.demo.common.Grade.A;
import static com.symantec.demo.common.Grade.B;
import static com.symantec.demo.common.Grade.C;
import static com.symantec.demo.common.Grade.D;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.symantec.demo.common.Student;
public class Filtering1 {
	
	private static List<Student> students = Arrays.asList(
			Student.newInstance("Ronald", A, Male, 3),
			Student.newInstance("Karthik", B, Male, 4),
			Student.newInstance("Manju", C, Female, 6),
			Student.newInstance("Muthu", A, Male, 2),
			Student.newInstance("Praveen", C, Male, 6),
			Student.newInstance("Devi", C, Female, 6),
			Student.newInstance("Vijayan", D, Male, -1));
			
	
	public static void main(String[] args) {
		for(Student student:filterMaleStudent(students)) {
			System.out.println(student);
		}
	}
	
	public static List<Student> filterMaleStudent(List<Student> students) {
		List<Student> result = new ArrayList<>();
		for (Student student : students) {
			if (student.getGender() == Male) {
				result.add(student);
			}
		}
		return result;
	}
	
	public static List<Student> filterProperAgeStudents(List<Student> students) {
		List<Student> result = new ArrayList<>();
		for (Student student : students) {
			if (student.getAge() >= 0) {
				result.add(student);
			}
		}
		return result;
	}
}




