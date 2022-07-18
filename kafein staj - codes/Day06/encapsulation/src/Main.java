public class Main {
    public static void main(String[] args) {
        Product exampleProduct = new Product();
        exampleProduct.setName("Laptop");
        exampleProduct.setStockAmount(6);;
        exampleProduct.setDescription("Lenovo Gaming Laptop");
        exampleProduct.setPrice(10500);
        exampleProduct.setId(1);

        Product exampleProduct2 = new Product("Console", "Sony Playstation", 10000, 2, 12);

        System.out.println(exampleProduct.getName());
        System.out.println(exampleProduct.getDescription());
        System.out.println(exampleProduct.getStockAmount());
        System.out.println(exampleProduct.getPrice());
        System.out.println(exampleProduct.getId());

        System.out.println(exampleProduct2.getName());
        System.out.println(exampleProduct2.getDescription());
        System.out.println(exampleProduct2.getStockAmount());
        System.out.println(exampleProduct2.getPrice());
        System.out.println(exampleProduct2.getId());
    }
}