
public class StateOn implements State {

	private StateOn() {}
	
	private static class LazyHolder {
		private static final StateOn INSTANCE = new StateOn();
	}
	
	public static StateOn getInstance() {
		return LazyHolder.INSTANCE;
	}
	
	@Override
	public void onButtonPushed(Light light) {
		// TODO Auto-generated method stub
		System.out.println("Sleeping Light On");
		light.setState(StateSleeping.getInstance());
	}

	@Override
	public void offButtonPushed(Light light) {
		// TODO Auto-generated method stub
		System.out.println("Light Off");
		light.setState(StateOff.getInstance());
	}

}
