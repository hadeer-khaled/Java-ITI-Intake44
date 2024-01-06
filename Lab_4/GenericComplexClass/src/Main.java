//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        GenericComplexClass<Integer> intC1 = new GenericComplexClass<>(100 ,200);
        System.out.print("intC1: ");
        intC1.displayComplex();

        GenericComplexClass<Integer> intC2 = new GenericComplexClass<>(10 , 20 );
        System.out.print("intC2: ");
        intC2.displayComplex();

        GenericComplexClass<Integer> intC3 = intC1.addComplex(intC2);
        System.out.print("intC1 + intC2: ");
        intC3.displayComplex();

        GenericComplexClass<Integer> intC4 = intC1.subtractComplex(intC2);
        System.out.print("intC1 - intC2: ");
        intC4.displayComplex();

        GenericComplexClass<Integer> intC5 = intC1.multiplyComplex(intC2);
        System.out.print("intC1 * intC2: ");
        intC5.displayComplex();

    }
}