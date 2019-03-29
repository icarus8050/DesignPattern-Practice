
public abstract class DisplayDecorator extends Display {

	private Display decoratedDisplay;
	
	public DisplayDecorator(Display decoratedDisplay) {
		this.decoratedDisplay = decoratedDisplay;
	}
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		decoratedDisplay.draw();
	}
}
