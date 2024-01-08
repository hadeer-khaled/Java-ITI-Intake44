import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    


        WordsDictionary dictionary = new WordsDictionary();

    // -------------------------------- insert ---------------------------------\\
        //1) insertEntry(key , words)

        dictionary.insertEntry('a', "apple","area" , "ali", "alaa", "areas" );

        // 2)insertWords (words list)
        dictionary.insertWords("day2", "hadeer" , "app", "Nour" , "Omar");


    //-------------------------------- Search -------------------------------------\\
        // 1) printWordsStartWithLetter(char k)
        Set<String> wordsSet = new TreeSet<>();
        char key = 'b';
        wordsSet = dictionary.getWordsStartWithLetter(key);
//        if(wordsSet.isEmpty()){
//            System.out.println(" This letter doesn't exist.");
//        }else {
//            System.out.println("Words that start with [ "+ key + " ] -> " + wordsSet);
//        }


        // 2) searchByWord(String subWord)
        Set<String> matchedWords = new TreeSet<>();
        String subStr = "ar";
        matchedWords = dictionary.searchByWord(subStr);
//        if(matchedWords.isEmpty()){
//            System.out.println(" There is no words contain [ "+ subStr + " ]");
//        }else {
//             System.out.println("Words that contain [ "+ subStr + " ] -> " + matchedWords);
//        }

    // ----------------------------------- Remove -------------------------------\\
    // 1) removeWord(String userword)
        String userword = "app";
//        dictionary.removeWord(userword)   ;

    // 2)  removeAllKey(char key)
        dictionary.removeSet('d');

    //--------------------------- PrintDictionary() -------------------------------\\
       dictionary.PrintDictionary();
    }
}
