package ObserverPatternDemo;

public class ObserverPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student("Garett", "Chang", 123456, "changgar@shu.edu");
		
		IdNumberObserver idObserver =  new IdNumberObserver();
		FirstNameObserver firstNameObserver = new FirstNameObserver();
		EmailObserver emailObserver = new EmailObserver();
		CourseObserver courseObserver = new CourseObserver();
		
		student.attachObserver(idObserver);
		student.attachObserver(firstNameObserver);
		student.attachObserver(emailObserver);
		student.attachObserver(courseObserver);
		
		student.addcources("2018_SPRING_CSAS4118AA Software Engineering II");
		student.addcources("2018_SPRING_CSAS4118AA Software Engineering II");
		student.addcources("2018_SPRING_CSAS4118AA Software Engineering II");
		student.setFirstName("Alex");
		student.setLastName("Weeks");
		student.setIdNumber(543216);
		student.setEmail("alexander.weeks@student.shu.edu");
		student.removeCources("2018_SPRING_CSAS4118AA Software Engineering II");
		
	}

}
