package com.Hash;

import java.util.Objects;

public class Student {
	private String registrationNumber;
	
	public Student(String registrationNumber)
	{
		this.registrationNumber = registrationNumber;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	@Override
	public int hashCode() {
		return Objects.hash(registrationNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(registrationNumber, other.registrationNumber);
	}
	
//	public boolean equals(Object o)
//	{
//		if(o != null && o instanceof Student)
//		{
//			String regNumber = ((Student)o).getRegistrationNumber();
//			if(regNumber != null && regNumber.equals(this.getRegistrationNumber()))
//			{
//				return true;
//			}
//		}
//		return false;
//	}
//	
//	public int hashCode()
//	{
//		return this.registrationNumber.hashCode();
//	}
	
	
	
}
