import java.util.LinkedList;
import java.util.Queue;

public class CalculatorButton {

	private Queue<Command> commandQueue;
	
	public CalculatorButton(){
		commandQueue = new LinkedList<Command>();
	}
	
	public void addCommand(Command newCommand) {
		commandQueue.offer(newCommand);
	}
	
	public void pressed() {
		while(!commandQueue.isEmpty()) {
			commandQueue.poll().execute();
		}
	}
}
