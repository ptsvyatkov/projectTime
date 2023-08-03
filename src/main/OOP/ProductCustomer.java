package OOP;

import java.util.Optional;

public class ProductCustomer {

    static class Product{
        private int  id;
        private String name;
        private double price;
        private int quantity;

        public Product(int id, String name, double price, int quantity){
            this.id = id;
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        public int getId() {
            return id;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public String getName(){
            return name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }
    }

    static class Customer{
        private String id;
        private String name;
        private String address;
        private String phone;

        public Customer(String id, String name){
            this.id = id;
            this.name = name;
        }

        public Customer(String id, String name, String address, String phone){
            this.id = id;
            this.name = name;
            setAddress(address);
            setPhone(phone);
        }

        public String getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getAddress() {
            return address;
        }

        public String getPhone() {
            return phone;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }
    }

    public static void main(String[] args) {
        Product p1 = new Product( 1, "Coffee", 3.00, 20 );
        Customer c1 = new Customer("1","John");
    }

}
