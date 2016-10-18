package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;

import java.util.Date;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {
 
	@Test
	public void gradetest() throws PersonException {
		ArrayList<Course> courses = new ArrayList<Course>();
		// (UUID courseID, String courseName, int gradePoints, eMajor major)
		Course bio = new Course(UUID.randomUUID(), "Biology", 3, eMajor.NURSING);
		Course chem = new Course(UUID.randomUUID(), "Chemistry", 3, eMajor.CHEM);
		Course econ = new Course(UUID.randomUUID(), "Econ", 3, eMajor.BUSINESS);
		courses.add(bio);
		courses.add(chem);
		courses.add(econ);

		ArrayList<Semester> semester = new ArrayList<Semester>();
		// Semester(UUID semesterID, Date startDate, Date endDate)
		Semester fall = new Semester(UUID.randomUUID(), java.sql.Date.valueOf("2016-08-10"),
				java.sql.Date.valueOf("2016-12-10"));
		Semester spring = new Semester(UUID.randomUUID(), java.sql.Date.valueOf("2017-2-10"),
				java.sql.Date.valueOf("2017-5-10"));
		semester.add(fall);
		semester.add(spring);

		ArrayList<Section> sections = new ArrayList<Section>();
		// Section(UUID courseID, UUID semesterID, UUID sectionID, int roomID)
		Section bioFall = new Section(bio.getCourseID(), fall.getSemesterID(), UUID.randomUUID(), 101);
		Section chemFall = new Section(chem.getCourseID(), fall.getSemesterID(), UUID.randomUUID(), 102);
		Section econFall = new Section(econ.getCourseID(), fall.getSemesterID(), UUID.randomUUID(), 103);
		Section bioSpring = new Section(bio.getCourseID(), spring.getSemesterID(), UUID.randomUUID(), 104);
		Section chemSpring = new Section(chem.getCourseID(), spring.getSemesterID(), UUID.randomUUID(), 105);
		Section econSpring = new Section(econ.getCourseID(), spring.getSemesterID(), UUID.randomUUID(), 106);
		sections.add(bioFall);
		sections.add(chemFall);
		sections.add(econFall);
		sections.add(bioSpring);
		sections.add(chemSpring);
		sections.add(econSpring);

		ArrayList<Student> students = new ArrayList<Student>();
		// Student(String FirstName, String MiddleName, String LastName,Date
		// DOB, eMajor Major,
		// String Address, String Phone_number, String Email)

		Student stud1 = new Student("Amy", "B", "Rickman", java.sql.Date.valueOf("1995-12-10"), eMajor.BUSINESS,
				"Hello Street", "(302)-123-4567", "thismidtermsucks@udel.edu");
		Student stud2 = new Student("Blake", "B", "Rickman", java.sql.Date.valueOf("1995-12-10"), eMajor.NURSING,
				"Hello Street", "(302)-123-4567", "thismidtermsucks@udel.edu");
		Student stud3 = new Student("Chris", "B", "Rickman", java.sql.Date.valueOf("1995-12-10"), eMajor.CHEM,
				"Hello Street", "(302)-123-4567", "thismidtermsucks@udel.edu");
		Student stud4 = new Student("Dylan", "B", "Rickman", java.sql.Date.valueOf("1995-12-10"), eMajor.PHYSICS,
				"Hello Street", "(302)-123-4567", "thismidtermsucks@udel.edu");
		Student stud5 = new Student("Erin", "B", "Rickman", java.sql.Date.valueOf("1995-12-10"), eMajor.COMPSI,
				"Hello Street", "(302)-123-4567", "thismidtermsucks@udel.edu");
		Student stud6 = new Student("Frank", "B", "Rickman", java.sql.Date.valueOf("1995-12-10"), eMajor.BUSINESS,
				"Hello Street", "(302)-123-4567", "thismidtermsucks@udel.edu");
		Student stud7 = new Student("George", "B", "Rickman", java.sql.Date.valueOf("1995-12-10"), eMajor.BUSINESS,
				"Hello Street", "(302)-123-4567", "thismidtermsucks@udel.edu");
		Student stud8 = new Student("Henry", "B", "Rickman", java.sql.Date.valueOf("1995-12-10"), eMajor.BUSINESS,
				"Hello Street", "(302)-123-4567", "thismidtermsucks@udel.edu");
		Student stud9 = new Student("Isaac", "B", "Rickman", java.sql.Date.valueOf("1995-12-10"), eMajor.BUSINESS,
				"Hello Street", "(302)-123-4567", "thismidtermsucks@udel.edu");
		Student stud0 = new Student("Jill", "B", "Rickman", java.sql.Date.valueOf("1995-12-10"), eMajor.BUSINESS,
				"Hello Street", "(302)-123-4567", "thismidtermsucks@udel.edu");
		students.add(stud1);
		students.add(stud2);
		students.add(stud3);
		students.add(stud4);
		students.add(stud5);
		students.add(stud6);
		students.add(stud7);
		students.add(stud8);
		students.add(stud9);

		ArrayList<Enrollment> enroll_bioFall = new ArrayList<Enrollment>();

		Enrollment stud1_bioFall = new Enrollment(bioFall.getSectionID(), stud1.getStudentID());
		Enrollment stud2_bioFall = new Enrollment(bioFall.getSectionID(), stud2.getStudentID());
		Enrollment stud3_bioFall = new Enrollment(bioFall.getSectionID(), stud3.getStudentID());
		Enrollment stud4_bioFall = new Enrollment(bioFall.getSectionID(), stud4.getStudentID());
		Enrollment stud5_bioFall = new Enrollment(bioFall.getSectionID(), stud5.getStudentID());
		Enrollment stud6_bioFall = new Enrollment(bioFall.getSectionID(), stud6.getStudentID());
		Enrollment stud7_bioFall = new Enrollment(bioFall.getSectionID(), stud7.getStudentID());
		Enrollment stud8_bioFall = new Enrollment(bioFall.getSectionID(), stud8.getStudentID());
		Enrollment stud9_bioFall = new Enrollment(bioFall.getSectionID(), stud9.getStudentID());
		Enrollment stud0_bioFall = new Enrollment(bioFall.getSectionID(), stud0.getStudentID());
		enroll_bioFall.add(stud1_bioFall);
		enroll_bioFall.add(stud2_bioFall);
		enroll_bioFall.add(stud3_bioFall);
		enroll_bioFall.add(stud4_bioFall);
		enroll_bioFall.add(stud5_bioFall);
		enroll_bioFall.add(stud6_bioFall);
		enroll_bioFall.add(stud7_bioFall);
		enroll_bioFall.add(stud8_bioFall);
		enroll_bioFall.add(stud9_bioFall);
		enroll_bioFall.add(stud0_bioFall);
		stud1_bioFall.setGrade(1);
		stud2_bioFall.setGrade(1);
		stud3_bioFall.setGrade(1);
		stud4_bioFall.setGrade(1);
		stud5_bioFall.setGrade(1);
		stud6_bioFall.setGrade(1);
		stud7_bioFall.setGrade(1);
		stud8_bioFall.setGrade(1);
		stud9_bioFall.setGrade(1);
		stud0_bioFall.setGrade(1);

		ArrayList<Enrollment> enroll_chemFall = new ArrayList<Enrollment>();
		Enrollment stud1_chemFall = new Enrollment(chemFall.getSectionID(), stud1.getStudentID());
		Enrollment stud2_chemFall = new Enrollment(chemFall.getSectionID(), stud2.getStudentID());
		Enrollment stud3_chemFall = new Enrollment(chemFall.getSectionID(), stud3.getStudentID());
		Enrollment stud4_chemFall = new Enrollment(chemFall.getSectionID(), stud4.getStudentID());
		Enrollment stud5_chemFall = new Enrollment(chemFall.getSectionID(), stud5.getStudentID());
		Enrollment stud6_chemFall = new Enrollment(chemFall.getSectionID(), stud6.getStudentID());
		Enrollment stud7_chemFall = new Enrollment(chemFall.getSectionID(), stud7.getStudentID());
		Enrollment stud8_chemFall = new Enrollment(chemFall.getSectionID(), stud8.getStudentID());
		Enrollment stud9_chemFall = new Enrollment(chemFall.getSectionID(), stud9.getStudentID());
		Enrollment stud0_chemFall = new Enrollment(chemFall.getSectionID(), stud0.getStudentID());
		enroll_chemFall.add(stud1_chemFall);
		enroll_chemFall.add(stud2_chemFall);
		enroll_chemFall.add(stud3_chemFall);
		enroll_chemFall.add(stud4_chemFall);
		enroll_chemFall.add(stud5_chemFall);
		enroll_chemFall.add(stud6_chemFall);
		enroll_chemFall.add(stud7_chemFall);
		enroll_chemFall.add(stud8_chemFall);
		enroll_chemFall.add(stud9_chemFall);
		enroll_chemFall.add(stud0_chemFall);
		stud1_chemFall.setGrade(2);
		stud2_chemFall.setGrade(2);
		stud3_chemFall.setGrade(2);
		stud4_chemFall.setGrade(2);
		stud5_chemFall.setGrade(2);
		stud6_chemFall.setGrade(2);
		stud7_chemFall.setGrade(2);
		stud8_chemFall.setGrade(2);
		stud9_chemFall.setGrade(2);
		stud0_chemFall.setGrade(2);

		ArrayList<Enrollment> enroll_econFall = new ArrayList<Enrollment>();
		Enrollment stud1_econFall = new Enrollment(econFall.getSectionID(), stud1.getStudentID());
		Enrollment stud2_econFall = new Enrollment(econFall.getSectionID(), stud2.getStudentID());
		Enrollment stud3_econFall = new Enrollment(econFall.getSectionID(), stud3.getStudentID());
		Enrollment stud4_econFall = new Enrollment(econFall.getSectionID(), stud4.getStudentID());
		Enrollment stud5_econFall = new Enrollment(econFall.getSectionID(), stud5.getStudentID());
		Enrollment stud6_econFall = new Enrollment(econFall.getSectionID(), stud6.getStudentID());
		Enrollment stud7_econFall = new Enrollment(econFall.getSectionID(), stud7.getStudentID());
		Enrollment stud8_econFall = new Enrollment(econFall.getSectionID(), stud8.getStudentID());
		Enrollment stud9_econFall = new Enrollment(econFall.getSectionID(), stud9.getStudentID());
		Enrollment stud0_econFall = new Enrollment(econFall.getSectionID(), stud0.getStudentID());
		enroll_econFall.add(stud1_econFall);
		enroll_econFall.add(stud2_econFall);
		enroll_econFall.add(stud3_econFall);
		enroll_econFall.add(stud4_econFall);
		enroll_econFall.add(stud5_econFall);
		enroll_econFall.add(stud6_econFall);
		enroll_econFall.add(stud7_econFall);
		enroll_econFall.add(stud8_econFall);
		enroll_econFall.add(stud9_econFall);
		enroll_econFall.add(stud0_econFall);
		stud1_econFall.setGrade(3);
		stud2_econFall.setGrade(3);
		stud3_econFall.setGrade(3);
		stud4_econFall.setGrade(3);
		stud5_econFall.setGrade(3);
		stud6_econFall.setGrade(3);
		stud7_econFall.setGrade(3);
		stud8_econFall.setGrade(3);
		stud9_econFall.setGrade(3);
		stud0_econFall.setGrade(3);

		ArrayList<Enrollment> enroll_bioSpring = new ArrayList<Enrollment>();
		Enrollment stud1_bioSpring = new Enrollment(bioSpring.getSectionID(), stud1.getStudentID());
		Enrollment stud2_bioSpring = new Enrollment(bioSpring.getSectionID(), stud2.getStudentID());
		Enrollment stud3_bioSpring = new Enrollment(bioSpring.getSectionID(), stud3.getStudentID());
		Enrollment stud4_bioSpring = new Enrollment(bioSpring.getSectionID(), stud4.getStudentID());
		Enrollment stud5_bioSpring = new Enrollment(bioSpring.getSectionID(), stud5.getStudentID());
		Enrollment stud6_bioSpring = new Enrollment(bioSpring.getSectionID(), stud6.getStudentID());
		Enrollment stud7_bioSpring = new Enrollment(bioSpring.getSectionID(), stud7.getStudentID());
		Enrollment stud8_bioSpring = new Enrollment(bioSpring.getSectionID(), stud8.getStudentID());
		Enrollment stud9_bioSpring = new Enrollment(bioSpring.getSectionID(), stud9.getStudentID());
		Enrollment stud0_bioSpring = new Enrollment(bioSpring.getSectionID(), stud0.getStudentID());
		enroll_bioSpring.add(stud1_bioSpring);
		enroll_bioSpring.add(stud2_bioSpring);
		enroll_bioSpring.add(stud3_bioSpring);
		enroll_bioSpring.add(stud4_bioSpring);
		enroll_bioSpring.add(stud5_bioSpring);
		enroll_bioSpring.add(stud6_bioSpring);
		enroll_bioSpring.add(stud7_bioSpring);
		enroll_bioSpring.add(stud8_bioSpring);
		enroll_bioSpring.add(stud9_bioSpring);
		enroll_bioSpring.add(stud0_bioSpring);
		stud1_bioSpring.setGrade(1);
		stud2_bioSpring.setGrade(1);
		stud3_bioSpring.setGrade(1);
		stud4_bioSpring.setGrade(1);
		stud5_bioSpring.setGrade(1);
		stud6_bioSpring.setGrade(1);
		stud7_bioSpring.setGrade(1);
		stud8_bioSpring.setGrade(1);
		stud9_bioSpring.setGrade(1);
		stud0_bioSpring.setGrade(1);

		ArrayList<Enrollment> enroll_chemSpring = new ArrayList<Enrollment>();
		Enrollment stud1_chemSpring = new Enrollment(chemSpring.getSectionID(), stud1.getStudentID());
		Enrollment stud2_chemSpring = new Enrollment(chemSpring.getSectionID(), stud2.getStudentID());
		Enrollment stud3_chemSpring = new Enrollment(chemSpring.getSectionID(), stud3.getStudentID());
		Enrollment stud4_chemSpring = new Enrollment(chemSpring.getSectionID(), stud4.getStudentID());
		Enrollment stud5_chemSpring = new Enrollment(chemSpring.getSectionID(), stud5.getStudentID());
		Enrollment stud6_chemSpring = new Enrollment(chemSpring.getSectionID(), stud6.getStudentID());
		Enrollment stud7_chemSpring = new Enrollment(chemSpring.getSectionID(), stud7.getStudentID());
		Enrollment stud8_chemSpring = new Enrollment(chemSpring.getSectionID(), stud8.getStudentID());
		Enrollment stud9_chemSpring = new Enrollment(chemSpring.getSectionID(), stud9.getStudentID());
		Enrollment stud0_chemSpring = new Enrollment(chemSpring.getSectionID(), stud0.getStudentID());
		enroll_chemSpring.add(stud1_chemSpring);
		enroll_chemSpring.add(stud2_chemSpring);
		enroll_chemSpring.add(stud3_chemSpring);
		enroll_chemSpring.add(stud4_chemSpring);
		enroll_chemSpring.add(stud5_chemSpring);
		enroll_chemSpring.add(stud6_chemSpring);
		enroll_chemSpring.add(stud7_chemSpring);
		enroll_chemSpring.add(stud8_chemSpring);
		enroll_chemSpring.add(stud9_chemSpring);
		enroll_chemSpring.add(stud0_chemSpring);
		stud1_chemSpring.setGrade(2);
		stud2_chemSpring.setGrade(2);
		stud3_chemSpring.setGrade(2);
		stud4_chemSpring.setGrade(2);
		stud5_chemSpring.setGrade(2);
		stud6_chemSpring.setGrade(2);
		stud7_chemSpring.setGrade(2);
		stud8_chemSpring.setGrade(2);
		stud9_chemSpring.setGrade(2);
		stud0_chemSpring.setGrade(2);

		ArrayList<Enrollment> enroll_econSpring = new ArrayList<Enrollment>();
		Enrollment stud1_econSpring = new Enrollment(econSpring.getSectionID(), stud1.getStudentID());
		Enrollment stud2_econSpring = new Enrollment(econSpring.getSectionID(), stud2.getStudentID());
		Enrollment stud3_econSpring = new Enrollment(econSpring.getSectionID(), stud3.getStudentID());
		Enrollment stud4_econSpring = new Enrollment(econSpring.getSectionID(), stud4.getStudentID());
		Enrollment stud5_econSpring = new Enrollment(econSpring.getSectionID(), stud5.getStudentID());
		Enrollment stud6_econSpring = new Enrollment(econSpring.getSectionID(), stud6.getStudentID());
		Enrollment stud7_econSpring = new Enrollment(econSpring.getSectionID(), stud7.getStudentID());
		Enrollment stud8_econSpring = new Enrollment(econSpring.getSectionID(), stud8.getStudentID());
		Enrollment stud9_econSpring = new Enrollment(econSpring.getSectionID(), stud9.getStudentID());
		Enrollment stud0_econSpring = new Enrollment(econSpring.getSectionID(), stud0.getStudentID());
		enroll_econSpring.add(stud1_econSpring);
		enroll_econSpring.add(stud2_econSpring);
		enroll_econSpring.add(stud3_econSpring);
		enroll_econSpring.add(stud4_econSpring);
		enroll_econSpring.add(stud5_econSpring);
		enroll_econSpring.add(stud6_econSpring);
		enroll_econSpring.add(stud7_econSpring);
		enroll_econSpring.add(stud8_econSpring);
		enroll_econSpring.add(stud9_econSpring);
		enroll_econSpring.add(stud0_econSpring);
		stud1_econSpring.setGrade(3);
		stud2_econSpring.setGrade(3);
		stud3_econSpring.setGrade(3);
		stud4_econSpring.setGrade(3);
		stud5_econSpring.setGrade(3);
		stud6_econSpring.setGrade(3);
		stud7_econSpring.setGrade(3);
		stud8_econSpring.setGrade(3);
		stud9_econSpring.setGrade(3);
		stud0_econSpring.setGrade(3);

		// Calculate course section average grade
		// bioFall
		int sum1 = 0;
		for (Enrollment d : enroll_bioFall) {
			sum1 += d.getGrade();

		}
		int average1 = sum1 / (enroll_bioFall.size());
		assertEquals(average1, 1.0, 0);

		// chemFall
		int sum2 = 0;
		for (Enrollment d : enroll_chemFall) {
			sum2 += d.getGrade();

		}
		int average2 = sum2 / (enroll_chemFall.size());
		assertEquals(average2, 2.0, 0);

		// econFall
		int sum3 = 0;
		for (Enrollment d : enroll_econFall) {
			sum3 += d.getGrade();

		}
		int average3 = sum3 / (enroll_econFall.size());
		assertEquals(average3, 3.0, 0);

		// bioSpring
		int sum4 = 0;
		for (Enrollment d : enroll_bioSpring) {
			sum4 += d.getGrade();

		}
		int average4 = sum4 / (enroll_bioSpring.size());
		assertEquals(average4, 1.0, 0);

		// chemSpring
		int sum5 = 0;
		for (Enrollment d : enroll_chemSpring) {
			sum5 += d.getGrade();

		}
		int average5 = sum5 / (enroll_chemSpring.size());
		assertEquals(average5, 2.0, 0);

		// econSpring
		int sum6 = 0;
		for (Enrollment d : enroll_econSpring) {
			sum6 += d.getGrade();

		}
		int average6 = sum6 / (enroll_econSpring.size());
		assertEquals(average6, 3.0, 0);

		// Calculate Student GPA

		// Student1
		double stud1_avg = (stud1_bioFall.getGrade() + stud1_chemFall.getGrade() + stud1_econFall.getGrade()
				+ stud1_bioSpring.getGrade() + stud1_chemSpring.getGrade() + stud1_econSpring.getGrade()) / 6;
		assertEquals(stud1_avg, 2, 0);

		// Student2
		double stud2_avg = (stud2_bioFall.getGrade() + stud2_chemFall.getGrade() + stud2_econFall.getGrade()
				+ stud2_bioSpring.getGrade() + stud2_chemSpring.getGrade() + stud2_econSpring.getGrade()) / 6;
		assertEquals(stud2_avg, 2, 0);

		// Student3
		double stud3_avg = (stud3_bioFall.getGrade() + stud3_chemFall.getGrade() + stud3_econFall.getGrade()
				+ stud3_bioSpring.getGrade() + stud3_chemSpring.getGrade() + stud3_econSpring.getGrade()) / 6;
		assertEquals(stud3_avg, 2, 0);

		// Student4
		double stud4_avg = (stud4_bioFall.getGrade() + stud4_chemFall.getGrade() + stud4_econFall.getGrade()
				+ stud4_bioSpring.getGrade() + stud4_chemSpring.getGrade() + stud4_econSpring.getGrade()) / 6;
		assertEquals(stud4_avg, 2, 0);

		// Student5
		double stud5_avg = (stud5_bioFall.getGrade() + stud5_chemFall.getGrade() + stud5_econFall.getGrade()
				+ stud5_bioSpring.getGrade() + stud5_chemSpring.getGrade() + stud5_econSpring.getGrade()) / 6;
		assertEquals(stud5_avg, 2, 0);

		// Student6
		double stud6_avg = (stud6_bioFall.getGrade() + stud6_chemFall.getGrade() + stud6_econFall.getGrade()
				+ stud6_bioSpring.getGrade() + stud6_chemSpring.getGrade() + stud6_econSpring.getGrade()) / 6;
		assertEquals(stud6_avg, 2, 0);

		// Student7
		double stud7_avg = (stud7_bioFall.getGrade() + stud7_chemFall.getGrade() + stud7_econFall.getGrade()
				+ stud7_bioSpring.getGrade() + stud7_chemSpring.getGrade() + stud7_econSpring.getGrade()) / 6;
		assertEquals(stud7_avg, 2, 0);

		// Student8
		double stud8_avg = (stud8_bioFall.getGrade() + stud8_chemFall.getGrade() + stud8_econFall.getGrade()
				+ stud8_bioSpring.getGrade() + stud8_chemSpring.getGrade() + stud8_econSpring.getGrade()) / 6;
		assertEquals(stud8_avg, 2, 0);

		// Student9
		double stud9_avg = (stud9_bioFall.getGrade() + stud9_chemFall.getGrade() + stud9_econFall.getGrade()
				+ stud9_bioSpring.getGrade() + stud9_chemSpring.getGrade() + stud9_econSpring.getGrade()) / 6;
		assertEquals(stud9_avg, 2, 0);

		// Student0
		double stud0_avg = (stud0_bioFall.getGrade() + stud0_chemFall.getGrade() + stud0_econFall.getGrade()
				+ stud0_bioSpring.getGrade() + stud0_chemSpring.getGrade() + stud0_econSpring.getGrade()) / 6;
		assertEquals(stud0_avg, 2, 0);
	}

	@Test
	public void changeMajortest() throws PersonException {
		Student a = new Student("Amy", "B", "Rickman", java.sql.Date.valueOf("1995-12-10"), eMajor.BUSINESS,
				"Hello Street", "(302)-123-4567", "thismidtermsucks@udel.edu");
		a.setMajor(eMajor.CHEM);
	}

}