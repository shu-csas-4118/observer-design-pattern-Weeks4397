package ObserverPatternDemo;

public class CourseObserver implements IObserver {
	
	public CourseObserver() {
		
	}
	
	public void update(Student student, String NeedToNotify) {
		if(NeedToNotify.equalsIgnoreCase("course")) {
			System.out.println("Student's current courses are:");
			for(int i = 0; i < student.getcources().size(); i++) {
				System.out.println("Course "+ (i + 1) +": " + student.getcources().get(i));
			}	
		}
	}

}
