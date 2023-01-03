package lab11.example.adap;

public class Test {

    public static void main(String[] args) {

        Book book1 = new Book(5);
        BookToBuy bookToBuys = new BookToBuy(6);

        System.out.println("price difference:" + book1.fitsPrice(bookToBuys));

        BookToBorrow bookToBorrow = new BookToBorrow(6);
        BookAdapter bookAdapter = new BookAdapter(bookToBorrow);

        System.out.println("price difference:" + book1.fitsPrice(bookAdapter));


    }
}
