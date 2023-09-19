package yalco.Chap03_08;

public class Ex01 {
    public static void main(String[] args) {
        // 배열은 사용할 자료형 뒤에 []를 붙여 선언한다.
        char[] yutnori = {'도', '개', '걸', '윷', '모'};

        // length : 배열의 길이 반환
        int length = yutnori.length;

        // []안에 인덱스 정수를 넣어 접근한다.
        // 0부터 시작
        char first = yutnori[0];
        char last = yutnori[yutnori.length - 1];


        //초기화하지 않고 일단 선언하기
        //어떤 값으로 초기화되는지 확인
        boolean[] boolAry = new boolean[3];
        int[] intAry = new int[3];
        double[] dblAry = new double[3];
        char[] chrAry = new char[3];
        String[] strAry = new String[3];

        // 아스키 코드의 0번 글자. 문자열의 끝을 표시하는데 사용
        char NUL = chrAry[0];

        //다음과 같이 원하는 위치의 값 변경
        intAry[0] = 123;
        intAry[1] = 456;
        intAry[2] = 789;

    }
}
