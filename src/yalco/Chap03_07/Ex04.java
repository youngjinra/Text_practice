package yalco.Chap03_07;

public class Ex04 {
    public static void main(String[] args) {
        String[] strFormats = {
                "%s", //기본
                "%9s", //자리 확보
                "%.2s", // ~글자만
                "%9.2s", //
                "%-9s", //왼쪽 정렬
        };

        String[] strResults = new String[strFormats.length];

        for (int i = 0; i < strFormats.length; i++) {
            String format = (i + 1) + ". ";
            for (int j = 0; j < 2; j++) {
                format += strFormats[i] + " ";
            }
            format = format.trim() + "%n%n";

            System.out.printf(format, "Hello", "하이염");

            strResults[i] = format.formatted("Hello", "하이염");

        }
    }
}
