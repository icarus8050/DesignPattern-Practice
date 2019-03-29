
public class StateOff implements State {

	private StateOff() {}
	
	private static class LazyHolder {
		private static final StateOff INSTANCE = new StateOff();
	}
	
	public static StateOff getInstance() {
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
		System.out.println("nothing..");
	}

}
