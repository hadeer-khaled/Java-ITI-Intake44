import java.util.function.BiPredicate;

interface FunctionalInterface {
    String betterString(String string1, String string2, BiPredicate<String, String> predicate);
}