package String;

import java.util.Scanner;

public class String_reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("단어 입력: ");
        String word = sc.next();

        String[] array_word = new String[word.length()];
        String result = "";

        for (int i = 0; i < array_word.length; i++) {
            array_word[i]=Character.toString(word.charAt(i));
        }

        for (int i = array_word.length-1; i >= 0; i--) {
            result+=array_word[i];
        }
        System.out.println(result);
    }
}
