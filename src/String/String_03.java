package String;

import java.util.Scanner;

public class String_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("단어를 입력해주세요 : ");
        String word = sc.next();

        String[] array_word = new String[word.length()];
        String result;

        for (int i = 0; i < array_word.length; i++) {
            array_word[i] = Character.toString(word.charAt(i));
        }
        if (array_word.length % 2 == 0) {
            result = array_word[(array_word.length/2)-1] + array_word[(array_word.length/2)];
        } else {
            result = array_word[(array_word.length)/2];
        }
        System.out.println(result);
    }
}
