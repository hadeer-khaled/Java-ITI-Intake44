class ReverseString{

	public static void main(String[] args){
		String str = args[0];
		int R = 0;
		int L = str.length() - 1 ;
		String reversedStr = " ";
		
		while(L >= 0){
		reversedStr+=str.charAt(L) ;
			/*temp    = str.charAt(R);
			str.charAt(R)  = str.charAt(L) ;
			str.charAt(L)  = temp ;*/
			//R++;
			L--;
		} 
		System.out.println(reversedStr);
	}
}
