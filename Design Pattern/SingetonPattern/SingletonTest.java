public class SingletonTest {

	public static void main(String[] args) {
		//SingletonEx exam1 = new SingletonEx();
		//The constructor SingletonEx() is not visible

		SingletonEx exam2 = SingletonEx.getInstance();
		SingletonEx exam3 = SingletonEx.getInstance();
		SingletonEx exam4 = SingletonEx.getInstance();

		System.out.println(exam2);
		System.out.println(exam3);
		System.out.println(exam4);
	}

}