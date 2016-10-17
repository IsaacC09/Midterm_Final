package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {
	

	@BeforeClass
	public static  void setup() throws PersonException{
		ArrayList<Course> courses = new ArrayList<Course>();
		//(UUID courseID, String courseName, int gradePoints, eMajor major)
		Course bio = new Course(UUID.randomUUID(), "Biology", 3, eMajor.NURSING);
		Course chem = new Course(UUID.randomUUID(), "Chemistry", 3, eMajor.CHEM);
		Course econ = new Course(UUID.randomUUID(), "Econ", 3, eMajor.BUSINESS);
		courses.add(bio);
		courses.add(chem);
		courses.add(econ);
		
		ArrayList<Semester> semester = new ArrayList<Semester>();
		//Semester(UUID semesterID, Date startDate, Date endDate)
		Semester fall = new Semester(UUID.randomUUID(), java.sql.Date.valueOf("2016-08-10"),
				java.sql.Date.valueOf("2016-12-10") );
		Semester spring = new Semester(UUID.randomUUID(), java.sql.Date.valueOf("2017-2-10"),
				java.sql.Date.valueOf("2017-5-10") );
		semester.add(fall);
		semester.add(spring);
		
		ArrayList<Section> sections = new ArrayList<Section>();
		//Section(UUID courseID, UUID semesterID, UUID sectionID, int roomID)
		Section bioFall = new Section(bio.getCourseID(),fall.getSemesterID(),UUID.randomUUID(),101);
		Section chemFall = new Section(chem.getCourseID(),fall.getSemesterID(),UUID.randomUUID(),102);
		Section econFall = new Section(econ.getCourseID(),fall.getSemesterID(),UUID.randomUUID(),103);
		Section bioSpring = new Section(bio.getCourseID(),spring.getSemesterID(),UUID.randomUUID(),104);
		Section chemSpring = new Section(chem.getCourseID(),spring.getSemesterID(),UUID.randomUUID(),105);
		Section econSpring = new Section(econ.getCourseID(),spring.getSemesterID(),UUID.randomUUID(),106);
		sections.add(bioFall);
		sections.add(chemFall);
		sections.add(econFall);
		sections.add(bioSpring); 
		sections.add(chemSpring);
		sections.add(econSpring);
		
		ArrayList<Student> students = new ArrayList<Student>();
		//Student(String FirstName, String MiddleName, String LastName,Date DOB, eMajor Major,
		//String Address, String Phone_number, String Email)
		
		Student a = new Student("Amy", "B", "Rickman",java.sql.Date.valueOf("1995-12-10"), eMajor.BUSINESS, 
				"Hello Street", "(302)-123-4567", "thismidtermsucks@udel.edu");
		Student b = new Student("Blake", "B", "Rickman",java.sql.Date.valueOf("1995-12-10"), eMajor.NURSING, 
				"Hello Street", "(302)-123-4567", "thismidtermsucks@udel.edu");
		Student c = new Student("Chris", "B", "Rickman",java.sql.Date.valueOf("1995-12-10"), eMajor.CHEM, 
				"Hello Street", "(302)-123-4567", "thismidtermsucks@udel.edu");
		Student d = new Student("Dylan", "B", "Rickman",java.sql.Date.valueOf("1995-12-10"), eMajor.PHYSICS, 
				"Hello Street", "(302)-123-4567", "thismidtermsucks@udel.edu");
		Student e = new Student("Erin", "B", "Rickman",java.sql.Date.valueOf("1995-12-10"), eMajor.COMPSI, 
				"Hello Street", "(302)-123-4567", "thismidtermsucks@udel.edu");
		Student f = new Student("Frank", "B", "Rickman",java.sql.Date.valueOf("1995-12-10"), eMajor.BUSINESS, 
				"Hello Street", "(302)-123-4567", "thismidtermsucks@udel.edu");
		Student g = new Student("George", "B", "Rickman",java.sql.Date.valueOf("1995-12-10"), eMajor.BUSINESS, 
				"Hello Street", "(302)-123-4567", "thismidtermsucks@udel.edu");
		Student h = new Student("Henry", "B", "Rickman",java.sql.Date.valueOf("1995-12-10"), eMajor.BUSINESS, 
				"Hello Street", "(302)-123-4567", "thismidtermsucks@udel.edu");
		Student i = new Student("Isaac", "B", "Rickman",java.sql.Date.valueOf("1995-12-10"), eMajor.BUSINESS, 
				"Hello Street", "(302)-123-4567", "thismidtermsucks@udel.edu");
		Student j = new Student("Jill", "B", "Rickman",java.sql.Date.valueOf("1995-12-10"), eMajor.BUSINESS, 
				"Hello Street", "(302)-123-4567", "thismidtermsucks@udel.edu");
		students.add(a);
		students.add(b);
		students.add(c);
		students.add(d);
		students.add(e);
		students.add(f);
		students.add(g);
		students.add(h);
		students.add(i);
		students.add(j);
	}

	@Test
	public void gradetest() throws PersonException{
		Student a = new Student("Amy", "B", "Rickman",java.sql.Date.valueOf("1995-12-10"), eMajor.BUSINESS, 
				"Hello Street", "(302)-123-4567", "thismidtermsucks@udel.edu");
		a.setMajor(eMajor.CHEM);
	}	
	

	@Test
	public void changeMajortest() throws PersonException{
		Student a = new Student("Amy", "B", "Rickman",java.sql.Date.valueOf("1995-12-10"), eMajor.BUSINESS, 
				"Hello Street", "(302)-123-4567", "thismidtermsucks@udel.edu");
		a.setMajor(eMajor.CHEM);
	}
	
	
}