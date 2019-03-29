
public class Client {
	
	public static void main(String[] args) {
		Calculator calc = new Calculator(3);
		
		Command addC = new AddCommand(calc, 5);
		Command subC = new SubtractCommand(calc, 2);
		Command mulC = new MultiplyCommand(calc, 2);
		Command divC = new DivideCommand(calc, 2);
		
		CalculatorButton btn = new CalculatorButton();
		btn.addCommand(addC);
		btn.addCommand(subC);
		btn.addCommand(mulC);
		btn.addCommand(divC);
		
		btn.pressed();
	}
}
