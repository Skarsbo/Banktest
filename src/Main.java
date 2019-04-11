
public class Main {

    public static void main(String[] args) {
        {
            String[][] data = {{"alice@mail.com", "xxx"}, {"bob@mail.com", "yyy"}};
            FileIO.write("test.txt", data);
        }

        while (!Access.isLoggedIn) Access.logIn();

        UI.mainMenu();
    }
}
