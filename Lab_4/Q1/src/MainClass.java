import java.io.IOException;

// ------------------- Exception Class -----------------------\\

public class MainClass {
    public static void main(String[] args ){
        int num = -16;
        try {
            MathOperations op = new MathOperations();
            double res = op.squareRoot(num);
            System.out.println("Square root of "+ num + " =" + res);

        }
        catch(MathOperationsException exp){
            System.out.println("Math Exception: " + exp.getMessage());

        }

    }
}




 
 
 