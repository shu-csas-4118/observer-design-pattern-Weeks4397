package ObserverPatternDemo;

public class IdNumberObserver implements IObserver {
	
	public IdNumberObserver() {
		
	}
	
	public void update(Student student, String NeedToNotify) {
		if(NeedToNotify.equalsIgnoreCase("idnumber"))
			System.out.println("Student's id number is " + student.getIdNumber());
	}

}
