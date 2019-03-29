
public class SubtractCommand implements Command {
	
	private Calculator calc;
	private int operand;
	
	public SubtractCommand(Calculator calc, int operand) {
		this.calc = calc;
		this.operand = operand;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println(calc.getNum() + " - " + operand + " = " + (calc.getNum() - operand));
		calc.setNum(calc.getNum() - operand);
	}
}
