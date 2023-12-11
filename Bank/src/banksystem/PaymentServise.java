package banksystem;

public class PaymentServise {

    public void pay(Account account, int amount){
        Bill bill = account.getBilll();
        if (bill.getAmount() < amount){
            System.out.println("Платеж невозможен, недостаточно средств");
        } else {
            int currentBillAmount = bill.getAmount();
            System.out.println("Происходит операция платежа, текущее значение счёта: " + currentBillAmount);
            bill.setAmount(currentBillAmount - amount);
            System.out.println("Платеж завершен, новое зачение счёта: " + bill.getAmount());
        }
    }

}
