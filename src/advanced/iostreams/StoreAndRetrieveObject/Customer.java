package iostreams.StoreAndRetrieveObject;

import java.io.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Customer implements Serializable {
    String custID;
    String name;
    String phoneNumber;
    private static final AtomicInteger count = new AtomicInteger(0);

    // non-argument constructor to work with serializable
    public Customer() {

    }

    public Customer(String n, String phno){
        custID = String.valueOf(count.incrementAndGet());
        name = n;
        phoneNumber = phno;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "custID='" + custID + '\'' +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
