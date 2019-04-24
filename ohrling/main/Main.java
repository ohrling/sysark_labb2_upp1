import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static Client client = new Client();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            int choice = 0;
            System.out.println("Tillgängliga produkter:");
            System.out.println("1. Produkt A1");
            System.out.println("2. Produkt B1");
            System.out.println("3. Produkt A2");
            System.out.println("4. Produkt B2");
            System.out.println("7. Skriv ut listan på produkter");
            System.out.println("9. Avsluta");
            System.out.println("=====================");
            System.out.println("Ange önskad produkt: ");
            try {
                choice = Integer.parseInt(br.readLine());
            } catch (NumberFormatException nfe) {
                System.out.println("Ogiltigt val!");
            }
            if(choice > 0 && choice < 5) {
                client.addProduct(choice);
            } else if (choice == 7) {
                client.printProducts();
            } else if(choice == 9) {
                System.out.println("\nTack för denna gång!");
                break;
            } else {
                System.out.println("\nOgiltigt val.");
            }
            System.out.println("\n");
        }
    }
}
