
public abstract class Animal {

	private Moving move;
	
	public abstract void cry();
	public abstract void movePerform();
	
	public Moving getMove() {
		return move;
	}
	public void setMove(Moving move) {
		this.move = move;
	}
}
