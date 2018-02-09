package ObserverPatternDemo;

public class ObserverPatternDemo {

	public static void main(String[] args) {
		Student student = new Student("Garett", "Chang", 123456, "changgar@shu.edu");
		
		IdNumberObserver idObserver =  new IdNumberObserver();
		FirstNameObserver firstNameObserver = new FirstNameObserver();
		LastNameObserver lastNameObserver = new LastNameObserver();
		EmailObserver emailObserver = new EmailObserver();
		CourseObserver courseObserver = new CourseObserver();
		
		student.attachObserver(idObserver);
		student.attachObserver(firstNameObserver);
		student.attachObserver(lastNameObserver);
		student.attachObserver(emailObserver);
		student.attachObserver(courseObserver);
		
		student.addCources("2018_SPRING_CSAS4118AA Software Engineering II");
		student.addCources("2018_SPRING_CSAS4113BA Formal Lang and Automata");
		student.addCources("2018_SPRING_DAVA3010WB Data Mining");
		student.setFirstName("Alex");
		student.setLastName("Weeks");
		student.setIdNumber(543216);
		student.setEmail("alexander.weeks@student.shu.edu");
		student.removeCources("2018_SPRING_CSAS4118AA Software Engineering II");
		
	}

}
