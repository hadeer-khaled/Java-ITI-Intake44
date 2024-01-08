import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        WordsDictionary dictionary = new WordsDictionary();

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
//            System.out.println("1. Insert Entry(char key, String ...words)");
            System.out.println("1. Insert Words");
            System.out.println("2. Get Words Start With a specific Letter");
            System.out.println("3. Search By specific Word");
            System.out.println("4. Remove Word");
            System.out.println("5. Remove Set");
            System.out.println("6. Print Dictionary");

            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            // Read user input
            choice = scanner.nextInt();

            // Consume the newline character
            scanner.nextLine();

            // Process user's choice
            switch (choice) {
                case 1:
                    System.out.print(" Enter Words separated be space : ");
                    String  wordsList = scanner.nextLine();
                    System.out.println("You entered: " + wordsList);
                    dictionary.insertWords(wordsList);

                    break;
                case 2:
                    // printWordsStartWithLetter(char k)
                    Set<String> wordsSet = new TreeSet<>();
                    System.out.print("Enter a letter: ");
                    String userInput = scanner.next();
                    if ( !(userInput.length() == 1)) {
                        System.out.println("Invalid input. Please enter a single character.");
                    }
                    else {
                        char key = userInput.toLowerCase().charAt(0);
                         wordsSet = dictionary.getWordsStartWithLetter(key);
                         if(wordsSet.isEmpty()){
                              System.out.println(" This letter doesn't exist.");
                         }else {
                              System.out.println("Words that start with [ "+ key + " ] -> " + wordsSet);
                         }
                    }
                    break;
                case 3:
                   // searchByWord(String subWord)
                    System.out.print("Enter a word: ");
                    String userSubString = scanner.next();
                    String subStr = userSubString.toLowerCase();
                    Set<String> matchedWords = new TreeSet<>();
                    matchedWords = dictionary.searchByWord(subStr);
                    if(matchedWords.isEmpty()){
                        System.out.println(" There is no words contain [ "+ subStr + " ]");
                    }else {
                        System.out.println("Words that contain [ "+ subStr + " ] -> " + matchedWords);
                    }
                    break;
                case 4:
                    //  removeWord(String userword)
                    System.out.print("Enter a word: ");
                    String userWord = scanner.next();
                    String userword = userWord.toLowerCase();
                    dictionary.removeWord(userword)   ;
                    break;
                case 5:
                    // removeAllKey(char key)
                    System.out.print("Enter a letter: ");
                    String userLetter = scanner.next();
                    if ( !(userLetter.length() == 1)) {
                        System.out.println("Invalid input. Please enter a single character.");
                    }
                    else {
                        char userKey = userLetter.toLowerCase().charAt(0);
                        dictionary.removeSet(userKey);
                    }
                    break;
                case 6:
                    dictionary.PrintDictionary();
                    break;
                case 0:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
            System.out.println();

        } while (choice != 0);

        scanner.close();

    }
}
