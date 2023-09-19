package String;

import java.util.Scanner;

public class String_substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("단어 입력:");
        String word=sc.next();
        System.out.println(word.substring((word.length()-1)/2, word.length()));
    }
}
