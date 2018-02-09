package ObserverPatternDemo;

public class EmailObserver implements IObserver {
	
	public EmailObserver() {
		
	}
	
	public void update(Student student, String NeedToNotify) {
		if(NeedToNotify.equalsIgnoreCase("email"))
			System.out.println("Student's email is " + student.getEmail());
	}
	
	

}
