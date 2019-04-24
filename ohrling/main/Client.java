import java.util.ArrayList;
import java.util.List;

public class Client {
    private List<Object> products = new ArrayList<>();

    public void addProduct(int i){
        switch (i) {
            case 1:
                products.add(new ConcreteFactory1().createProductA());
                break;
            case 2:
                products.add(new ConcreteFactory1().createProductB());
                break;
            case 3:
                products.add(new ConcreteFactory2().createProductA());
                break;
            case 4:
                products.add(new ConcreteFactory2().createProductB());
                break;
        }
    }
    public void printProducts() {
        for (Object prod :
                products) {
            System.out.println("\t" + prod.toString());
        }
    }
}
