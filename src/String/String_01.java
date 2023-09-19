package String;

public class String_01 {
    public static void main(String[] args) {
        String word = "POWER";
        String[] array_word;

        array_word = word.split("");

        for (int i = 0; i < array_word.length; i++) {
            System.out.println(array_word[i]);
        }
    }
}
