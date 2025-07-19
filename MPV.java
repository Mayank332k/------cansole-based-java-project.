import java.util.*;
public class MPV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String usrname = "";
        int usrpin = 0;
        boolean repeated = true;
        float balance = 15000;

        while (repeated) {
            System.out.println("===== WELCOME TO MAYANK'S PRIVATE BANK =====");
            System.out.print("Press 1 to Create Account: ");
            int user = sc.nextInt();
            sc.nextLine(); 

            if (user == 1) {
                System.out.print("Create a username: ");
                usrname = sc.nextLine();

                System.out.println("Thank you " + usrname + " for choosing us!");

                System.out.print("Create a 4-digit PIN: ");
                usrpin = sc.nextInt();

                System.out.print("Re-enter your PIN: ");
                int usrpin2 = sc.nextInt();

                if (usrpin == usrpin2) {
                    System.out.println("Account created successfully 🎉");
                    repeated = false;
                } else {
                    System.out.println("❌ PIN verification failed! Please try again.");
                } 
            }
        }

        if (repeated == false){

            String userid = (usrname);
            int pin = (usrpin);
            int counter = 0;
            boolean value  = false;
        while (counter<3 || value == false) {    
        System.out.println("===== WELCOME TO MAYANK'S PRIVATE BANK =====");
        System.out.println("Enter password  for "+ usrname );
        int  verify  = sc.nextInt(); 
        if (verify == pin){
            value = true;
        }
        

        if (verify != pin){
            System.out.println("Incorrect pin try again");
            value = false;
            counter++;
        }

        if(counter == 3){
            System.out.println("You exceeded pass trial limit, account locked! Contact customer support)");
            value = false;
            return;
        } 

      while (value == true) {
        System.out.println("Welcome buddy!");
        System.out.println("<=== MENU ===>");
        System.out.println(" 1.Check balance");
        System.out.println(" 2.Deposit");
        System.out.println(" 3.Withdrawal");
        System.out.println(" 4.Exit");
        int choice = sc.nextInt();

        switch (choice) {
            case 1: System.out.println(balance);
                break;

            case 2: System.out.print("Enter deposit Amount :");
                    float deposit = sc.nextInt();
                    balance = balance + deposit;
                    System.out.println("Your new balance is " + balance);
                    break;


            case 3: System.out.print("Enter pin ");
            int pinver = sc.nextInt();
            if (pinver != pin){
                System.out.println("Incorrect pin :(");
                value = false;
            } else {
                System.out.print("Enter withdrawal amount : ");
                float amnt = sc.nextInt();
                if (amnt > balance){
                    System.out.println("Insufficient balance");
                    break;
                } else {
                balance =  balance - amnt;
                System.out.println("Your new balance is " + balance);
                break;
            }


            } case 4: System.out.println("Exited successfully, have a great day " + userid);
            return;
            
            default:
                break;
        }
    }
}
        }
    }
}

   