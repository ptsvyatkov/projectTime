package iostreams.StoreAndRetrieveObject;
import java.io.*;

public class StoreFloat {
    public static void main(String[] args) throws Exception {
        float[] list = {1.5f, 3.3f, 4.8f, 10.1f};
        FileOutputStream fos = new FileOutputStream("src/advanced/iostreams/StoreAndRetrieveObject/Floats.txt");
        DataOutputStream dos = new DataOutputStream(fos);
        dos.writeInt(list.length);
        for (float f : list){
            dos.writeFloat(f);
        }

        dos.close();
        fos.close();
    }
}

