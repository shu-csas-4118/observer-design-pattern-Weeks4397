package ObserverPatternDemo;

public class LastNameObserver implements IObserver {
	
	
	public LastNameObserver() {
		
	}
	
	public void update(Student student, String NeedToNotify) {		
		if(NeedToNotify.equalsIgnoreCase("lastname"))
			System.out.println("Student's first name is " + student.getLastName());
	}

}
