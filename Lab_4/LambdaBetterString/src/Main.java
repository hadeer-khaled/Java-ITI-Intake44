public class Main {

    public static void main(String[] args) {

        FunctionalInterface longestStringFunction = (s1, s2, predicate) -> predicate.test(s1, s2) ? s1 : s2;

        String str1 = "hader";
        String str2 = "khaled";

        String longest = longestStringFunction.betterString(str1, str2, (s1, s2) -> s1.length() > s2.length());
        System.out.println("Longest string: " + longest);

        String first = longestStringFunction.betterString(str1, str2, (s1, s2) -> true);
        System.out.println("First string: " + first);
    }
}
