import java.util.regex.Matcher;
import java.util.regex.Pattern;

class WordSearchRegex {

    public static void SearchUsingRegex(String sentence, String word) {
        Pattern pattern = Pattern.compile("\\b" + Pattern.quote(word) + "\\b", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(sentence);

        int count = 0;
        while (matcher.find()) {
            count++;
        }

         System.out.println("Occurrences of the word \"" + word + "\": " + count);
    }

    public static void main(String[] args) {
        String sentence = "this|is|the|java,,language|course,and i|hate|the| java|language";
        String word = "java";
	 SearchUsingRegex(sentence, word) ;
       
    }
}

