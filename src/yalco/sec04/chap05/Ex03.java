package yalco.sec04.chap05;

public class Ex03 {

    static void sayHello(){
        System.out.println("안녕하세요!");
    }

    static int count = 0;

    // 매개변수 없이 값만 반환하는 메소드
    // 외부 변수 값을 변화시킴(static이므로 static 변수만 가능)
    static int getCount(){
        System.out.println("카운트 증가");
        return ++count;
    }
    public static void main(String[] args) {
        sayHello();

        System.out.println("\n-----------------\n");

        int count1 = getCount();
        int count2 = getCount();
        int count3 = getCount();
        int count4 = getCount();


    }
}
