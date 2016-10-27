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
import java.util.function.Predicate;

import com.symantec.demo.common.Student;
public class Filtering4 {
	
	private static List<Student> students = Arrays.asList(
			Student.newInstance("Ronald", A, Male, 3),
			Student.newInstance("Karthik", B, Male, 4),
			Student.newInstance("Manju", C, Female, 6),
			Student.newInstance("Muthu", A, Male, 2),
			Student.newInstance("Praveen", C, Male, 6),
			Student.newInstance("Devi", C, Female, 6),
			Student.newInstance("Vijayan", D, Male, -1));
			
	
	public static void main(String[] args) {
		
		Predicate<Student> isProperAge =  (Student s) -> s.getAge() >= 0;
		
		Predicate<Student> isMale = new Predicate<Student>() {
			public boolean test(Student student) {
				return (student.getGender() == Male);
			}
		};

		Predicate<Student> isProperAgeMale = new Predicate<Student>() {
			public boolean test(Student student) {
				return (student.getAge() >=0) && (student.getGender() == Male);
			}
		};
		
		List<Student> properAgeStudents = filterMaleStudent(students, isProperAge);
		
		for(Student student:properAgeStudents) {
			System.out.println(student);
		}
	}
	
	public static List<Student> filterMaleStudent(List<Student> students, Predicate<Student> condition) {
		List<Student> result = new ArrayList<>();
		for (Student student : students) {
			if (condition.test(student)) {
				result.add(student);
			}
		}
		return result;
	}
}




