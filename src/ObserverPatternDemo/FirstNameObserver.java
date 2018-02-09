package ObserverPatternDemo;

public class FirstNameObserver implements IObserver {
	
	
	public FirstNameObserver() {
		
	}
	
	public void update(Student student, String NeedToNotify) {	
		if(NeedToNotify.equalsIgnoreCase("firstname"))
			System.out.println("Student's first name is " + student.getFirstName());
	}
}
