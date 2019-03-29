import java.util.Arrays;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		List<Integer> scores = Arrays.asList(80, 100, 120, 30);
		ScoreRecord record = new ScoreRecord();
		AverageScore avgScore = new AverageScore();
		MinMaxScore mScore = new MinMaxScore();
		
		record.attach(avgScore);
		record.attach(mScore);
		
		record.setScores(scores);
		
		record.detach(avgScore);
		System.out.println("---------------");
		record.setScores(scores);
	}
}
