package levelMedium;

import java.util.Date;

import entities.order;
import entitis.enums.OrderStatus;

public class enuM {

	public static void main(String[]ags) {
		
		order ped = new order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
		
		System.out.print(ped);
	}
}
