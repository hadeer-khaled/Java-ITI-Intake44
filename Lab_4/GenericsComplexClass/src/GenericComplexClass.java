public class GenericComplexClass<T extends Number> {
    private T real;
    private T imaginary;

    public GenericComplexClass(T real, T imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public void setReal(T real) {
        this.real = real;
    }

    public void setImaginary(T imaginary) {
        this.imaginary = imaginary;
    }

    public T getReal() {
        return this.real;
    }

    public T getImaginary() {
        return this.imaginary;
    }

    public void displayComplex() {

//        if (this.imaginary instanceof Double) {
//            double imagValue = this.imaginary.doubleValue();
//        }
//        else if (this.imaginary instanceof Float){
//            float imagValue = this.imaginary.floatValue();
//        }
//        else if (this.imaginary instanceof Long){
//            long imagValue = this.imaginary.longValue();
//        }
//        else {
//            int imagValue = this.imaginary.intValue();
//        }
        if (this.imaginary.doubleValue() == 0) {
                System.out.println("" + this.real);
            } else if (this.imaginary.doubleValue() > 0) {
            System.out.println(this.real + " + " +this.imaginary.doubleValue() + " i");
        } else {
            System.out.println(this.real + " " + this.imaginary.doubleValue()+ " i");
            }
    }

    public GenericComplexClass<T> addComplex(GenericComplexClass<T> otherComplex){
        T realPart        = add(this.real , otherComplex.real);
        T imaginaryPart  = add(this.imaginary , otherComplex.imaginary);
        return new GenericComplexClass(realPart , imaginaryPart);
    }
    public GenericComplexClass<T> subtractComplex(GenericComplexClass<T> otherComplex){
        T realPart        = subtract(this.real , otherComplex.real);
        T imaginaryPart  = subtract(this.imaginary , otherComplex.imaginary);
        return new GenericComplexClass(realPart , imaginaryPart);
    }
    public GenericComplexClass<T> multiplyComplex(GenericComplexClass<T> other){

        T realPart       = subtract( multiply(this.real , other.real) , multiply(this.imaginary , other.imaginary));
        T imaginaryPart  = add( multiply(this.real , other.imaginary) , multiply(this.imaginary , other.real) );
        return new GenericComplexClass(realPart , imaginaryPart);
    }

    //------------------------------- Private HelperMethods ------------------------------- \\
    private T add(T a, T b) {
        if (a instanceof Double) {
            return (T) Double.valueOf(a.doubleValue() + b.doubleValue());
        } else if (a instanceof Float) {
            return (T) Float.valueOf(a.floatValue() + b.floatValue());
        } else if (a instanceof Long) {
            return (T) Long.valueOf(a.longValue() + b.longValue());
        } else {
            return (T) Integer.valueOf(a.intValue() + b.intValue());
        }
    }
    private T subtract(T a, T b) {
        if (a instanceof Double) {
            return (T) Double.valueOf(a.doubleValue() - b.doubleValue());
        } else if (a instanceof Float) {
            return (T) Float.valueOf(a.floatValue() - b.floatValue());
        } else if (a instanceof Long) {
            return (T) Long.valueOf(a.longValue() - b.longValue());
        } else {
            return (T) Integer.valueOf(a.intValue() - b.intValue());
        }
    }
    private T multiply(T a, T b) {
        if (a instanceof Double) {
            return (T) Double.valueOf(a.doubleValue() * b.doubleValue());
        } else if (a instanceof Float) {
            return (T) Float.valueOf(a.floatValue() * b.floatValue());
        } else if (a instanceof Long) {
            return (T) Long.valueOf(a.longValue() * b.longValue());
        } else {
            return (T) Integer.valueOf(a.intValue() * b.intValue());
        }
    }
}

