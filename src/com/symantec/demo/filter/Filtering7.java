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
public class Filtering7 {
	
	private static List<Student> students = Arrays.asList(
			Student.newInstance("Ronald", A, Male, 3),
			Student.newInstance("Karthik", B, Male, 4),
			Student.newInstance("Manju", C, Female, 6),
			Student.newInstance("Muthu", A, Male, 2),
			Student.newInstance("Praveen", C, Male, 6),
			Student.newInstance("Devi", C, Female, 6),
			Student.newInstance("Vijayan", D, Male, -1));
			
	private static List<Integer> marks = Arrays.asList(10,21,31,42,3);
	
	public static void main(String[] args) {
		
		Predicate<Student> isProperAge = s -> s.getAge() >= 0;		
		Predicate<Student> isMale = student -> student.getGender() == Male;
		Predicate<Student> isProperAgeMale = isProperAge.and(isMale);
		
		Predicate<Integer> isOdd = value -> value % 2 == 1;
		
		List<Student> properAgeStudents = filter(students, isProperAgeMale);
		
		List<Integer> oddMarks = filter(marks, isOdd);
		
		for(Student student:properAgeStudents) {
			System.out.println(student);
		}
		
		new Thread(()->System.out.println("Hello Thread")).start();
	}
	
	public static <T> List<T> filter(List<T> s, Predicate<T> condition) {
		List<T> result = new ArrayList<>();
		for (T a : s) {
			if (condition.test(a)) {
				result.add(a);
			}
		}
		return result;
	}
}




