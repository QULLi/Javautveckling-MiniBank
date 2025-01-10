public class Chequing extends Account{

    public Chequing(String personalNumber){
        this.personalNumber = personalNumber;
        this.accountNumber++;
        this.balance = 0.0;
    }

}
