
public class ColScrollDecorator extends DisplayDecorator {

	public ColScrollDecorator(Display decoratedDisplay) {
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
		System.out.println("���� ��ũ�� ǥ��");
	}
}
