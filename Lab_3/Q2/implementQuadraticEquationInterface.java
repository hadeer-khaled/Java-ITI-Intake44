class CalculateQuadraticEquation implements QuadraticEquationInterface{
	@Override
	public String calcRoots(double a , double b , double c){
		double discriminant = b * b - 4 * a * c;
		 if (discriminant > 0) {
            		double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            		double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            		return "root1 = " +root1 + "root2 = " + root2;
        	} else if (discriminant == 0) {
        		double root= -b / (2 * a);
            		return "roots" +root ;
        	} else if ( a == 0){
			return "Error: Cannot divide by Zero "           ; 		
       		 }
       		 else {
       		 	return "discriminant Cannot be Negative "  ;
       		 }
		
	}
}
