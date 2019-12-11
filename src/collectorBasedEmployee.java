
public class collectorBasedEmployee extends Employee {
	public collectorBasedEmployee(int authorityLevel) {
		this.authorityLevel = authorityLevel;
	}
	
	@Override
	protected void write(String message) {
		System.out.println("Part Collector - message: "+message);
	}
}
