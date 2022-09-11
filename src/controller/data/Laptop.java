package controller.data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Laptop {
    private final List<String> list = new ArrayList<>();
    private final List<String> listName = new ArrayList<>();
    private final List<String> listPrice = new ArrayList<>();
    private final List<String> ListID = new ArrayList<>();


    public Laptop() {

    }

    public List<String> creatData() throws IOException {
        URL url = new URL("https://tiki.vn/search?q=laptop");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            list.add(line);
        }
        return list;
    }

    public int creatId(List<String> list) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            count ++;
        }
        return count;
    }

    public List<String> creatName(List<String> list) {
        for (String sting : list) {
            Pattern pattern = Pattern.compile("<div class=\"name\"><h3>(.*?)</h3></div>");
            Matcher matcher = pattern.matcher(sting);
            while (matcher.find()) {
                listName.add(matcher.group(1));
            }
        }
        return listName;
    }

    public List<String> creatPrice(List<String> list) {
        for (String sting : list) {
            Pattern pattern = Pattern.compile("<div class=\"price-discount__price\">(.*?)</div>");
            Matcher matcher = pattern.matcher(sting);
            while (matcher.find()) {
                listPrice.add(matcher.group(1));
            }
        }
        return listPrice;
    }

    //   crawl name
//public static void main(String[] args) {
//
//    try {
//
//        URL url = new URL("https://tiki.vn/search?q=laptop");
//        Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
//        scanner.useDelimiter("\\Z");
//
//        String content = scanner.next();
//        scanner.close();
//        content = content.replaceAll("\\n+", "");
//        Pattern pattern = Pattern.compile("<div class=\"name\"><h3>(.*?)</h3></div>");
//
//        Matcher m = pattern.matcher(content);
//
//        while (m.find()) {
//            System.out.println("name: " + m.group(1));
//
//        }
//
//    } catch (Exception exception) {
//        exception.printStackTrace();
//    }
//}
//public static void main(String[] args) {
//    try {
//
//        URL url = new URL("https://tiki.vn/search?q=laptop");
//        Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
//        scanner.useDelimiter("\\Z");
//
//        String content = scanner.next();
//        scanner.close();
//        content = content.replaceAll("\\n+", "");
//        Pattern pattern = Pattern.compile("<div class=\"price-discount__price\">(.*?)</div>");
//
//        Matcher m = pattern.matcher(content);
//
//        while (m.find()) {
//            System.out.println("price: " + m.group(1));
//
//        }
//
//    } catch (Exception exception) {
//        exception.printStackTrace();
//    }
//}

}
