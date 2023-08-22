package iostreams.StoreAndRetrieveObject;

import java.io.*;

public class RetrieveCustomer {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("src/advanced/iostreams/StoreAndRetrieveObject/Customer.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        int length = ois.readInt();
        Customer[] list = new Customer[length];
        for (int i = 0; i < length; i++) {
            list[i] = (Customer) ois.readObject();
            System.out.println(list[i]);
        }

        ois.close();
        fis.close();
    }
}
