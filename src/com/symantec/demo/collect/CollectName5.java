package com.symantec.demo.collect;

import static com.symantec.demo.common.Gender.Female;
import static com.symantec.demo.common.Gender.Male;
import static com.symantec.demo.common.Grade.A;
import static com.symantec.demo.common.Grade.B;
import static com.symantec.demo.common.Grade.C;
import static com.symantec.demo.common.Grade.D;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.toSet;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.symantec.demo.common.Grade;
import com.symantec.demo.common.Student;

public class CollectName5 {

	
	private static List<Student> students = Arrays.asList(
			Student.newInstance("Ronald", A, Male, 3),
			Student.newInstance("Karthik", B, Male, 4),
			Student.newInstance("Manju", C, Female, 6),
			Student.newInstance("Muthu", A, Male, 2),
			Student.newInstance("Praveen", C, Male, 6),
			Student.newInstance("Devi", C, Female, 6),
			Student.newInstance("Vijayan", D, Male, -1));
			
	
	public static void main(String[] args) {
		getMap(students).entrySet().forEach(System.out::println);
	}
	
	
	public static Map<Grade, Set<String>> getMap(List<Student> students) {
		return students.stream().collect(groupingBy(Student::getGrade, mapping(Student::getName, toSet())));
	}
}
