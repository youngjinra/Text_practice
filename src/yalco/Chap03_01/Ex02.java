package yalco.Chap03_01;

public class Ex02 {
    public static void main(String[] args) {
        byte byteNum;
        int smallIntNum = 123;

        //  명시적(강제) 형변환
        //  - 개발자 : "내가 책임질테니까 그냥 넣으세요."
        byteNum = (byte) smallIntNum;

        int intNum = 12345;

        byteNum = (byte) intNum;
    }
}
