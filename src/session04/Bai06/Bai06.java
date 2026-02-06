package session04.Bai06;

import java.util.regex.*;

public class Bai06 {
    public static void main(String[] args) {
        String review = "Cuốn sách này rất tệ " + "nội dung thật là ngu ngốc và không đáng được";

        String[] blacklist = {"ngu ngốc", "tệ", "không đáng được"};

        String regex = "\\b(" + String.join("|", blacklist) + ")\\b";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);

        String censoredReview = censorText(review, pattern);

        String finalReview = shortenText(censoredReview, 200);

        System.out.println("Review sau khi xử lý:");
        System.out.println(finalReview);
    }

    public static String censorText(String text, Pattern pattern) {
        Matcher matcher = pattern.matcher(text);
        StringBuffer result = new StringBuffer();

        while (matcher.find()) {
            String word = matcher.group();
            String stars = "*".repeat(word.length());
            matcher.appendReplacement(result, stars);
        }
        matcher.appendTail(result);

        return result.toString();
    }

    public static String shortenText(String text, int maxLength) {
        if (text.length() <= maxLength) {
            return text;
        }

        int lastSpace = text.lastIndexOf(" ", maxLength);
        if (lastSpace == -1) {
            lastSpace = maxLength;
        }

        StringBuilder sb = new StringBuilder();
        sb.append(text.substring(0, lastSpace));
        sb.append("...");

        return sb.toString();
    }
}
