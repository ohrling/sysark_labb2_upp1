public class ConcreteFactory2 extends AbstractFactory {
    @Override
    ProductA2 createProductA() {
        return new ProductA2();
    }

    @Override
    ProductB2 createProductB() {
        return new ProductB2();
    }
}
