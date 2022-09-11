package controller.products;

public class ProductsManage {
//    private final ArrayList<Products> listProducts = new ArrayList<>();
//    private final ArrayList<Laptop> listLaptopProduct = new ArrayList<>();
//
//    private final ArrayList<SmartPhone> listSmartPhoneProduct = new ArrayList<>();
//    private final ArrayList<SmartWatch> listSmartWatchProduct = new ArrayList<>();
//
//    private final ArrayList<Tablet> listTabletProduct = new ArrayList<>();
//
//    private static final ProductsFile<Products> productsFile = new ProductsFile<>();
//    private static final ProductsListFile productsListFile = new ProductsListFile();
//
//    public ManegeProducts() {
//        createListProduct();
//    }
//
//    private void createListProduct() {
//        ArrayList<Laptop> listLaptop = productsListFile.getListLaptop();
//        ArrayList<SmartPhone> listSmartPhone = productsListFile.getListSmartPhone();
//        ArrayList<SmartWatch> listSmartWatch = productsListFile.getListSmartWatch();
//        ArrayList<Tablet> listTablet = productsListFile.getListTablet();
//
//        listLaptopProduct.addAll(listLaptop);
//
//        listSmartPhoneProduct.addAll(listSmartPhone);
//        listSmartWatchProduct.addAll(listSmartWatch);
//        listTabletProduct.addAll(listTablet);
//    }
//
//    public static void writeFile(List<Products> list) {
//        productsFile.writeData(list, "data/products.txt");
//    }
//
//    public static List<Products> readFile() {
//        return productsFile.readData("data/products.txt");
//    }
//
//    public List<Products> display() {
//        return readFile();
//    }
//
//    public static void addLaptop(int id, String name, double price) {
//        ArrayList<Products> list = (ArrayList<Products>) readFile();
//        ArrayList<Laptop> laptops = productsListFile.getListLaptop();
//        Products products = new Products(id, name, price);
//        list.add(products);
//        laptops.add(new Laptop(id, name, price));
//        writeFile(list);
//
//    }
//
//    public static boolean checkIdLaptop(int id) {
//        boolean check = false;
//        for (Laptop l : productsListFile.getListLaptop()
//        ) {
//            if (id == l.getId()) {
//                check = true;
//            }
//        }
//        return check;
//    }
}
