public class MyComplex {
    // 1 - Create Attributes
    private double real;
    private double img;

    //2- Default constructor
    public MyComplex() {
        real = 0.0;
        img = 0.0;
    }

    // 3- Constructor with parameters
    public MyComplex(double a, double bi) {
       real = a;
        img = bi;
    }

    // 4- Getters and Setters
    public double getReal() {
        return real;
    }

    public void setReal(double a) {
       real = a;
    }

    public double getImg() {
        return img;
    }

    public void setImg(double bi) {
        img = bi;
    }

    // toString method
    public String toString() {
        if (img < 0) {
            return real + " - " + img + "i";
        } else {
            return real + " + " + img + "i";
        }
    }

    // isReal method
    public boolean isReal() {
        return img == 0;
    }

    // isImaginary method
    public boolean isImaginary() {
        return real == 0;
    }

    // add method
    public void add(MyComplex c) {
        real += c.real;
        img += c.getImg();
    }

    // multiply method
    public void multiply(MyComplex c) {
        real *= c.real;
        img *= c.img;
    }

    // conjugate method
    public void conjugate() {
      double negated = -real + img;
    }

    // argument method
    public double argument() {
        return Math.atan2(img, real);
    }

    // magnitude method
    public double magnitude() {
        return Math.sqrt(real * real + img * img);
    }

    // Static methods

    // addNew method
    public static MyComplex addNew(MyComplex a, MyComplex b) {
        MyComplex result = new MyComplex();
        result.real = a.real + b.real;
        result.img = a.img + b.img;
        return result;
    }

    // multiplyNew method
    public static MyComplex multiplyNew(MyComplex a, MyComplex b) {
        MyComplex result = new MyComplex();
        result.real = a.real * b.real - a.img * b.img;
        result.img = a.real * b.img + a.img * b.real;
        return result;
    }
}

