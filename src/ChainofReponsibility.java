
public class ChainofReponsibility {
	private static Employee doChaining() {
		Employee collector = new collectorBasedEmployee(Employee.PART_COLLECTOR);
		
		Employee assembler = new assemblerBasedEmployee(Employee.ASSEMBLER);
		collector.setNextEmployee(assembler);
		
		Employee welder = new welderBasedEmployee(Employee.WELDER);
		assembler.setNextEmployee(welder);
		
		Employee painter = new painterBasedEmployee(Employee.PAINTER);
		welder.setNextEmployee(painter);
		
		return collector;
	}
	
	public static void main(String args[]) {
		Employee chainEmployee = doChaining();
		
		chainEmployee.doWork(Employee.PART_COLLECTOR, "all parts have been gathered");
		chainEmployee.doWork(Employee.ASSEMBLER, "all parts have been put together");
		chainEmployee.doWork(Employee.WELDER, "all parts have been welded together");
		chainEmployee.doWork(Employee.PAINTER, "car complete");
	}
}
