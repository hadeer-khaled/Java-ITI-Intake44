class PrintNumbers{
	public static void main(String[] args){
		if (args.length > 0) {
			if (Integer.parseInt(args[0])  > 0){
				System.out.println( Integer.parseInt(args[0]) + " is Positive");
			} else if  (Integer.parseInt(args[0]) < 0){
				System.out.println( Integer.parseInt(args[0]) + " is Negative");
			} else{
				System.out.println( Integer.parseInt(args[0]) + " is Not Positive nor Negative");
		}
            	
        } 	else {
            		System.out.println("No command-line arguments provided.");
      		}
	}
}
