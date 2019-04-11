public class UI {
	public static void mainMenu() {
		String[] options = {"List accounts", "Transfer"};
		for (int i = 0; i < options.length; i++) {
			System.out.println(i + " \t " + options[i]);
		}
	}
}
