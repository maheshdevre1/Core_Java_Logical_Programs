package java8Program;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Order {
    int id;
    String product;
    String date;

    public Order(int id, String product, String date) throws ParseException {
        this.id = id;
        this.product = product;
        // Assuming all dates are from the same year (2025)
        this.date = date;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Product: " + product + ", Date: " + date;
    }
}

public class LatestOrderFinder {
	public static void main(String[] args) throws ParseException {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order(1, "HeadPhone", "1 Jan"));
        orders.add(new Order(2, "Mobile", "8 Oct"));
        orders.add(new Order(3, "Laptop", "9 Sept"));
        orders.add(new Order(4, "Charger", "3 March"));
        orders.add(new Order(5, "Machine", "4 April"));

        // Find latest order using max() and Comparator
        Order latestOrder = Collections.max(orders, Comparator.comparing(o -> o.date));

        System.out.println("Latest Order:");
        System.out.println(latestOrder);
    }

}
