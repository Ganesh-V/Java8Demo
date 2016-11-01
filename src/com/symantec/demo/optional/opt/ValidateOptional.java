package com.symantec.demo.optional.opt;

import java.util.Optional;

public class ValidateOptional {
	public static void main(String[] args) {
		System.out.println();
	}
	public String getCarInsuranceName(Optional<Person> person) {
		return person.flatMap(Person::getCar)
					 .flatMap(Car::getInsurance)
					 .map(Insurance::getName)
					 .orElse("unknown");
	}
}
