package display;

import java.util.Scanner;

public class TermsAndConditions extends menu {

    private static final String YELLOW = "\u001B[33m";
    private static final String RESET = "\u001B[0m";
    public static final String GREEN_TEXT = "\u001B[32m";
    public static final String ORANGE_TEXT = "\u001B[38;5;214m";

    @Override
    public void display() {
        clearScreen clr = new clearScreen();
        Scanner s = new Scanner(System.in);
        clr.clearScreen();
        System.out.println("\n\n");
        System.out.println("\t\t\t╔══════════════════════════════════════════════════════════════════════════════════════════════════════════════╗");
        System.out.println("\t\t\t║                                                                                                              ║");
        System.out.println("\t\t\t║\tTERMS AND CONDITIONS                                                                                   ║");
        System.out.println("\t\t\t║\tEffective Date: [Insert Date]                                                                          ║");
        System.out.println("\t\t\t║                                                                                                              ║");
        System.out.println("\t\t\t║\t\tWelcome to Expense Tracker System! By using this application,                                  ║");
        System.out.println("\t\t\t║\t\tyou agree to the following terms and conditions. Please read them carefully.                   ║");
        System.out.println("\t\t\t║                                                                                                              ║");
        System.out.println("\t\t\t║\t\t\t1. ACCEPTANCE OF TERMS                                                                 ║");
        System.out.println("\t\t\t║\t\t\tBy registering and using our system, you confirm that you have read,                   ║");
        System.out.println("\t\t\t║\t\t\tunderstood, and agree to be bound by the terms and conditions of this                  ║");
        System.out.println("\t\t\t║\t\t\tagreement. If you do not agree to the terms, you may not use the system.               ║");
        System.out.println("\t\t\t║                                                                                                              ║");
        System.out.println("\t\t\t║\t\t\t2. USER INFORMATION                                                                    ║");
        System.out.println("\t\t\t║\t\t\tTo provide a personalized experience, we collect the following information             ║");
        System.out.println("\t\t\t║\t\t\tduring registration and usage:                                                         ║");
        System.out.println("\t\t\t║                                                                                                              ║");
        System.out.println("\t\t\t║\t\t\tPersonal Details: Email address (Gmail only).                                          ║");
        System.out.println("\t\t\t║\t\t\tFinancial Data: Monthly income, expenses, and categories.                              ║");
        System.out.println("\t\t\t║\t\t\tWe ensure that your information is securely stored and used solely for improving       ║");
        System.out.println("\t\t\t║\t\t\tyour experience within the system.                                                     ║");
        System.out.println("\t\t\t║                                                                                                              ║");
        System.out.println("\t\t\t╚══════════════════════════════════════════════════════════════════════════════════════════════════════════════╝");
        System.out.println(GREEN_TEXT + "\t\t\tPress Enter to continue..." + RESET);
        s.nextLine();
        clr.clearScreen();
        System.out.println("\n\n\n\n");
        System.out.println("\t\t\t╔══════════════════════════════════════════════════════════════════════════════════════════════════════════════╗");
        System.out.println("\t\t\t║                                                                                                              ║");
        System.out.println("\t\t\t║\t\t\t3. PRIVACY AND DATA USAGE                                                              ║");
        System.out.println("\t\t\t║\t\t\tYour email address will only be used for authentication,                               ║");
        System.out.println("\t\t\t║\t\t\tpassword recovery, and sending monthly reports or reminders for due bills.             ║");
        System.out.println("\t\t\t║\t\t\tWe do not share or sell your data to third parties.                                    ║");
        System.out.println("\t\t\t║\t\t\tSocial media platforms like Facebook or Twitter are not integrated into our system.    ║");
        System.out.println("\t\t\t║                                                                                                              ║");
        System.out.println("\t\t\t║\t\t\t4. USER RESPONSIBILITIES                                                               ║");
        System.out.println("\t\t\t║\t\t\tYou are responsible for maintaining the confidentiality of your login credentials.     ║");
        System.out.println("\t\t\t║\t\t\tThe accuracy of the financial data you input is solely your responsibility.            ║");
        System.out.println("\t\t\t║                                                                                                              ║");
        System.out.println("\t\t\t║\t\t\t5. SYSTEM LIMITATIONS                                                                  ║");
        System.out.println("\t\t\t║\t\t\tWhile we aim to provide accurate calculations and timely reminders,                    ║");
        System.out.println("\t\t\t║\t\t\the system is not liable for any errors, omissions, or delays in the information        ║");
        System.out.println("\t\t\t║\t\t\tprovided. Always verify your financial data independently.                             ║");
        System.out.println("\t\t\t║                                                                                                              ║");
        System.out.println("\t\t\t╚══════════════════════════════════════════════════════════════════════════════════════════════════════════════╝");
        System.out.println(GREEN_TEXT + "\t\t\t\tPress Enter to continue..." + RESET);
        s.nextLine();
        clr.clearScreen();
        System.out.println("\n\n\n\n\n");
        System.out.println("\t\t\t╔══════════════════════════════════════════════════════════════════════════════════════════════════════════════╗");
        System.out.println("\t\t\t║                                                                                                              ║");
        System.out.println("\t\t\t║\t\t\t6. PROHIBITED ACTIVITIES                                                               ║");
        System.out.println("\t\t\t║\t\t\tUsers agree not:                                                                       ║");
        System.out.println("\t\t\t║\t\t\tUse the system for illegal activities.                                                 ║");
        System.out.println("\t\t\t║\t\t\tAttempt to access unauthorized features or compromise system security.                 ║");
        System.out.println("\t\t\t║                                                                                                              ║");
        System.out.println("\t\t\t║\t\t\t7. CHANGES TO TERMS                                                                    ║");
        System.out.println("\t\t\t║\t\t\tWe reserve the right to update these terms at any time. Users                          ║");
        System.out.println("\t\t\t║\t\t\twill be notified of significant changes via email or within the                        ║");
        System.out.println("\t\t\t║\t\t\tapplication. Continued use of the system after such changes indicates acceptance.      ║");
        System.out.println("\t\t\t║                                                                                                              ║");
        System.out.println("\t\t\t║\t\t\t8. CONTACT INFORMATION                                                                 ║");
        System.out.println("\t\t\t║\t\t\tFor inquiries or issues, please contact us at [Your Contact Email].                    ║");
        System.out.println("\t\t\t║                                                                                                              ║");
        System.out.println("\t\t\t╚══════════════════════════════════════════════════════════════════════════════════════════════════════════════╝");
        System.out.println(GREEN_TEXT + "\t\t\t\tPress Enter to continue..." + RESET);
        s.nextLine();

        //s.close();  
        //if okay na lahat ng condition dapat may lalabaas na do you accept terms and condiitons
    }
}
