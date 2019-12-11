
public abstract class Employee {
	public static int PART_COLLECTOR = 4;
	public static int ASSEMBLER = 3;
	public static int WELDER = 2;
	public static int PAINTER = 1;
	
	protected int authorityLevel;
	protected Employee nextEmployee;
	
	public void setNextEmployee(Employee nextEmployee) {
		this.nextEmployee = nextEmployee;
	}
	
	public void doWork(int authorityLevel, String message) {
		if(this.authorityLevel <= authorityLevel) {
			write(message);
		}
		
		if(nextEmployee != null) {
			nextEmployee.doWork(authorityLevel, message);
		}
	}
	
	protected abstract void write(String message);
}