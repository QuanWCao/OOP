package lab13.example.builderpattern;

public class Client {

    public static void main(String[] args) {
        BankAccount newAccount = new BankAccount.BankAccountBuilder("OOPBank", " 0123456789 ").setAddress("Hn").setEmail("contact@oopbank.com").setNewsletter(true).setMobileBanking(true).build();

        System.out.println(newAccount.toString());
    }
}
