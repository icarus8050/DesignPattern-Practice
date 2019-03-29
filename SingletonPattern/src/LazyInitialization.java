
public class LazyInitialization {

	private static LazyInitialization instance;
	
	private LazyInitialization () {}
	
	public static LazyInitialization getInstance() {
		if (instance == null) {
			synchronized (LazyInitialization.class) {
				if (instance == null)
					instance = new LazyInitialization();
			}
		}
		return instance;
	}
}
