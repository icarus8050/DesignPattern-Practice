
public class StateSleeping implements State {
	
	private StateSleeping() {}
	
	private static class LazyHolder {
		private static final StateSleeping INSTANCE = new StateSleeping();
	}
	
	public static StateSleeping getInstance() {
		return LazyHolder.INSTANCE;
	}
	
	@Override
	public void onButtonPushed(Light light) {
		// TODO Auto-generated method stub
		System.out.println("Light On");
		light.setState(StateOn.getInstance());
	}

	@Override
	public void offButtonPushed(Light light) {
		// TODO Auto-generated method stub
		System.out.println("Light Off");
		light.setState(StateOff.getInstance());
	}

}
