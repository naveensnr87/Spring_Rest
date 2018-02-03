package com.naveen.order.bo;

import com.naveen.order.bo.exception.BOException;
import com.naveen.order.dto.Order;

public interface OrderBO {
 
	boolean placeOrder(Order order) throws BOException;
	boolean cancelOrder(int id)throws BOException;
	boolean deleteOrder(int id)throws BOException;
//working on orderBO to make chenges
}
