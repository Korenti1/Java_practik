import banksystem.*;

public class Main {
    public static void main(String[] args) {
        Person loriPerson = new Person("Lori", "+137879093", "Cat");
        Bill loriBill = new Bill(10000);
        Account loriAccount = new Account(loriPerson, loriBill);

        Person martinPerson = new Person("Martin", "+192734637", "Dog");
        Bill martinBill = new Bill(8000);
        Account martinAccount = new Account(martinPerson, martinBill);

        PaymentServise paymentServise = new PaymentServise();
        paymentServise.pay(loriAccount, 1000);
        paymentServise.pay(martinAccount, 1500);

        DepositeService depositeService = new DepositeService();
        depositeService.deposit(loriAccount, 3000);
        depositeService. deposit(martinAccount, 3500);

        TransferService transferService = new TransferService();
        transferService.transfer(loriAccount, martinAccount, 30000);
    }
}