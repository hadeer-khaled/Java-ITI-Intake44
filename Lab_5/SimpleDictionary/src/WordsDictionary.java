import java.beans.PropertyEditorManager;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.TreeMap;
import java.util.Iterator;
import java.util.Collections;


public class WordsDictionary {
    private Map<Character, Set<String>> wordDict;

    public WordsDictionary() {
        this.wordDict = new TreeMap<>();
    }

    // -------------------------- insert ------------------------\\
    //1) insertEntry(key , words)
    public void insertEntry(char key, String... words) {
        if (!wordDict.containsKey(key)) {
            wordDict.put(key, new TreeSet<>());
        }
        for (String word : words) {
            wordDict.get(key).add(word);
        }
    }
    // 2)insertWords (words list)
    public void insertWords(String userWords) {
        Set<String> words  = extractStrings(userWords);
        for (String word : words) {
            char key = word.charAt(0);
            if (wordDict.containsKey(key)) {
                wordDict.get(key).add(word);
            }
            else{
                wordDict.put(key, new TreeSet<>());
                wordDict.get(key).add(word);
            }
        }
    }

    //--------------------------- Search -------------------------------\\
    // 1) printWordsStartWithLetter(char k)
    public Set<String> getWordsStartWithLetter( Character userKey){
        char key = userKey;
        if (!wordDict.containsKey(key)) {
            return Collections.emptySet();
        } else {
            return wordDict.get(userKey);
        }
    }
    // 2) searchByWord(String subWord)
    public Set<String> searchByWord(String subWord) {
        char key = subWord.charAt(0);
        Set<String> matchedWords = new TreeSet<>();

        if (!wordDict.containsKey(key)) {
            return Collections.emptySet();
        }
        else{
            Set<String> wordsSet = wordDict.get(key);
            for (String word : wordsSet) {
                if (word.contains(subWord)) {
                    matchedWords.add(word);
                }
            }
        return matchedWords;
        }
    }
    // ----------------------------- Remove --------------------------\\

    // 1) removeWprd()
    public void removeWord(String userword) {
        char key = userword.charAt(0);

        if (!wordDict.containsKey(key)) {
            System.out.println("This word does not exist");
            return;
        }

        Set<String> wordsSet = wordDict.get(key);
        boolean wordFound = wordsSet.removeIf(word -> word.contains(userword));

        if (!wordFound) {
            System.out.println("This word does not exist");
        }
        else System.out.println("This [ " + userword + " ] word has been removed successfully.");
    }

    // 2)  removeAllKey(char key)
    public void removeSet(Character userKey) {
        char key = userKey;
        if (!wordDict.containsKey(key)) {
            System.out.println("This [ " + key + " ] does not exist.");
        } else {

            Set<String> values = wordDict.get(key);
            values.clear();
            System.out.println("Set for letter " + key + " removed");
        }
    }


    //--------------------------- PrintDictionary() -------------------------------\\
    public void PrintDictionary(){
        for (Map.Entry<Character, Set<String>> entry : wordDict.entrySet()) {
        char key = entry.getKey();
        Set<String> value = entry.getValue();
        System.out.println(key + " -> " + value);
      }
    }

    // ---------------------- Private Helper Functinos ----------------------\\
    private static Set<String> extractStrings(String wordsList) {
        String[] wordsArray = wordsList.split("[\\s\\p{Punct}]");
        Set<String> result = new TreeSet<>();

        for (String word : wordsArray) {
            if (!word.isEmpty()) {
                result.add(word.trim().toLowerCase());
            }
        }
        System.out.println(result);
        return result;
    }


}

