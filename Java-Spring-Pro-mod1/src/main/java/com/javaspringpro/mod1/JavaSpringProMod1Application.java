package com.javaspringpro.mod1;

import com.javaspringpro.mod1.entities.Order;
import com.javaspringpro.mod1.services.OrderService;
import com.javaspringpro.mod1.services.ShippingService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaSpringProMod1Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(JavaSpringProMod1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		ShippingService shippingService = new ShippingService();
		OrderService orderService = new OrderService(shippingService);

		Order order1 = new Order(1,150.00,20.0);
		Order order2 = new Order(2,201.00,10.0);
		Order order3 = new Order(3,800.50,0.0);

		printOrderResult(order1,orderService);
		printOrderResult(order2,orderService);
		printOrderResult(order3,orderService);
	}

	private void printOrderResult(Order order1, OrderService orderService) {
		double totalValue = orderService.calculteTotal(order1);
		System.out.println("Pedido código: " + order1.getCod());
		System.out.println("Valor total: R$ " + String.format("%.2f",totalValue));
	}
}
