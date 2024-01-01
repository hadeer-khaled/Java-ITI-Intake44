class PalindromeCheck{
	public static void main(String[] args){
		String str = args[0];
		int R = 0;
		int L = str.length() - 1 ;
		
		while(R < L && L < str.length()  ){
			if ( str.charAt(R) != str.charAt(L) ){
				System.out.println("Not Palondrome");
			break ;	
			}
			R++;
			L++;
		} 
		System.out.println("Palondrome");
	}
}
