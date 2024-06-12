package com.example.service;

import com.example.entity.OrderDetail;
import com.example.repository.OrderDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderDetailService {

    @Autowired
    private OrderDetailRepository orderDetailRepository;

    public List<OrderDetail> getOrderDetailsByOrder(Integer orderId) {
        return orderDetailRepository.findByOrderId(orderId);
    }

	public void saveOrderDetail(OrderDetail orderDetail) {
		orderDetailRepository.save(orderDetail);
	}
	
	public void deleteOrderDetail(OrderDetail orderDetail) {
		orderDetailRepository.delete(orderDetail);
	}
	
	public void deleteOrderDetailByOrder(Integer orderId) {
		List<OrderDetail> orderDetails = orderDetailRepository.findByOrderId(orderId);
		orderDetails.forEach(orderDetail -> orderDetailRepository.delete(orderDetail));
	}
	 
	public void updateOrderDetail(OrderDetail orderDetail) {
		orderDetailRepository.save(orderDetail);
	}
}
