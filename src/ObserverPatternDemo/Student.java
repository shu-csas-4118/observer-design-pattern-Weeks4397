package ObserverPatternDemo;

import java.util.ArrayList;

public class Student {
	private String firstName;
	private String lastName;
	private String email;
	private int idNumber;
	private ArrayList<String> StudentCourses; 
	private ArrayList<IObserver> observers;
	
	public Student(String firstName, String lastName, int idNumber, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = idNumber;
		this.email = email;
		this.StudentCourses = new ArrayList<String>();
		this.observers = new ArrayList<IObserver>();
	}
	
	public Student() {
		this.observers = new ArrayList<IObserver>();
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
		notifyAllObservers("firstname");
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
		notifyAllObservers("lastname");
	}
	
	public int getIdNumber() {
		return this.idNumber;
	}
	
	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
		notifyAllObservers("idnumber");
	}	
	
	public void setEmail(String email) {
		this.email = email;
		notifyAllObservers("email");
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void addcources(String course) {
		this.StudentCourses.add(course);
		notifyAllObservers("course");
	}
	
	public void removeCources(String course) {
		this.StudentCourses.remove(course);
		notifyAllObservers("course");
	}
	
	public ArrayList<String> getcources() {
		return this.StudentCourses;
	}
	
	public void attachObserver(IObserver observer) {
		this.observers.add(observer);
	}
	
	
	public void notifyAllObservers(String NeedToNotify) {
		for(IObserver observer: this.observers) {
			observer.update(this, NeedToNotify);
		}
	}
	
	
}
