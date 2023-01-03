package com.decorator;

import CountryManager.countryarraymanager.Country;

import java.util.*;

public class BreadStore {
    private List<Bread> breads;

    public BreadStore() {
        breads = new LinkedList<>();
    }

    /**
     * Giả sử bánh mỳ được làm không cho một loại gia vị nhiều hơn một lần.
     * Bắt đầu, tạo ra và cho vào cửa hàng:
     * 5 bánh mỳ ThickcrustBread chỉ có cheese,
     * 5 bánh mỳ ThickcrustBread chỉ có olives,
     * 5 bánh mỳ ThickcrustBread có cả cheese và olives,
     * 5 bánh mỳ ThincrustBread chỉ có cheese,
     * 5 bánh mỳ ThincrustBread chỉ có olives,
     * 5 bánh mỳ ThincrustBread có cả cheese và olives.
     */
    public void init() {

        for (int i = 0; i < 5; i++) {
            add(new Cheese(new ThickcrustBread()));
            add(new Olives(new ThickcrustBread()));
            add(new Cheese(new Olives(new ThickcrustBread())));
            add(new Cheese(new ThincrustBread()));
            add(new Olives(new ThincrustBread()));
            add(new Cheese(new Olives(new ThincrustBread())));
        }
        /* TODO */
    }

    /**
     * Thêm bánh mỳ vào cửa hàng.
     */
    public void add(Bread bread) {

        breads.add(bread) ;



        /* TODO */
    }

    /**
     * Giả sử cửa hàng bán một cái bánh mỳ nào đó,
     * Bánh mỳ được lấy ra để bán là bánh mỳ đầu tiên có giá bằng giá
     * bánh mỳ yêu cầu.
     * Nếu còn bánh mỳ để bán thì trả về giá trị true,
     * nếu không còn trả về giá trị false.
     */
    public boolean sell(Bread bread) {
        if (this.breads.get(0).cost() == bread.cost()) {
            breads.remove(breads.get(0));
            return true;
        }
        return false;
        /* TODO */
    }

    /**
     * In ra những bánh mỳ còn trong cửa hàng.
     */
    public void print() {

        for (Bread e : breads) {
            System.out.println(e);
        }

        /* TODO */
    }

    /**
     * Sắp xếp các bánh mỳ còn lại theo thứ tự được cho bởi order,
     * nếu order là true, sắp xếp theo thứ tự tăng dần,
     * nếu order là false, sắp xếp theo thứ tự giảm dần.
     * Việc sắp xếp không làm thay đổi thứ tự của bánh mỳ trong cửa hàng.
     */
    public List<Bread> sort(boolean order) {

        List<Bread> breadList = new ArrayList<>(breads);
        breadList.sort(Comparator.comparingDouble(Bread::cost));
        if (order == false) {
            Collections.reverse(breadList);
        }
        return breadList;
    }

        /**
         * Lọc ra howMany cái bánh mỳ có giá cao nhất hoặc thấp nhất,
         * nếu order là true thì lọc ra bánh mỳ có giá cao nhất,
         * nếu order là false thì lọc ra bánh mỳ có giá thấp nhất.
         */
        public List<Bread> filter( int howMany, boolean order){
            List<Bread> result = new ArrayList<>();
            this.sort(order);

            for (int i = 0; i < howMany; i++) {
                result.add(breads.get(i));
            }
            return result;
            /* TODO */
        }


    public static void main(String args[]) {
        BreadStore breadStore = new BreadStore();
        breadStore.init();

        /*
         * Sau khi khởi tạo số bánh mỳ cho cửa hàng, viết chương trình demo:
         * - Thêm một số bánh mỳ vào cửa hàng
         * - Bán một số bánh mỳ từ cửa hàng
         * - In ra số bánh mỳ còn lại theo thứ tự giá tăng dần.
         * - In ra nhiều nhất 10 cái bánh mỳ có giá thấp nhất còn trong cửa hàng.
         */
        /* TODO */

    }
}
