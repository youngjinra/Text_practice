import java.util.ArrayList;
import java.util.Scanner;

public class Text_03_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> titles = new ArrayList<>();
        ArrayList<String> contents = new ArrayList<>();

        while (true) {
            System.out.printf("명령어 : ");
            String cmd = sc.nextLine();

            if (cmd.equals("exit")){
                System.out.println("프로그램 종료");
                break;
            } else if (cmd.equals("add")) {
                System.out.printf("게시물 제목 입력 : ");
                String title = sc.nextLine();
                System.out.printf("게시물 내용 입력 : ");
                String content = sc.nextLine();


                titles.add(title);
                contents.add(content);

                System.out.println("게시물 등록 완료");
            } else if (cmd.equals("list")) {
                if (titles.size() == 0){
                    System.out.println("등록된 게시물이 없습니다.");
                    continue;
                }
                System.out.println("-------------------");
                for (int i = 0; i < titles.size(); i++) {
                    System.out.printf("제목 : %s\n", titles.get(i));
                    System.out.printf("내용 : %s\n", contents.get(i));
                    System.out.println("-------------------");

                }
            }


        }
    }
}
