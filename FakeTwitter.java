import java.util.Scanner;

public class FakeTwitter {
    Account yourAccount;
    Scanner scanner = new Scanner(System.in);

    void initAccount() {
        System.out.println("CREATE ACCOUNT");
        
        System.out.println("Enter Your ID: ");
        String user_id = scanner.nextLine();

        System.out.println("Do You Wanna Make Your First Tweet? [YES]/[NO]");
        
        String user_input;
        while(true) {
            user_input = scanner.nextLine();

            if (user_input.toUpperCase().equals("YES")) break;
            else if (user_input.toUpperCase().equals("NO")) break;
            else System.out.println("ENTER VALID INPUT.");
        }

        if (user_input.toUpperCase().equals("YES")) {
            System.out.println("Enter Your First Tweet: ");
            String first_tweet = scanner.nextLine();

            yourAccount = new Account(user_id, first_tweet);
        } 
        else if (user_input.toUpperCase().equals("NO")) {
            yourAccount = new Account(user_id, "No Tweet");
        }
    }

    void showTweet() {
        System.out.println("\033[H\033[2J");
        System.out.println(yourAccount.getAccount_id());
        System.out.println("\"" +  yourAccount.getTweet() + "\"");
    }

    void newTweet() {
        System.out.print("Enter New Tweet: ");
        String new_tweet = scanner.nextLine();

        yourAccount.setTweet(new_tweet);
    }

    public static void main(String[] args) {
        FakeTwitter yourTwitter = new FakeTwitter();
        Scanner scanner = new Scanner(System.in);
        String user_input;

        yourTwitter.initAccount();
        yourTwitter.showTweet();

        System.out.println("Make New Tweet? [YES]/[NO]");

        while (true) {
            user_input = scanner.nextLine();
            if (user_input.toUpperCase().equals("YES")) break;
            else if (user_input.toUpperCase().equals("NO")) break;
            else {
                System.out.println("ENTER VALID INPUT.");
                user_input = scanner.nextLine();
            }
        }

        if (user_input.toUpperCase().equals("YES")) {
            yourTwitter.newTweet();
            yourTwitter.showTweet();
            System.out.println("THANK YOU FOR USING FAKETWITTER");
        } 
        else {
            System.out.println("THANK YOU FOR USING FAKETWITTER");
        } 

        scanner.close();
    }
}