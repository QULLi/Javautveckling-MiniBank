/**
 * Representerar ett konto - abstrakt metod som ärvs av Löne- resp. Sparkonto
 */
public abstract class Account {

    protected String personalNumber;
    protected static long accountNumber; //Skapas unikt
    protected double balance;

}
