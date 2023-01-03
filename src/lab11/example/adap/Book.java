package lab11.example.adap;

public class Book {

    private double price;

    public Book(double price) {

        this.price = price;

    }


    public double fitsPrice(BookToBuy book) {
        return book.getPriceToBuy() - this.price;
    }
}
