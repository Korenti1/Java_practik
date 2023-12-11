package banksystem;

import banksystem.Account;
import banksystem.Bill;

public class DepositeService {

    public void deposit(Account account, int amount){
        Bill bill = account.getBilll();
        int currentBillAmount = bill.getAmount();
        System.out.println("Операция пополнения счёта, текущее значение счёта: " + currentBillAmount);
        bill.setAmount(currentBillAmount + amount);
        System.out.println("Пополнение счёта прошло успешно, новое значение счёта: " + bill.getAmount());
    }

}
