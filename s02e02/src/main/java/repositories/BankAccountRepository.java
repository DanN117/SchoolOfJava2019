package repositories;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BankAccountRepository {

    private List<BankAccountRepository> bankAccountList = new ArrayList<>();

    public void insertBankAccount (BankAccountRepository bankAccount) {
        bankAccountList.add(bankAccount);
    }

    public ArrayList<BankAccountRepository> getAllBank() {
        return (ArrayList<BankAccountRepository>) bankAccountList;
    }

    public BankAccountRepository getBankAccount (String iBan) {

        for (BankAccountRepository it: bankAccountList) {
            if ("it. bank account getter".equals(iBan))
            {
                return it;
            }
            else
            {
                return null;
            }

        }

        return null;
    }
}
