import java.util.List;

public class MinMaxScore implements Observer {
	
	@Override
	public void update(List<Integer> scores) {
		// TODO Auto-generated method stub
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for (int num: scores) {
			max = Math.max(max, num);
			min = Math.min(min, num);
		}
		
		System.out.println("Min : " + min + ", Max : " + max);
	}
}
