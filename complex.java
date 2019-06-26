class Complex {
    int real;
    int imaginary;

    public Complex(int real, int imaginary) {
        this(real);
        this.imaginary=imaginary;
    }

    public Complex(int real) {
        this.real=real;
    }

    public static void main(String[] args) {
        Complex c=new Complex(2,4);
        c.Display();
        Complex c1=new Complex(5,1);
        c1.Display();

        Addition(c,c1);
        Subtraction(c,c1);

    }

    static void Subtraction(Complex c, Complex c1) {
        System.out.println("Subtraction= "+(c.real-c1.real)+"+"+"("+(c.imaginary-c1.imaginary)+")"+"i");
    }

    static void Addition(Complex c, Complex c1) {
        System.out.println("Addition= "+(c.real+c1.real)+"+"+(c.imaginary+c1.imaginary)+"i");
    }

    void Display() {
        System.out.println("Complex number is : "+real+"+"+imaginary+"i");
    }
}