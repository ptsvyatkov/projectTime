package iostreams.StoreAndRetrieveObject;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class StoreCustomer {
    public static void main(String[] args) throws IOException {
        Customer[] list = {new Customer("N1","P1"),new Customer("N2","P2"), new Customer("N3","P3")};
        int length = list.length;

        FileOutputStream fos = new FileOutputStream("src/advanced/iostreams/StoreAndRetrieveObject/Customer.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeInt(length);
        for (Customer c : list){
            oos.writeObject(c);
        }
        oos.close();
        fos.close();
    }
}
