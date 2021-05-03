import grecu.andy.g1092.builder.Professor;
import grecu.andy.g1092.builder.RoleEnum;
import grecu.andy.g1092.builder.Student;
import grecu.andy.g1092.builder.StudyYearEnum;
import grecu.andy.g1092.builder.User;
import grecu.andy.g1092.composite.AbstractNode;
import grecu.andy.g1092.composite.UserComposite;
import grecu.andy.g1092.singleton.MongoDBConnection;

public class TestAssignment {

	public static void main(String[] args) {
		final String urlConnectionString = "mongodb+srv://@cluster0.1sr9j.mongodb.net/StudentCompanion?retryWrites=true&w=majority";
		// connecting to mongo database cluster
		MongoDBConnection mongoConnection = MongoDBConnection.getMongoConnection(urlConnectionString, "skls",
				"password");
		// connected

		
		try {
			//creating a student
			Student student = new Student.StudentBuilder(1, "student1@ase.ro", "pwd123", RoleEnum.STUDENT)
					.setName("Maical Jexon").
					setFaculty("CSIE").
					setGroupNr(1024).
					setSeries("G")
					.setStudyYear(StudyYearEnum.THIRD_YEARD).build();
			//creating a professor
			Professor professor= new Professor.ProfessorBuilder(1, "prof1@ie.ase.ro", "pwd123", RoleEnum.PROFESSOR)
					.setName("Mikael Gurbaciov")
					.setFaculty("CSIE")
					.setHierarchy("Professor")
					.build();
			
			//'simulating login'
			student.setToken( User.login(student.getEmail(), student.getPassword(), mongoConnection));
			professor.setToken( User.login(professor.getEmail(), professor.getPassword(), mongoConnection));
			User.logout(mongoConnection, professor);
			
			//creating a hierarchical tree between those users
			AbstractNode compositeUsers=new UserComposite();
			compositeUsers.addNode(student);
			compositeUsers.addNode(professor);
		
			compositeUsers.printNodes();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
