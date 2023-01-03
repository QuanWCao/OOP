package lab11.example.adap;

public class BookAdapter extends BookToBuy {

    private BookToBorrow bookToBorrow;

    public BookAdapter(BookToBorrow bookToBorrow) {
        super(bookToBorrow.getPriceBorrow());
        this.bookToBorrow = bookToBorrow;
    }

    public double getPriceToBuy() {
        return bookToBorrow.getPriceBorrow() * 2;
    }
}
