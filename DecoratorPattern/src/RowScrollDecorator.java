
public class RowScrollDecorator extends DisplayDecorator {

	public RowScrollDecorator(Display decoratedDisplay) {
		super(decoratedDisplay);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		super.draw();
		drawScroll();
	}
	
	public void drawScroll() {
		System.out.println("가로 스크롤 표시");
	}
}
