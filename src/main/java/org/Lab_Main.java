package org;

import java.util.List;

public class Lab_Main {
    record Order(String customer, int total, boolean paid) {}

    public static void main(String[] args) {
        System.out.println("Starting Lab Main");
        List<Order> orders = List.of(
                new Order("Mila", 120, true), new Order("Oleg", 40, false),
                new Order("Mila", 80, true), new Order("Ira", 210, true)
        );
        int paidTotal = orders.stream().filter(Order::paid).mapToInt(Order::total).sum();
        List<String> premiumCustomers = orders.stream()
                .filter(order -> order.total() >= 100).map(Order::customer).distinct().toList();
        System.out.println("Paid total: " + paidTotal);
        System.out.println("Premium customers: " + premiumCustomers);
    }
}
