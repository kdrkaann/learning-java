public class ProductValidator {
    public static boolean validateProduct(Product product){
        if(!product.name.isEmpty() && product.price != 0){
            System.out.println("Product is valid.");
            return true;
        }
        else{
            System.out.println("Invalid product!");
            return false;
        }
    }
}
