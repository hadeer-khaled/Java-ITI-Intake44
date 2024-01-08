
import java.util.Map;
import java.util.Set;
public class Main {
    public static void main(String[] args) {
        WordsDictionary dictionary = new WordsDictionary();

        dictionary.addEntry('p', "parent");

        dictionary.addEntry('a', "apple","area" , "ali", "alaa", "areas" );

        dictionary.addWords("day2", "hadeer" , "app");

        dictionary.addWord("day");

//        dictionary.searchByWord("are");
        dictionary.PrintDictionary();

        dictionary.removeWord("are");

//        dictionary.printWordsStartWithLetter('a');

    }
}
