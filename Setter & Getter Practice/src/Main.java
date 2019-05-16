public class Main {
	
	private String _name;
	
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
}