package storage.products;
//
//import controller.data.CreateListProducts;
//import model.products.Laptop;
//import model.products.SmartPhone;
//import model.products.SmartWatch;
//import model.products.Tablet;
//
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.List;

public class ProductsListFile {
//    private final ProductsFile<Laptop> laptopProductsFile;
//    private final ProductsFile<SmartPhone> smartPhoneProductsFile;
//    private final ProductsFile<SmartWatch> smartWatchProductsFile;
//    private final ProductsFile<Tablet> tabletProductsFile;
//    private final CreateListProducts createListProduct;
//
//    public ProductsListFile() {
//        laptopProductsFile = new ProductsFile<>();
//        smartPhoneProductsFile = new ProductsFile<>();
//        smartWatchProductsFile = new ProductsFile<>();
//        tabletProductsFile = new ProductsFile<>();
//        createListProduct = new CreateListProducts();
//    }
//
//    public void setListLaptop() {
//        List<Laptop> laptopList = createListProduct.createLaptop();
//        laptopProductsFile.writeData(laptopList, "data/laptop.txt");
//    }

//    public void setListSmartPhone() {
//        List<SmartPhone> smartPhoneList = createListProduct.createSmartPhone();
//        smartPhoneProductsFile.writeData(smartPhoneList, "data/smartphone.txt");
//    }
//
//    public void setListSmartWatch() {
//        List<SmartWatch> smartWatchList = createListProduct.createSmartWatch();
//        smartWatchProductsFile.writeData(smartWatchList, "data/smartwatch.txt");
//    }
//
//    public void setListTablet() {
//        List<Tablet> tabletList = createListProduct.createTablet();
//        tabletProductsFile.writeData(tabletList, "data/tablet.txt");
//    }
//
//    public ArrayList<Laptop> getListLaptop() {
//        return (ArrayList<Laptop>) laptopProductsFile.readData("data/laptop.txt");
//    }
//
//    public ArrayList<SmartPhone> getListSmartPhone() {
//        return (ArrayList<SmartPhone>) smartPhoneProductsFile.readData("data/smartphone.txt");
//    }
//
//    public ArrayList<SmartWatch> getListSmartWatch() {
//        return (ArrayList<SmartWatch>) smartWatchProductsFile.readFile("data/smartwatch.txt");
//    }
//
//    public ArrayList<Tablet> getListTablet() {
//        return (ArrayList<Tablet>) tabletProductsFile.readFile("data/tablet.txt");
//    }
//
//    public boolean checkFile() {
//        if (getListLaptop() == null || getListTablet() == null || getListSmartPhone() == null || getListSmartWatch() == null) {
//            return true;
//        }
//        ArrayList<Laptop> list = getListLaptop();
//        ArrayList<SmartPhone> list1 = getListSmartPhone();
//        ArrayList<SmartWatch> list2 = getListSmartWatch();
//        ArrayList<Tablet> list3 = getListTablet();
//        Iterator<Laptop> iterator = list.iterator();
//        Iterator<SmartPhone> iterator1 = list1.iterator();
//        Iterator<SmartWatch> iterator2 = list2.iterator();
//        Iterator<Tablet> iterator3 = list3.iterator();
//        return (!iterator.hasNext() || !iterator1.hasNext() || !iterator2.hasNext() || !iterator3.hasNext());
//    }

}
