package ictgradschool.industry.lab08.groupexercises;

public class GroupEx03 {

    public Customer readCustomer(String fileName) {

        Customer customer = new Customer();

        // TODO Complete this (use a Scanner)

        return customer;
    }

    public static void main(String[] args) {

        GroupEx03 ex03 = new GroupEx03();

        Customer readCustomer = ex03.readCustomer("customer.txt");
        System.out.println("Customer details:");
        System.out.println(readCustomer);
    }
}
