package lab7.ex6;

abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void greets();
}
