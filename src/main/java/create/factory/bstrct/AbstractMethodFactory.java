package create.factory.bstrct;

import create.factory.pojo.ProductA;
import create.factory.pojo.ProductB;

public interface AbstractMethodFactory {

    ProductA createA();

    ProductB createB();

}