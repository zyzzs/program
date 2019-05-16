public class Main {
	
	private String _name;
	private int studentID;
	
	public void setName (String newName) {
		_name = newName;
	}
	
	public String getName() {
		return _name;
	}
	
	public Main() { // Empty Constructor
		
	}
	
	public Main(String n) { // Constructor
		this._name = n;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
}