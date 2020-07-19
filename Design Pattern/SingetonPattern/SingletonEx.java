public class SingletonEx {
	private SingletonEx() {};
	// 1번 규칙

	static SingletonEx SingletonExInstance;
	// 2번 규칙

	public static SingletonEx getInstance() {
	// 3번 규칙
		if(SingletonExInstance == null) {
			SingletonExInstance = new SingletonEx();
		}
		return SingletonExInstance;
	}

}