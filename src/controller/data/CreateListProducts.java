//package controller.data;
//
//import model.products.Laptop;
//import model.products.SmartPhone;
//
//import model.products.SmartWatch;
//import model.products.Tablet;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class CreateListProducts {
//    private final CreateProducts createProducts = new CreateProducts();
//
//    public CreateListProducts() {
//        createProducts.setProducts();
//    }
//
//    public List<Laptop> createLaptop() {
//        ArrayList<Laptop> laptopList = new ArrayList<>();
//        ArrayList<String> idLaptopList = createProducts.getIdLaptop();
//        ArrayList<String> nameLaptopList = createProducts.getNameLaptop();
//        ArrayList<String> priceLaptopList = createProducts.getPriceLaptop();
//        for (int i = 0; i < nameLaptopList.size(); i++) {
//            int id = Integer.parseInt(idLaptopList.get(i));
//            String name = nameLaptopList.get(i);
//            double price = Double.parseDouble(priceLaptopList.get(i));
//            Laptop laptop = new Laptop(id, name, price);
//            laptopList.add(laptop);
//        }
//        return laptopList;
//    }
//
//    public ArrayList<SmartPhone> createSmartPhone() {
//        ArrayList<SmartPhone> smartPhoneList = new ArrayList<>();
//        ArrayList<String> idSmartPhoneList = createProducts.getIdSmartPhone();
//        ArrayList<String> nameSmartPhoneList = createProducts.getNameSmartphone();
//        ArrayList<String> priceSmartPhoneList = createProducts.getPriceSmartphone();
//        for (int i = 0; i < nameSmartPhoneList.size(); i++) {
//            int id = Integer.parseInt(idSmartPhoneList.get(i));
//            String name = nameSmartPhoneList.get(i);
//            double price = Double.parseDouble(priceSmartPhoneList.get(i));
//            SmartPhone smartPhone = new SmartPhone(id, name, price);
//            smartPhoneList.add(smartPhone);
//        }
//        return smartPhoneList;
//    }
//
//    public ArrayList<SmartWatch> createSmartWatch() {
//        ArrayList<SmartWatch> smartWatchList = new ArrayList<>();
//        ArrayList<String> idSmartWatchList = createProducts.getIdSmartWatch();
//        ArrayList<String> nameSmartWatchList = createProducts.getNameSmartWatch();
//        ArrayList<String> priceSmartWatchList = createProducts.getPriceSmartWatch();
//        for (int i = 0; i < nameSmartWatchList.size(); i++) {
//            int id = Integer.parseInt(idSmartWatchList.get(i));
//            String name = nameSmartWatchList.get(i);
//            double price = Double.parseDouble(priceSmartWatchList.get(i));
//            SmartWatch smartWatch = new SmartWatch(id, name, price);
//            smartWatchList.add(smartWatch);
//        }
//        return smartWatchList;
//    }
//
//    public ArrayList<Tablet> createTablet() {
//        ArrayList<Tablet> tabletList = new ArrayList<>();
//        ArrayList<String> idTabletList = createProducts.getIdTablet();
//        ArrayList<String> nameTabletList = createProducts.getNameTablet();
//        ArrayList<String> priceTabletList = createProducts.getPriceTablet();
//        for (int i = 0; i < nameTabletList.size(); i++) {
//            int id = Integer.parseInt(idTabletList.get(i));
//            String name = nameTabletList.get(i);
//            double price = Double.parseDouble(priceTabletList.get(i));
//            Tablet tablet = new Tablet(id, name, price);
//            tabletList.add(tablet);
//        }
//        return tabletList;
//    }
//
//}
