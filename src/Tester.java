public class Tester {


    public static void main(String[] args) {

        /**
         *  testing for the Account.java file in tester and testing inputs
         *  creates new accounts with names. attach accountId to the name and displays it to the
         *  console.
         *
         */
        Account account1 = new Account("John", "Doe");
        Account account2 = new Account("Jane", "Doe");


        System.out.println("Account 1 Full Name: " + account1.getFullName());
        System.out.println("Account 1 ID: " + account1.getAccountId());

        System.out.println();

        System.out.println("Account 2 Full Name: " + account2.getFullName());
        System.out.println("Account 2 ID: " + account2.getAccountId());



    }
}
