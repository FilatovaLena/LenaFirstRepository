package m6Filatova;


import com.beust.ah.A;

public class BankMain {

    public static void main(String[] args) {



        Manager employee1 = new Manager("John Smith", 1, "Manager", "09.09.1977", 10000, "Toronto");

        Clerk employee2 = new Clerk("Martha", 2, "Clerk", "12.10.1995", 3000, "Toronto");
        Clerk employee3 = new Clerk("Samanta", 3, "Clerk", "04.07.1990", 3000, "Toronto");
        Clerk employee4 = new Clerk("Mitch", 4, "Clerk", "12.12.1993", 3000, "Toronto");

        Accountant employee5 = new Accountant("Petr S", 5, "Accountant", "08.08.2000", 5000, "Toronto");
        Accountant employee6 = new Accountant("Alla", 6, "Accountant", "08.08.2000", 5000, "Toronto");
        Accountant employee7 = new Accountant("Tamar", 7, "Accountant", "08.08.2000", 5000, "Toronto");
        Accountant employee8 = new Accountant("Stephan", 8, "Accountant", "08.08.2000", 5000, "Toronto");
        Accountant employee9 = new Accountant("Georg", 9, "Accountant", "08.08.2000", 5000, "Toronto");

        Manager manager = new Manager();
        System.out.println();
        manager.hireSomeone(employee1,employee2);


        Clerk clerk = new Clerk();
        System.out.println();
        clerk.callToTheCustomer (employee3);

        Clerk clerk1 = new Clerk();
        System.out.println();
        clerk.answerIncomingCalls (employee4);

        Accountant accountant = new Accountant();
        System.out.println();
        accountant.createReport (employee6);


    }
}
