package yalco.sec04.chap04;

public class Ex02 {
    public static void main(String[] args) {

        // 100 보다 작은 3의 배수를 출력해보자

//        int i = 1;

        // 의도대로 작동하지 않는다. 이유는? 12번 라인에 체크하고 디버깅을 해보면 알 수 있다
//        while (true){
//            if (i % 3 != 0) continue;
//            System.out.println(i);
//
//            if (i++ == 100) break;
//        }
//        int i = 1;
//        while (true) {
//            if (i++ == 100) break;
//            if ((i - 1) % 3 != 0) continue;
//
//            System.out.println(i - 1);
//        }

        // 보다 가독성을 높이고 의도를 잘 드러낸 코드
        int i = 1;

        while (true) {
            int cur = i++;

            if (cur == 100) break;
            if (cur % 3 != 0) continue;

            System.out.println(cur);
        }

    }
}
