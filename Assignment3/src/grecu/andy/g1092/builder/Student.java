package grecu.andy.g1092.builder;

import java.util.ArrayList;
import java.util.List;

import grecu.andy.g1092.composite.User;


public final class Student extends User {

	private String name;
	private String birthDate;
	private int groupNumber;
	private String series;
	private String faculty;
	private StudyYearEnum studyYear;
	List<Integer> grades;
	List<String> courses;

	private Student() {

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
