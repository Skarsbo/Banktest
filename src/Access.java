import java.util.Scanner;

public class Access {
	public static boolean isLoggedIn = false;
	public static int userID = 0;

	public static void logIn() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("");
		System.out.print("Username: ");
		String username = scanner.next();
		System.out.print("Password: ");
		String password = scanner.next();
		String[] data = FileIO.read("passwords.csv");
		for (int i = 0; i < data.length; i += 2) {
			if (username.equals(data[i]) && password.equals(data[i+1])) {
				System.out.println("\nLogged in as " + username);
				isLoggedIn = true;
			}
		}
		if (!isLoggedIn) {
			System.out.println("\nUser/pass incorrect");
		}
	}

	public static void logOut() {
		isLoggedIn = false;
	}
}
