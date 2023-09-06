//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class Text_05_01 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        ArrayList<Article> articles = new ArrayList<>();
//        int id = 1;
//
//        while (true) {
//            System.out.printf("명령어 : ");
//            String cmd = sc.nextLine();
//
//            if (cmd.equals("exit")){
//                System.out.println("프로그램 종료");
//            } else if (cmd.equals("add")) {
//                System.out.printf("제목 입력: ");
//                String title = sc.nextLine();
//                System.out.printf("내용 입력: ");
//                String content = sc.nextLine();
//
//
//                System.out.println("게시물 등록 완료");
//            } else if (cmd.equals("list")){
//                    if (articles.size() == 0){
//                    System.out.println("등록된 게시물이 없어용");
//                    continue;
//                }
//                System.out.println("=============");
//                for (int i = 0; i < articles.size(); i++) {
//                    Article article = articles.get(i);
//
//                    System.out.printf("번호 : %d\n", article.getNo());
//                    System.out.printf("제목 : %s\n", article.getTitle());
//                    System.out.println("================");
//                }
//                }
//            } else if(cmd.equals("update")){
//                System.out.printf("수정할 게시물 번호 : ");
//                int target = sc.nextInt();
//                int targetIdx = target - 1;
//                sc.nextLine();
//
//                if (targetIdx < 0 || target > titles.size()) {
//                    System.out.println("없는 게시물 번호입니다.");
//                    continue;
//                }
//
//                System.out.printf("제목 :");
//                String title = sc.nextLine();
//                System.out.printf("내용 :");
//                String content = sc.nextLine();
//
//                titles.set(targetIdx, title);
//                contents.set(targetIdx, content);
//
//            } else if (cmd.equals("delete")) {
//                System.out.printf("삭제할 게시물 번호 : ");
//                int target = sc.nextInt();
//                int targetIdx = target - 1;
//                sc.nextLine();
//
//                if (targetIdx < 0 || target > titles.size()) {
//                    System.out.println("없는 게시물 번호입니다.");
//                    continue;
//                }
//
//                titles.remove(targetIdx);
//                contents.remove(targetIdx);
//
//                System.out.printf("%d번 게시물이 삭제되었습니다.\n", target);
//            }
//        }
//
//    }
//}
