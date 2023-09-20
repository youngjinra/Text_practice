package yalco.sec04.chap04;

public class Ex01 {
    public static void main(String[] args) {

        int i = 0;

        // while 문의 괄호에는 종료조건만 들어간다.
        while (i < 10){
            //종료조건 충족을 위한 값 변화는 외적으로
            System.out.println(i++);
        }

        double popInBillion = 7.837;

        //break를 통한 반복 탈출
        while (true){
            System.out.println("세계인구: " + (popInBillion -= 0.1));
            if (popInBillion <= 0) break;

            System.out.println("인간의 욕심은 끝이 없고");
            System.out.println("실수는 반복된다.");

        }
    }
}
