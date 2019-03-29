
public class Cat extends Animal {

	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("Meow");
	}

	@Override
	public void movePerform() {
		// TODO Auto-generated method stub
		getMove().move();
	}

}
