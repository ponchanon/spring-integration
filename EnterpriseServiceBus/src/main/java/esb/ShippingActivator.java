package esb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

public class ShippingActivator {
	@Autowired
	RestTemplate restTemplate;

	public void ship(Order order) {
		ShippingRouter router = new ShippingRouter();
		String path = router.route(order);

		switch (path){
			case "normalshippingchannel":
				System.out.println("shipping: "+ order.toString());
				restTemplate.postForLocation("http://localhost:8082/orders", order);
				break;
			case "nextdayshippingchannel":
				System.out.println("next day shipping: "+ order.toString());
				restTemplate.postForLocation("http://localhost:8083/orders", order);
				break;
			case "internationalshippingchannel":
				System.out.println("international shipping: "+ order.toString());
				restTemplate.postForLocation("http://localhost:8084/orders", order);
				break;

		}
	}
}
