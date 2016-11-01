package com.symantec.demo.collect;

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

public class CollectName {

	
	private static List<Student> students = Arrays.asList(
			Student.newInstance("Ronald", A, Male, 3),
			Student.newInstance("Karthik", B, Male, 4),
			Student.newInstance("Manju", C, Female, 6),
			Student.newInstance("Muthu", A, Male, 2),
			Student.newInstance("Praveen", C, Male, 6),
			Student.newInstance("Devi", C, Female, 6),
			Student.newInstance("Vijayan", D, Male, -1));
			
	
	public static void main(String[] args) {
		
		getNames(students).forEach(System.out::println);
	}
	
	
	
	public static List<String> getNames(List<Student> students) {
		List<String> result = new ArrayList<>();
		for (Student student: students) {
			result.add(student.getName());
		}
		return result;
	}
}
