package yalco.Etc;

public class Test3 {
    public static void main(String[] args) {
        String str_a1 = "덜컹";

        // 💡 repeat : 문자열을 주어진 정수만큼 반복
        String str_a2 = str_a1.repeat(2);
        String str_a3 = str_a1
                .concat(" ")
                .repeat(3)
                .trim();

        String str_b1 = "대한민국 다 job 구하라 그래";

        //  💡 substring : ~번째 문자부터 (~번째 문자까지) 잘라서 반환
        String str_b2 = str_b1.substring(7);
        String str_b3 = str_b1.substring(7, 10);
        String str_b4 = str_b1.substring(11, 14);

        String piece1 = "다 ";
        String piece2 = "구하라";
        String str_b5 = str_b1.substring(
                str_b1.indexOf(piece1),
                str_b1.indexOf(piece2) + piece2.length()
        );

        //  메서드 체이닝
        String str_d1 = "하여튼 호의가 반복되면 권리인 줄 알아";
        String str_d2 = str_d1
                .replace("하여튼", "아무튼")
                .replace("호의", "호이".repeat(2))
                .replace("권리", "아기공룡 둘리");
    }
}
