
public class welderBasedEmployee extends Employee {
	public welderBasedEmployee(int authorityLevel) {
		this.authorityLevel = authorityLevel;
	}
	
	@Override
	protected void write(String message) {
		System.out.println("Welder - message: "+message);
	}
}
