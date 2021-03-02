package create.factory.method;

import create.factory.pojo.ProductA;
import create.factory.pojo.ProductA1;

public class MethodFactoryA1 implements MethodFactory{
    @Override
    public ProductA create() {
        return new ProductA1();
    }
}
