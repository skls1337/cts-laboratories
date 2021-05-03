package grecu.andy.g1092.builder;

import java.util.ArrayList;
import java.util.List;


public class Student extends User {

	protected String name;
	protected String birthDate;
	protected int groupNumber;
	protected String series;
	protected String faculty;
	protected StudyYearEnum studyYear;
	protected List<Integer> grades;
	protected List<String> courses;

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public int getGroupNumber() {
		return groupNumber;
	}

	public void setGroupNumber(int groupNumber) {
		this.groupNumber = groupNumber;
	}

	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public StudyYearEnum getStudyYear() {
		return studyYear;
	}

	public void setStudyYear(StudyYearEnum studyYear) {
		this.studyYear = studyYear;
	}

	public List<Integer> getGrades() {
		return grades;
	}

	public void setGrades(List<Integer> grades) {
		this.grades = grades;
	}

	public List<String> getCourses() {
		return courses;
	}

	public void setCourses(List<String> courses) {
		this.courses = courses;
	}

	protected Student() {

	}

	public static class StudentBuilder {
		Student student = null;

		public StudentBuilder(int id, String email, String password, RoleEnum role) {
			if (role == RoleEnum.STUDENT) {
				student=new Student();
				student.id = id;
				student.email = email;
				student.password = password;
				student.role = role;
				student.grades = new ArrayList<>();
				student.courses = new ArrayList<>();
			}else {
				throw new UnsupportedOperationException("Invalid Role");
			}
		}

		public StudentBuilder setGroupNr(int groupNumber) {
			student.groupNumber = groupNumber;
			return this;
		}

		public StudentBuilder setName(String name) {
			student.name = name;
			return this;
		}

		public StudentBuilder setBirthDate(String birthDate) {
			student.birthDate = birthDate;
			return this;
		}

		public StudentBuilder setSeries(String series) {
			student.series = series;
			return this;
		}

		public StudentBuilder setFaculty(String faculty) {
			student.faculty = faculty;
			return this;
		}

		public StudentBuilder setStudyYear(StudyYearEnum studyYear) {
			student.studyYear = studyYear;
			return this;
		}

		public Student build() {
			return this.student;
		}

	}// end of StudentBuilder

	@Override
	public String toString() {
		return "Student [name=" + name + ", birthDate=" + birthDate + ", groupNumber=" + groupNumber + ", series="
				+ series + ", faculty=" + faculty + ", studyYear=" + studyYear + ", grades=" + grades + ", courses="
				+ courses + ", id=" + id + ", email=" + email + ", password=" + password + ", role=" + role + "]";
	}

	

}
