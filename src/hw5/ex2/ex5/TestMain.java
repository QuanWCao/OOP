package hw5.ex2.ex5;

public class TestMain {
    public static void main(String[] args) {
        Customer customer1 = new Customer(101, "LienQuan", 'm');
        System.out.println(customer1);
        System.out.println("Id is: " + customer1.getId());
        System.out.println("Name is: " + customer1.getName());
        System.out.println("Gender is: " + customer1.getGender());

        Account account1 = new Account(21, customer1, 2020);
        System.out.println(account1);
        account1.setBalance(268);
        System.out.println("Id is: " + account1.getId());
        System.out.println("Customer is: " + account1.getCustomer());
        System.out.println("Balance is " + account1.getBalance());
        System.out.println("Customer's name is: " + account1.getCustomerName());
        account1.deposit(10);
        System.out.println(account1);
        account1.withdraw(1000.);
        System.out.println(account1);
        account1.withdraw(20000);
        System.out.println(account1);
    }


}
