class WordSearch {

    public static void searchFirstWay(String[] sentenceSplited, String word) {
        int count = 0;
        for (int i = 0; i < sentenceSplited.length; i++) {
            boolean res = sentenceSplited[i].equalsIgnoreCase(word);
            if (res) {
                count++;
            }
        }

        System.out.println("--------------------------- String Class Way 1 --------------------------- ");
        System.out.println("Occurrences of the word \"" + word + "\": " + count);
    }

    public static void searchSecondWay(String[] sentenceSplited, String word) {
        int count = 0;
        for (String str : sentenceSplited) {
            if (str.toLowerCase().compareTo(word.toLowerCase()) == 0) { // Corrected the syntax here
                count++;
            }
        }

        System.out.println("--------------------------- String Class Way 2 --------------------------- ");
        System.out.println("Occurrences of the word \"" + word + "\": " + count);
    }

    public static void main(String[] args) {
        String sentence = "this|is|the|java,,language|course,and i|hate|the| java|language";
        String word = "java";

        String[] sentenceSplited = sentence.replaceAll("\\p{Punct}+", " ").split(" ");
        searchFirstWay(sentenceSplited, word);
        searchSecondWay(sentenceSplited, word);
    }
}

