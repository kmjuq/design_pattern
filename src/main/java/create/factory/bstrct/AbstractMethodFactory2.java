package create.factory.bstrct;

import create.factory.pojo.ProductA;
import create.factory.pojo.ProductA2;
import create.factory.pojo.ProductB;
import create.factory.pojo.ProductB2;

public class AbstractMethodFactory2 implements AbstractMethodFactory{
    @Override
    public ProductA createA() {
        return new ProductA2();
    }

    @Override
    public ProductB createB() {
        return new ProductB2();
    }
}
