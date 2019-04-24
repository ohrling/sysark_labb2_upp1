public class ConcreteFactory1 extends AbstractFactory {
    @Override
    ProductA1 createProductA() {
        return new ProductA1();
    }

    @Override
    ProductB1 createProductB() {
        return new ProductB1();
    }
}
