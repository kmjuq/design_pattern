package create.factory.simple;

public class SimpleFactory {

    public Product createProduct(String words) {
        switch (words) {
            case "A":
                return new ProductA();
            case "B":
                return new ProductB();
            default:
                return new Product();
        }
    }

}
