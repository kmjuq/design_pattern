package create.factory.method;

import create.factory.pojo.ProductA;
import create.factory.pojo.ProductA2;

public class MethodFactoryA2 implements MethodFactory{
    @Override
    public ProductA create() {
        return new ProductA2();
    }
}
