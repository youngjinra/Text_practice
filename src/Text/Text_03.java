package Text;

import java.util.Scanner;

public class Text_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String title = "";
        String content = "";


        while (true) {
            System.out.printf("명령어: ");
            String cmd = sc.nextLine();

            if (cmd.equals("exit")) {
                System.out.println("프로그램 종료");
            } else if (cmd.equals("add")) {
                System.out.printf("제목 입력: ");
                title = sc.nextLine();
                System.out.printf("내용 입력: ");
                content = sc.nextLine();
                System.out.println("게시물 등록 완료");
            }
                else if (cmd.equals("list")) {
                    System.out.println("================");
                    System.out.printf("제목 : %s\n", title);
                    System.out.printf("내용 : %s\n", content);
                    System.out.println("===============");
                }
            }
        }
    }