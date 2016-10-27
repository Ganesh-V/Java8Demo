package com.symantec.demo.optional;

public class ValidateOptional {
	public static void main(String[] args) {
		System.out.println();
	}
	public String getCarInsuranceName(Person person) {
		if (person != null) {
			Car car = person.getCar(); 
			if (car != null) {
				Insurance insurance = car.getInsurance();
				if (insurance != null) {
					return insurance.getName();
				}
			}
		}
		return "Unknown";
	}
}
