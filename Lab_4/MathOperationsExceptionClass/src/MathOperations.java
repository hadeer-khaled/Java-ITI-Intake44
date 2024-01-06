public class MathOperations {
    public static double squareRoot (int num) throws MathOperationsException{
        if(num > 0){
            return Math.sqrt(num);
        }
        else{
            throw new MathOperationsException("Cannot not do square root operation on negative numbers");
        }
    }
}