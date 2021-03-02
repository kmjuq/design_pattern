package create.factory.bstrct;

import create.factory.pojo.ProductA;
import create.factory.pojo.ProductA1;
import create.factory.pojo.ProductB;
import create.factory.pojo.ProductB1;

public class AbStractMethodFactory1 implements AbstractMethodFactory{
    @Override
    public ProductA createA() {
        return new ProductA1();
    }

    @Override
    public ProductB createB() {
        return new ProductB1();
    }
}
