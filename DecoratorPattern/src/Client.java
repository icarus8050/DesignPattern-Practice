
public class Client {

	public static void main(String[] args) {
		Display window = new WindowDisplay();
		window.draw();
		
		System.out.println();
		
		Display windowWithRowScroll = new RowScrollDecorator(new WindowDisplay());
		windowWithRowScroll.draw();
		
		System.out.println();
		
		Display windowWithRowAndColScroll = new ColScrollDecorator(new RowScrollDecorator(new WindowDisplay()));
		windowWithRowAndColScroll.draw();
	}
}
