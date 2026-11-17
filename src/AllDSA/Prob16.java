package AllDSA;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

//We have a List of orders having historical data of Orders. 
//Write a method to get the latest status for all orders from this List.

class Order {

	private String id;
	private LocalDate date;
	private String status;

	public Order(String id, LocalDate date, String status) {
		this.id = id;
		this.date = date;
		this.status = status;
	}

	public String getId() {
		return id;
	}

	public LocalDate getDate() {
		return date;
	}

	public String getStatus() {
		return status;
	}
}

public class Prob16 {

	public static void main(String[] args) {
		List<Order> list = Arrays.asList(
				new Order("A101", LocalDate.of(2024, 1, 11), "O"),
				new Order("A102", LocalDate.of(2024, 3, 3), "I"), 
				new Order("A101", LocalDate.of(2024, 8, 5), "P"),
				new Order("A102", LocalDate.of(2024, 9, 4), "O"), 
				new Order("A101", LocalDate.of(2024, 6, 14), "C"),
				new Order("A103", LocalDate.of(2024, 4, 5), "X"));
		//We have a List of orders having historical data of Orders. 
		//Write a method to get the latest status for all orders from this List.

		
	   Map<String, Optional<Order>> map = list.stream()
			    .collect(Collectors.groupingBy(Order::getId,
			    Collectors.maxBy(Comparator.comparing(Order::getDate))));
	   
	   
	   map.forEach((id, orderOpt)->{
		   orderOpt.ifPresent(order->
		   System.out.println(id + " -> " + order.getStatus()));
	   });
		

		
//		 // Step 1: Group by id and get max date order
//		        Map<String, Optional<Order>> map =
//		                list.stream()
//		                    .collect(Collectors.groupingBy(
//		                        Order::getId,
//		                        Collectors.maxBy(Comparator.comparing(Order::getDate))
//		                    ));
//
////		        // Step 2: Print result
//		        map.forEach((id, orderOpt) -> {
//		            orderOpt.ifPresent(order ->
//		                System.out.println(id + " -> " + order.getStatus())
//		            );
//		        });

	}

}
