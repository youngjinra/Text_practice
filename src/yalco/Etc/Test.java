package yalco.Etc;

public class Test {
    public static void main(String[] args) {
        int int1 = "".length();
        int int2 = "Hello".length();
        int int3 = "김수한무 거북이와 두루미".length();

        String str1 = "";
        String str2 = " \t\n";

//        int int1 = str1.length();
//        int int2 = str2.length();

        //  💡isEmpty : 문자열의 길이가 0인지 여부
        boolean bool1 = str1.isEmpty();
        boolean bool2 = str2.isEmpty();

        //  💡isBlank : 공백(white space)을 제외한 문자열의 길이가 0인지 여부
        boolean bool3 = str1.isBlank();
        boolean bool4 = str2.isBlank();

        String str3 = "\t 에 네 르 기 파!! \n";

        //  💡 trim : 앞뒤의 공백(white space) 제거
        String str4 = str3.trim();

        //  변수 그 자체에 적용하기
        //  - 문자열은 불변 : 변수가 가리키는 종이를 바꾸는 것
        str3 = str3.trim();

        String str11 = "아야 슬슬 오함마 준비해야 쓰것다";

        //  💡 charAt : ~번째 문자 반환
        char ch1 = str11.charAt(0);
        char ch2 = str11.charAt(4);

        //  ⭐️ 마지막 문자 얻기
        char ch3 = str11.charAt(str11.length() - 1);

        //  💡 equals : 대소문자 구분하여 비교
        String str_a1 = "Hello World";
        String str_a2 = new String("Hello World");
        String str_a3 = "HELLO WORLD";

        boolean bool_a0 = str_a1 == str_a2;  // ⚠️ 문자열은 이렇게 비교하지 말 것!

        boolean bool_a1 = str_a1.equals(str_a2);
        boolean bool_a2 = str_a1.equals(str_a3);

        //  💡 equalsIgnoreCase : 대소문자 구분하지 않고 비교
        boolean bool_a3 = str_a1.equalsIgnoreCase(str_a3);
        boolean bool_a4 = str_a2.equalsIgnoreCase(str_a3);

        String str_b1 = "옛날에 호랑이가 한 마리 살았어요.";

        //  💡 contains : 포함 여부
        boolean bool_b1 = str_b1.contains("호랑이");
        boolean bool_b2 = str_b1.contains("나무꾼");

        //  💡 startsWith : (주어진 위치에서) 해당 문자열로 시작 여부
        boolean bool_b3 = str_b1.startsWith("옛날에");
        boolean bool_b4 = str_b1.startsWith("호랑이");
        boolean bool_b5 = str_b1.startsWith("호랑이", 4);

        //  💡 endsWith : 해당 문자열로 끝남 여부
        boolean bool_b6 = str_b1.endsWith("살았어요.");
        boolean bool_b7 = str_b1.endsWith("호랑이");

        String emailRegex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";

        String str_c1 = "yalco@yalco.kr";
        String str_c2 = "yalco.yalco.kr";
        String str_c3 = "yalco@yalco@kr";

        boolean bool_c1 = str_c1.matches(emailRegex);
        boolean bool_c2 = str_c2.matches(emailRegex);
        boolean bool_c3 = str_c3.matches(emailRegex);


    }
}
