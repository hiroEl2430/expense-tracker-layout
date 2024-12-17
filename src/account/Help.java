package account;

import java.util.Scanner;

public class Help {

    public static final String GREEN_TEXT = "\u001B[32m";
    public static final String RESET = "\u001B[0m";
    public static final String ORANGE_TEXT = "\u001B[38;5;214m";

    public void Help() {
        Scanner s = new Scanner(System.in);
        System.out.println("\n\n\n\n\n\n");
        System.out.println("\t\t\t\t╔══════════════════════════════════════════════════════════════════════════════════════════════════════════════╗");
        System.out.println("\t\t\t\t║                                                                                                              ║");
        System.out.println("\t\t\t\t║\tHELP AND SUPPORT                                                                                  ║");
        System.out.println("\t\t\t\t║                                                                                                              ║");
        System.out.println("\t\t\t\t║\t\tWelcome to Expense Tracker System! By using this application,                                  ║");
        System.out.println("\t\t\t\t║\t\tyou agree to the following terms and conditions. Please read them carefully.                   ║");
        System.out.println("\t\t\t\t║                                                                                                              ║");
        System.out.println("\t\t\t\t║\t\t\t1. HOW TO REGISTER                                                                     ║");
        System.out.println("\t\t\t\t║\t\t\t- Select option [1] on the Main Menu.                                                  ║");
        System.out.println("\t\t\t\t║\t\t\t- Follow the prompts to enter your email, password, and confirm your details.          ║");
        System.out.println("\t\t\t\t║\t\t\t- Use your registered email and password to log in.                                    ║");
        System.out.println("\t\t\t\t║                                                                                                              ║");
        System.out.println("\t\t\t\t║\t\t\t2. HOW TO LOG IN                                                                       ║");
        System.out.println("\t\t\t\t║\t\t\t- Select option [2] on the Main Menu.                                                  ║");
        System.out.println("\t\t\t\t║\t\t\t- Input your registered email and password.                                            ║");
        System.out.println("\t\t\t\t║                                                                                                              ║");
        System.out.println("\t\t\t\t║\t\t\t3. HOW TO USE THE EXPENSE TRACKER                                                      ║");
        System.out.println("\t\t\t\t║\t\t\t- After logging in, select option [2] on the User Menu.                                ║");
        System.out.println("\t\t\t\t║\t\t\t- Enter your income and expenses.                                                      ║");
        System.out.println("\t\t\t\t║\t\t\t- Categorize expenses into 'Needs', 'Wants', or 'Savings'.                             ║");
        System.out.println("\t\t\t\t║\t\t\t- Review your input and return to the User Menu.                                       ║");
        System.out.println("\t\t\t\t║                                                                                                              ║");
        System.out.println("\t\t\t\t║\t\t\t4. HOW TO MANAGE YOUR ACCOUNT                                                          ║");
        System.out.println("\t\t\t\t║\t\t\t- Go to 'My Account' from the User Menu [option 1]                                     ║");
        System.out.println("\t\t\t\t║\t\t\t- Update Email: Select option [1] to change your email.                                ║");
        System.out.println("\t\t\t\t║\t\t\t- Update Password: Select option [2] to change your password.                          ║");
        System.out.println("\t\t\t\t║\t\t\t- Update Income: Select option [3] to update your monthly income.                      ║");
        System.out.println("\t\t\t\t║\t\t\t- Delete Account: Select option [4] (permanently removes your account).                ║");
        System.out.println("\t\t\t\t║                                                                                                              ║");
        System.out.println("\t\t\t\t║\t\t\t5. FOR ADDITIONAL SUPPORT                                                              ║");
        System.out.println("\t\t\t\t║\t\t\t- You can email us on:                                                                 ║");
        System.out.println("\t\t\t\t║                                                                                                              ║");
        System.out.println("\t\t\t\t╚══════════════════════════════════════════════════════════════════════════════════════════════════════════════╝");
        System.out.println("\t\t\t\t\tPress Enter to continue...");
        s.nextLine();
    }
}
