
public class painterBasedEmployee extends Employee {
	public painterBasedEmployee(int authorityLevel) {
		this.authorityLevel = authorityLevel;
	}
	
	@Override
	protected void write(String message) {
		System.out.println("Painter - message: "+message);
	}
}
