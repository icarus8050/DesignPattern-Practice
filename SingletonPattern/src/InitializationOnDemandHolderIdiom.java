
public class InitializationOnDemandHolderIdiom {

	private InitializationOnDemandHolderIdiom () {}
	
	private static class LazyHolder {
		private static final InitializationOnDemandHolderIdiom instance =
				new InitializationOnDemandHolderIdiom();
	}
	
	public static InitializationOnDemandHolderIdiom getInstance() {
		return LazyHolder.instance;
	}
}
