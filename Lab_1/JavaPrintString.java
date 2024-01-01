class PrintString{
	// OR This if the function Not static int count=0;
		public static void main(String args[]){
		int count=0;
	// OR this --> int count = 0;
			try{
				count = Integer.parseInt(args[1]);
				// OR this 
				
				/* for(int i = 0 ; i < count ; i++){
				System.out.println(args[0]);
				
			}*/
				
			}catch(NumberFormatException e){
				System.out.println("Invalid Number");
				}
					
			for(int i = 0 ; i < count ; i++){
				System.out.println(args[0]);
				
			}
					 
	}

}
