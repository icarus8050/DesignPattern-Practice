import java.util.ArrayList;
import java.util.List;

public class ScoreRecord implements Subject {

	private List<Observer> observers;
	private List<Integer> scores;
	
	public ScoreRecord() {
		observers = new ArrayList<Observer>();
	}
	
	@Override
	public void attach(Observer observer) {
		// TODO Auto-generated method stub
		observers.add(observer);
	}

	@Override
	public void detach(Observer observer) {
		// TODO Auto-generated method stub
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for (Observer o: observers)
			o.update(scores);
	}

	public List<Integer> getScores() {
		return scores;
	}

	public void setScores(List<Integer> scores) {
		this.scores = scores;
		notifyObservers();
	}

}
