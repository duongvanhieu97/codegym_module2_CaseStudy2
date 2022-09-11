//package controller.data;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.net.URL;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class SmartWatch {
//    private final ArrayList<String> list = new ArrayList<>();
//    private final ArrayList<String> listName = new ArrayList<>();
//    private final ArrayList<String> listPrice = new ArrayList<>();
//    private final ArrayList<String> listID = new ArrayList<>();
//
//
//    public SmartWatch() {
//
//    }
//
//    public ArrayList<String> creatData() throws IOException {
//        URL url = new URL("https://tiki.vn/search?q=smartwatch");
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
//        String line;
//        while ((line = bufferedReader.readLine()) != null) {
//            list.add(line);
//        }
//        return list;
//    }
//
//    public ArrayList<String> createId(ArrayList<String> list) {
//        for (String string : list) {
//            Pattern pattern = Pattern.compile("<div class=\"name\"><h3>(.*?)</h3></div>");
//            Matcher matcher = pattern.matcher(string);
//            while (matcher.find()) {
//                listID.add(matcher.group(1));
//            }if (listID.size() == 8) {
//                break;
//            }
//        }
//        return listID;
//    }
//
//    public ArrayList<String> creatName(ArrayList<String> list) {
//        for (String sting : list) {
//            Pattern pattern = Pattern.compile("<div class=\"name\"><h3>(.*?)</h3></div>");
//            Matcher matcher = pattern.matcher(sting);
//            while (matcher.find()) {
//                listName.add(matcher.group(1));
//            }
//            if (listName.size() == 8) {
//                break;
//            }
//        }
//        return listName;
//    }
//
//    public ArrayList<String> creatPrice(ArrayList<String> list) {
//        for (String sting : list) {
//            Pattern pattern = Pattern.compile("<div class=\"price-discount__price\">(.*?)</div>");
//            Matcher matcher = pattern.matcher(sting);
//            while (matcher.find()) {
//                listPrice.add(matcher.group(1));
//            }
//            if (listPrice.size() == 8) {
//                break;
//            }
//        }
//        return listPrice;
//    }
//
//}
