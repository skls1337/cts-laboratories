package grecu.andy.g1092.builder;

public final class Professor extends User {
	private String name;
	private String faculty;
	private String hierarchy;

	@Override
	public String toString() {
		return "Professor [name=" + name + ", faculty=" + faculty + ", hierarchy=" + hierarchy + "]";
	}

	public static class ProfessorBuilder {
		Professor professor = null;

		public ProfessorBuilder(int id, String email, String password, RoleEnum role) {
			if (role == RoleEnum.PROFESSOR) {
				professor=new Professor();
				professor.id = id;
				professor.email = email;
				professor.password = password;
				professor.role = role;
			}else {
				throw new UnsupportedOperationException("Invalid Role");
			}
		}
		
		public ProfessorBuilder setName(String name) {
			professor.name = name;
			return this;
		}
		
		public ProfessorBuilder setHierarchy(String hierarchy) {
			professor.hierarchy = hierarchy;
			return this;
		}
		
		public ProfessorBuilder setFaculty(String faculty) {
			professor.faculty = faculty;
			return this;
		}
		

		public Professor build() {
			return this.professor;
		}

	}// end of Professor builder class

}
