package yalco.sec04.chap04;

public class Ex04 {
    public static void main(String[] args) {

        int lineWidth = 5;

        while (lineWidth > 0){
            int starsToPrint = lineWidth--;
            while (starsToPrint-- > 0){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
