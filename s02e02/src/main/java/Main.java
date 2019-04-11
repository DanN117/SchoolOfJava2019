import model.BankAccount;
import repositories.BankAccountRepository;
import services.BankAccountService;

public class Main {

    public static void main (String[] args) {

        // creeam 2 bank account, 2 obiecte java clasice
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();   // cu date si chestii

        // de introdus in "baza de date"

        // clasa service
        // fara controller
        BankAccountService bankAccountService = context.getBean(BankAccountService.class);
        bankAccountService.transferMoney("1", "2", 1337.f);  // de facut cum trebuie
        // se fac validari in service


        // system print out ambele conturi dupa transfer

    }
}
