package hw5.ex1.ex7;

public class MyComplex {

    private double real = 0.0;
    private double imag = 0.0;

    public MyComplex() {
        this.real = real;
        this.imag = imag;
    }

    public MyComplex(double real, double imag) {
        this.imag = imag;
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    @Override
    public String toString() {
        return "(" + this.real + " + " + this.imag + "i)";
    }

    public boolean isReal() {

        return this.imag == 0;
    }

    public boolean isImagianry() {

        return this.real == 0;
    }

    public boolean equals(double real, double imag) {
        return (this.real == real && this.imag == imag);
    }

    public boolean equals(MyComplex another) {

        return (this.real == another.getReal() && this.imag == another.getImag());
    }

    public double magnitude() {

        return Math.sqrt(this.real * this.real + this.imag * this.imag);
    }

    public MyComplex addInto(MyComplex right) {

        this.imag += right.getImag();
        this.real += right.getReal();

        return this;
    }

    public MyComplex addNew(MyComplex right) {

        return new MyComplex(right.getReal() + this.real, right.getImag() + this.imag);

    }


}

