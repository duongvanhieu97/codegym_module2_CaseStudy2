//package controller.data;
//
//import java.io.IOException;
//import java.util.ArrayList;
//
//public class CreateProducts {
//    private ArrayList<String> idLaptop;
//    private ArrayList<String> nameLaptop;
//    private ArrayList<String> priceLaptop;
//    private ArrayList<String> idSmartphone;
//    private ArrayList<String> nameSmartphone;
//    private ArrayList<String> priceSmartphone;
//    private ArrayList<String> idSmartWatch;
//    private ArrayList<String> nameSmartWatch;
//    private ArrayList<String> priceSmartWatch;
//    private ArrayList<String> idTablet;
//    private ArrayList<String> nameTablet;
//    private ArrayList<String> priceTablet;
//
//    public void setProducts() {
//        setIdLaptop();
//        setIdSmartphone();
//        setIdSmartWatch();
//        setIdTablet();
//        setNameLaptop();
//        setNameSmartphone();
//        setNameSmartWatch();
//        setNameTablet();
//        setPriceLaptop();
//        setPriceSmartphone();
//        setPriceSmartWatch();
//        setPriceTablet();
//    }
//
//    //    Laptop
//    public ArrayList<String> getIdLaptop() {
//        return idLaptop;
//    }
//
//    public void setIdLaptop() {
//        try {
//            idLaptop = new Laptop().createId(new Laptop().creatData());
//        } catch (IOException e) {
//            System.err.println(e.getMessage());
//        }
//
//    }
//
//    public ArrayList<String> getNameLaptop() {
//        return nameLaptop;
//    }
//
//    public void setNameLaptop() {
//        try {
//            nameLaptop = new Laptop().creatName(new Laptop().creatData());
//        } catch (IOException e) {
//            System.err.println(e.getMessage());
//        }
//    }
//
//    public ArrayList<String> getPriceLaptop() {
//        return priceLaptop;
//    }
//
//    public void setPriceLaptop() {
//        try {
//            priceLaptop = new Laptop().creatPrice(new Laptop().creatData());
//        } catch (IOException e) {
//            System.err.println(e.getMessage());
//        }
//    }
//
//    //    SmartPhone
//    public ArrayList<String> getIdSmartPhone() {
//        return idSmartphone;
//    }
//
//    public void setIdSmartphone() {
//        try {
//            idSmartphone = new SmartPhone().createId(new SmartPhone().creatData());
//
//        } catch (IOException e) {
//            System.err.println(e.getMessage());
//        }
//    }
//
//    public ArrayList<String> getNameSmartphone() {
//        return nameSmartphone;
//    }
//
//    public void setNameSmartphone() {
//        try {
//            nameSmartphone = new SmartPhone().creatName(new SmartPhone().creatData());
//        } catch (IOException e) {
//            System.err.println(e.getMessage());
//        }
//    }
//
//    public ArrayList<String> getPriceSmartphone() {
//        return priceSmartphone;
//    }
//
//    public void setPriceSmartphone() {
//        try {
//            priceSmartphone = new SmartPhone().creatPrice(new SmartPhone().creatData());
//        } catch (IOException e) {
//            System.err.println(e.getMessage());
//        }
//    }
//
//    //    SmartWatch
//    public ArrayList<String> getIdSmartWatch() {
//        return idSmartWatch;
//    }
//
//    public void setIdSmartWatch() {
//        try {
//            idSmartWatch = new SmartWatch().createId(new SmartWatch().creatData());
//
//        } catch (IOException e) {
//            System.err.println(e.getMessage());
//        }
//    }
//
//    public ArrayList<String> getNameSmartWatch() {
//        return nameSmartWatch;
//    }
//
//    public void setNameSmartWatch() {
//        try {
//            nameSmartWatch = new SmartWatch().creatName(new SmartWatch().creatData());
//        } catch (IOException e) {
//            System.err.println(e.getMessage());
//        }
//    }
//
//    public ArrayList<String> getPriceSmartWatch() {
//        return priceSmartWatch;
//    }
//
//    public void setPriceSmartWatch() {
//        try {
//            priceSmartWatch = new SmartWatch().creatPrice(new SmartWatch().creatData());
//        } catch (IOException e) {
//            System.err.println(e.getMessage());
//        }
//    }
//
//    //    Tablet
//    public ArrayList<String> getIdTablet() {
//        return idTablet;
//    }
//
//    public void setIdTablet() {
//        try {
//            idTablet = new Tablet().createId(new Tablet().creatData());
//
//        } catch (IOException e) {
//            System.err.println(e.getMessage());
//        }
//    }
//
//    public ArrayList<String> getNameTablet() {
//        return nameTablet;
//    }
//
//    public void setNameTablet() {
//        try {
//            nameTablet = new Tablet().creatName(new Tablet().creatData());
//        } catch (IOException e) {
//            System.err.println(e.getMessage());
//        }
//    }
//
//    public ArrayList<String> getPriceTablet() {
//        return priceTablet;
//    }
//
//    public void setPriceTablet() {
//        try {
//            priceTablet = new Tablet().creatPrice(new Tablet().creatData());
//        } catch (IOException e) {
//            System.err.println(e.getMessage());
//        }
//    }
//
//}
