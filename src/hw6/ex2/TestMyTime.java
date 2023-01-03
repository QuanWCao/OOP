package hw6.ex2;

public class TestMyTime {
    public static void main(String[] args) {
        MyTime time = new MyTime(21, 11, 01);
        System.out.println(time);

        time.setHour(3);
        time.setMinute(2);
        time.setSecond(1);
        System.out.println(time);
        System.out.println("Hour: " + time.getHour());
        System.out.println("Minute: " + time.getMinute());
        System.out.println("Second: " + time.getSecond());

        time.setTime(23, 59, 58);
        System.out.println(time);
        System.out.println(time.nextSecond());
        System.out.println(time.nextSecond());
        System.out.println(time.nextMinute());
        System.out.println(time.nextHour());
        System.out.println(time.previousSecond());
        System.out.println(time.previousSecond());
        System.out.println(time.previousMinute());
        System.out.println(time.previousHour());
    }
}
