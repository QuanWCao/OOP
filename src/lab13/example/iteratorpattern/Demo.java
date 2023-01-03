package lab13.example.iteratorpattern;

public class Demo {

    public static void main(String[] args) {
        ProductCatalog productCatalog = new ProductCatalog(new String[]{"David", "Scott ", "Rhett ", "Andrew", "Jessica"});
        for (Iterator iterator = productCatalog.getIterator(); iterator.hasNext(); ) {
            System.out.println(iterator.next());
        }
    }

}
