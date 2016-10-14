package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {

	@BeforeClass
	public static void setup() {
		public Staff(String FirstName, String MiddleName, String LastName,
				Date DOB, String Address, String Phone_number, String Email,
				String officeHours, int rank, double salary, Date hireDate,
				eTitle Title) 
		Staff Amy = new Staff("Audrey" , "B", "Chouri", 
				(99,5,12), "Hello Street", "(111)-111-1111", "a@yahoo.com"
				"Mon 5-9", 5, 1.00, (16,5,12), MR);
		
	}
	
	@Test
	public void test() {
		assertEquals(1,1);
	}	

}
