package practice12;

class Complex {
    double real;
    double imag;

    void set(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    Complex sum(Complex other) {
        Complex result = new Complex();
        result.real = this.real + other.real;
        result.imag = this.imag + other.imag;
        return result;
    }

    public void display() {
        System.out.println(real + " + j" + imag);
    }

    public static void main(String[] args) {
        Complex c1 = new Complex();
        Complex c2 = new Complex();
        Complex c3;

        c1.set(2.5, 7.1);
        c2.set(4.2, 5.5);
        c3 = c1.sum(c2);

        System.out.println("Complex Number 1 = ");
        c1.display();

        System.out.println("Complex Number 2 = ");
        c2.display();

        System.out.println("Complex Number 3 = ");
        c3.display();
    }
}
