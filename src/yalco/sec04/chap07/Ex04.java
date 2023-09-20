package yalco.sec04.chap07;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        while (sc.hasNextInt()){
//            int repeatCount = sc.nextInt();
//
//            //nextInt를 아래에서 바로 사용하면 루프마다 받음
//            //repeatCoun 변수에 담은 이유
//            for (int i = 0; i < repeatCount; i++) {
//                // print (ln이 붙지 않은) : 같은 줄에 이어 출력하라
//                System.out.print("호우 ");
//            }
//            System.out.println("");
//        }
//
//        sc.close();

        // 문자열 바로 입력하여 사용하기

        String[] strInputs = new String [5];

        for (int i = 0; i < strInputs.length; i++) {
            strInputs[i] = sc.nextLine();
        }

        sc.close();

        for (String str : strInputs){
            System.out.println(str);
        }
    }
}
