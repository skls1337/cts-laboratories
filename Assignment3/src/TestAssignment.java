import grecu.andy.g1092.builder.RoleEnum;
import grecu.andy.g1092.builder.Student;
import grecu.andy.g1092.builder.StudyYearEnum;
import grecu.andy.g1092.composite.User;
import grecu.andy.g1092.singleton.MongoDBConnection;

public class TestAssignment {

	public static void main(String[] args) {
		final String urlConnectionString = "mongodb+srv://@cluster0.1sr9j.mongodb.net/StudentCompanion?retryWrites=true&w=majority";
		// connecting to mongo database cluster
		MongoDBConnection mongoConnection = MongoDBConnection.getMongoConnection(urlConnectionString, "skls",
				"password");
		// connected

		// create a user then login to server
		try {
			User student = new Student.StudentBuilder(1, "student1@ase.ro", "pwd123", RoleEnum.STUDENT)
					.setName("Maical Jexon").
					setFaculty("Tehe").
					setGroupNr(1024).
					setSeries("G")
					.setStudyYear(StudyYearEnum.THIRD_YEARD).build();
			
			User.login(student.getEmail(), student.getPassword(), mongoConnection);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
