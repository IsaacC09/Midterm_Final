package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;

import java.util.Date;


import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;
 
public class Staff_Test {
static Staff A;
static Staff B;
static Staff C;
static Staff D;
static Staff E;
static Date today;
static ArrayList<Staff> staffers = new ArrayList<Staff>();
	@BeforeClass
	public static void setup() throws PersonException {

		 today = new Date();

		 staffers = new ArrayList<Staff>();
		  A = new Staff("Audrey", "B", "Chouri", today, "Hello Street", "(111)-111-1111", "a@yahoo.com", "Mon 5-9",
				5, 1.00, today, eTitle.MRS);
		 B = new Staff("Audrey", "B", "Chouri", today, "Hello Street", "(111)-111-1111", "a@yahoo.com", "Mon 5-9",
				5, 2.00, today, eTitle.MRS);
		 C = new Staff("Audrey", "B", "Chouri", today, "Hello Street", "(111)-111-1111", "a@yahoo.com", "Mon 5-9",
				5, 3.00, today, eTitle.MRS);
		 D = new Staff("Audrey", "B", "Chouri", today, "Hello Street", "(111)-111-1111", "a@yahoo.com", "Mon 5-9",
				5, 4.00, today, eTitle.MRS);
		 E = new Staff("Audrey", "B", "Chouri", today, "Hello Street", "(111)-111-1111", "a@yahoo.com", "Mon 5-9",
				5, 5.00, today, eTitle.MRS);
		staffers.add(A);
		staffers.add(B);
		staffers.add(C);
		staffers.add(D);
		staffers.add(E);
	}

	@Test
	public void testAvgSaleery() throws PersonException {
		
		double sum = 0;
		for (Staff d : staffers) {
			sum += d.getSalary();

		}
		double average = sum / (staffers.size());
		assertEquals(average, 3.0, 0);

	}

	@Test(expected = PersonException.class)
	public void testDOBException() throws PersonException {

		Date today = new Date();
		
		Person one = new Staff("Audrey", "B", "Chouri", java.sql.Date.valueOf("1900-5-10"), "Hello Street",
				"(111)-111-1111", "a@yahoo.com", "Mon 5-9", 5, 1.00, today, eTitle.MRS);

		Person two = new Staff("Audrey", "B", "Chouri", today, "Hello Street", "(111)-111-1111", "a@yahoo.com",
				"Mon 5-9", 5, 1.00, today, eTitle.MRS);
		
		Person three = new Staff("Audrey", "B", "Chouri", java.sql.Date.valueOf("1916-11-17"), "Hello Street",
				"(111)-111-1111", "a@yahoo.com", "Mon 5-9", 5, 1.00, today, eTitle.MRS);
	}

	@Test(expected = PersonException.class)
	public void testPhoneException() throws PersonException {
		
		A.setPhone("1234567890");

	}

}
