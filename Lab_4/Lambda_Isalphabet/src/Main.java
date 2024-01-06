//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        StringChecker stringChecker = (s)->{
            for (char ch : s.toCharArray()) {
                if (!Character.isLetter(ch)) {return false; }
            }
            return true;
            };

        String s1 = "h@ader";
       if(  stringChecker.checkString(s1) ){
           System.out.println(s1 + " contains alphapets only.");
       }
       else {
           System.out.println(s1 + " doesn't contain only alphapets.");
       }
    }
}