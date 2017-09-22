package hello.airtel;

public class Student implements java.io.Serializable{

	
	private String id; 
	private String number1;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNumber1() {
		return number1;
	}
	public void setNumber1(String number1) {
		this.number1 = number1;
	}
	public Student(String id, String number1) {
		super();
		this.id = id;
		this.number1 = number1;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", number1=" + number1 + "]";
	}
	
	
}
