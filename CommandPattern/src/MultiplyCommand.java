
public class MultiplyCommand implements Command {

	private Calculator calc;
	private int operand;
	
	public MultiplyCommand(Calculator calc, int operand) {
		this.calc = calc;
		this.operand = operand;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println(calc.getNum() + " * " + operand + " = " + (calc.getNum() * operand));
		calc.setNum(calc.getNum() * operand);
	}
}
