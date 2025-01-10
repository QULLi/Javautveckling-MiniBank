import java.util.ArrayList;
import java.util.Scanner;

/*
Funktionalitet för att registrera användare med pers.nr. samt pinkod, inkl. konton som skapas unikt
- Innehåller ingen validering för inmatningar
- Ingen felkontrollering implementerad
 */

public class Main {

    static Scanner scn = new Scanner(System.in);

    public static ArrayList<User> users = new ArrayList<>();



    public static void main(String[] args) {

        //Todo: Huvudmeny
        boolean exit = false;
        int choise;
        while(!exit){
            mainMenu();
            choise = scn.nextInt();
            scn.nextLine(); //Rensa Scanner för kommande inmatning

            switch (choise){
                case 1:
                    createUser();
                    //test
                    for(User u: users)
                        System.out.println(u.getPersonalNumber() + " " +
                                            u.getPinCode());
                    break;
                case 2:
                    break;
                case 0:
                    exit = true;
                    break;
                default:
                    System.out.println("Incorrect input!");
            }
        }


        //Todo: Logga in

        //Todo: Meny Efter inloggning

        //Todo: Överföring

        //Todo: Övrigt
//        * Felhantering
//        * Validering
//        * Kommentarer
//        * Beskrivande namn
//        * Klass/Metod för inmatning
    }

    public static void mainMenu(){
        System.out.println("Main menu:\n" +
                            "1. Create user\n" +
                            "2. Login\n" +
                            "0. Exit");
    }

    //Todo: Skapa användare
    public static void createUser() {
        System.out.println("Personal nr:");
        String personalNumber = scn.nextLine();

        System.out.println("PIN: ");
        int pinCode = scn.nextInt();

        users.add(new User(personalNumber, pinCode));

    }
}