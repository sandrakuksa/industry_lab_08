package ictgradschool.industry.lab08.groupexercises;

public class GroupEx02 {

    public void writeCustomer(Customer customer, String fileName) {

        // TODO Complete this (use a DataOutputStream)

    }

    public Customer readCustomer(String fileName) {

        Customer customer = new Customer();

        // TODO Complete this (use a DataInputStream)

        return customer;
    }

    public static void main(String[] args) {

        GroupEx02 ex02 = new GroupEx02();

        Customer customer = new Customer("Bob", 42, "123 Some Street", true);

        String fileName = "customerFile.dat";
        ex02.writeCustomer(customer, fileName);

        Customer readCustomer = ex02.readCustomer(fileName);
        System.out.println("Customer details:");
        System.out.println(readCustomer);
    }
}
