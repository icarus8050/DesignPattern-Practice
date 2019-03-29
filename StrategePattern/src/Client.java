
public class Client {

	public static void main(String[] args) {
		Animal dog = new Dog();
		
		dog.setMove(new WalkUsingFourLegs());
		dog.movePerform();
		
		dog.setMove(new WalkUsingTwoLegs());
		dog.movePerform();
	}
}
