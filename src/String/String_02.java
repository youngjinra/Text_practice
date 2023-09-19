package String;

public class String_02 {
    public static void main(String[] args) {
        String word = "POWER";
        char[] array_word = new char[word.length()];

        for (int i = 0; i < array_word.length; i++) {
            array_word[i]=(word.charAt(i));
            System.out.println(array_word[i]);

        }
    }
}
