public class Main {
    public static void main(String[] args) {

        Product exampleProduct = new Product();
        exampleProduct.name = "keyboard";
        exampleProduct.id = 123;
        exampleProduct.price = 30;

        ProductManager productManager = new ProductManager();

        if(ProductValidator.validateProduct(exampleProduct)){
            productManager.addToDatabase(exampleProduct);
        }
    }
}
