package create.factory.simple;

import create.factory.pojo.ProductA;
import create.factory.pojo.ProductA1;
import create.factory.pojo.ProductA2;

public class SimpleFactory {

    public ProductA createProduct(String words) {
        switch (words) {
            case "1":
                return new ProductA1();
            case "2":
                return new ProductA2();
            default:
                return new ProductA();
        }
    }

}
