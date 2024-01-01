import java.util.StringTokenizer;

class WordSearchTokenizer {

    public static void main(String[] args) {
        // String sentence = "this is the java language course, and i hate the java language";
        String sentence = "this|is|the|java,language|course,and i|hate|the|java|language";
        String word = "java";

        // Using StringTokenizer with all separators
        //StringTokenizer tokenizer = new StringTokenizer(sentence, "\\p{Punct}+");
        StringTokenizer tokenizer = new StringTokenizer(sentence, " ");
        
        int count = 0;
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();

            String[] wordTokens = token.split("\\p{Punct}+");
            for (String wordToken : wordTokens) {
                System.out.println(wordToken);
                boolean res = wordToken.equalsIgnoreCase(word);
            	if (res) {
                	count++;
            	}
            }
        }

        System.out.println("Occurrences of the word \"" + word + "\": " + count);
     }

}

