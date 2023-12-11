package banksystem;

public class TransferService {

    public void transfer(Account accountFrom, Account accountTo, int amount){
        int billFromAmount = accountFrom.getBilll().getAmount();
        int billToAmount = accountFrom.getBilll().getAmount();

        if (billFromAmount < amount){
            System.out.println("Перевод невозможен, недостаточно средств");
            accountFrom.getBilll().setAmount(billFromAmount - amount);
            accountTo.getBilll().setAmount(billToAmount + amount);
        } else {
            System.out.println("Происходит перевод средств с аккаунта - " +
                    accountFrom.getAccountHolder().getName() + " на аккаунт - " +
                    accountTo.getAccountHolder().getName());
            accountFrom.getBilll().setAmount(billFromAmount - amount);
            accountTo.getBilll().setAmount(billToAmount + amount);
            System.out.println("Перевод успешно завершен");
        }
    }

}
