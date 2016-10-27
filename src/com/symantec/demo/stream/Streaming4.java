package com.symantec.demo.stream;

import static com.symantec.demo.common.Gender.Female;
import static com.symantec.demo.common.Gender.Male;
import static com.symantec.demo.common.Grade.A;
import static com.symantec.demo.common.Grade.B;
import static com.symantec.demo.common.Grade.C;
import static com.symantec.demo.common.Grade.D;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.symantec.demo.common.Gender;
import com.symantec.demo.common.Student;

public class Streaming4 {

	private static List<Student> students = Arrays.asList(Student.newInstance("Ronald", A, Male, 3),
			Student.newInstance("Karthik", B, Male, 4), Student.newInstance("Manju", C, Female, 6),
			Student.newInstance("Muthu", A, Male, 2), Student.newInstance("Praveen", C, Male, 6),
			Student.newInstance("Devi", C, Female, 6), Student.newInstance("Vijayan", D, Male, -1));

	public static void main(String[] args) {
		Map<Gender, List<Student>> nameList = students.stream()
											.collect(Collectors.groupingBy(Student::getGender));
		nameList.entrySet().stream().forEach(System.out::println);

	}

}
