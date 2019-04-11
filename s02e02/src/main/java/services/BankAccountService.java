package services;

import model.BankAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.BankAccountRepository;

@Service
public class BankAccountService {
    // injectam aici bank account cu autowired

    @Autowired
    private BankAccountRepository bankAccountRepository;

    public void addBankAccount(BankAccount account) {

    }


    public void transferMoney (String fromIBAN, String toIBAN, float amount) {
        BankAccount fromAccount = bankAccountRepository.getBankAccount(fromIBAN);
        BankAccount toBankAccount = bankAccountRepository.getBankAccount(toIBAN);
        if (fromAccount != null && toBankAccount != null)
        {
            // chestii cu getteri si setteri
        }

    }
}
