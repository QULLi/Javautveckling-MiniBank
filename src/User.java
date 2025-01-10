import java.util.ArrayList;

/**
 * Representerar en användare, med pinkod samt både Löne- och Sparkonto
 */
public class User {

    private String personalNumber;
    private int pinCode;

    private ArrayList<Account> accounts = new ArrayList<>();

    public User(String personalNumber, int pinCode){
        this.personalNumber = personalNumber;
        this.pinCode = pinCode;

        //Skapa konton under användare
        accounts.add(new Chequing(personalNumber));
        accounts.add(new Savings(personalNumber));

    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public String getPersonalNumber() {
        return personalNumber;
    }

    public int getPinCode() {
        return pinCode;
    }
}
