import java.beans.PropertyEditorManager;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.TreeMap;



public class WordsDictionary {
    private Map<Character, Set<String>> wordDict;

    public WordsDictionary() {
        this.wordDict = new TreeMap<>();
    }
    public void addEntry(char key, String... words) {
        if (!wordDict.containsKey(key)) {
//            wordDict.put(key, new HashSet<>());
            wordDict.put(key, new TreeSet<>());
        }
        for (String word : words) {
            wordDict.get(key).add(word);
        }
    }
    public void addWord(String word) {
        char key = word.charAt(0);
        if (wordDict.containsKey(key)) {
            wordDict.get(key).add(word);
        }
        else{
            wordDict.put(key, new TreeSet<>());
            wordDict.get(key).add(word);
        }
    }
    public void addWords(String ...words) {
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
    public void printWordsStartWithLetter( Character userKey){
        char key = userKey;
        Set<String> value = wordDict.get(userKey);
        System.out.println(key + ": " + value);
    }
    public void searchByWord(String word){
        char key = word.charAt(0);
        boolean isExist = false ;
        if (wordDict.containsKey(key)){
            Set<String> wordsSet = wordDict.get(key);
            for (String sentence : wordsSet) {
                boolean containWord = sentence.contains(word);
                if(containWord){
                    isExist =true;
                    System.out.println(sentence);
                }
            }
            if(!isExist){
                System.out.println("this word doesnot exist");
            }
        }else {
            System.out.println("this word doesnot exist");
        }
    }
    public void removeWord(String userword){
        char key = userword.charAt(0);
        boolean isExist = false ;
        if (wordDict.containsKey(key)){
            Set<String> wordsSet = wordDict.get(key);
//            System.out.println(wordsSet);
            for(String word : wordsSet){
                System.out.println(word);
                boolean containWord = word.contains(userword);
                if(containWord){
                    isExist =true;
                    wordsSet.remove(word);
                }
            }
            if(!isExist){
                    System.out.println("this word doesnot exist");
                }
        }
        else{
            System.out.println("this word doesnot exist");
        }
    }
    public void PrintDictionary(){
        for (Map.Entry<Character, Set<String>> entry : wordDict.entrySet()) {
        char key = entry.getKey();
        Set<String> value = entry.getValue();
        System.out.println(key + ": " + value);
      }
    }

}
