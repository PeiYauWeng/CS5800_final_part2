
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
			message = generateMsg(this.authorityLevel, message);
			write(message);
		}
		
		if(nextEmployee != null) {
			nextEmployee.doWork(authorityLevel, message);
		}
	}
	
	private String generateMsg(int level, String msg) {
		if (level == 3)
			return "all parts have been put together";
		if (level == 2)
			return "all parts have been welded together";
		if (level == 1)
			return "car complete";
		return msg;
	}
	
	protected abstract void write(String message);
}