import java.util.List;

public class AverageScore implements Observer {
	
	@Override
	public void update(List<Integer> scores) {
		// TODO Auto-generated method stub
		int avg = 0;
		
		for (int num: scores) {
			avg += num;
		}
		avg /= scores.size();
		System.out.println("Average : " + avg);
	}
}
