package iostreams.StoreAndRetrieveObject;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class RetrieveFloat {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("src/advanced/iostreams/StoreAndRetrieveObject/Floats.txt");
        DataInputStream dis = new DataInputStream(fis);

        int length = dis.readInt();
        float data;
        for (int i = 0; i<length; i++){
            data = dis.readFloat();
            System.out.println(data);
        }

        dis.close();
        fis.close();
    }
}
