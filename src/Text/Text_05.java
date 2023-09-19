package Text;

import java.util.ArrayList;
import java.util.Scanner;

public class Text_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> titles = new ArrayList<>();
        ArrayList<String> contents = new ArrayList<>();

        while (true) {
            System.out.printf("명령어 : ");
            String cmd = sc.nextLine();

            if (cmd.equals("exit")){
                System.out.println("프로그램을 종료합니다.");
            } else if (cmd.equals("add")) {
                System.out.printf("제목을 입력해주세요 : ");
                String title = sc.nextLine();
                System.out.printf("내용을 입력해주세요 : ");
                String content = sc.nextLine();

                titles.add(title);
                titles.add(content);

                System.out.println("게시물이 등록되었습니다.");
            } else if (cmd.equals("list")) {
                if (titles.size() == 0) {
                    System.out.println("등록된 게시물이 존재하지 않습니다.");
                    continue;
                }
                System.out.println("================");
                for (int i = 0; i < titles.size(); i++) {
                    System.out.printf("번호 : %d\n", i + 1);
                    System.out.printf("제목 : %s\n", titles.get(i));
                    System.out.println("================");
                }

            } else if (cmd.equals("update")) {
                System.out.printf("수정할 게시물 번호 : ");
                int target = sc.nextInt();
                int targetIdx = target - 1;
                sc.nextLine();

                if (targetIdx < 0 || target > titles.size()) {
                    System.out.println("존재하지 않는 게시물 번호입니다.");
                    continue;
                }

                System.out.printf("제목 : ");
                String title = sc.nextLine();
                System.out.printf("내용 : ");
                String content = sc.nextLine();

                titles.set(targetIdx, title);
                contents.set(targetIdx, title);
            }
        }
    }
}
