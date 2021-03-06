package com.cswm.assignment.model.dto.ouputDto;

import com.cswm.assignment.applicationutils.OrderStatus;
import com.cswm.assignment.applicationutils.OrderType;

public class OrderDetailsOutputDto {

	private Long orderDetailsId;

	private OrderStatus orderStatus;

	private OrderType orderType;

	private Long executionQuantity;

	public OrderStatus getOrderStatus() {
		return orderStatus;
	}

	public Long getOrderDetailsId() {
		return orderDetailsId;
	}

	public void setOrderDetailsId(Long orderDetailsId) {
		this.orderDetailsId = orderDetailsId;
	}

	public OrderType getOrderType() {
		return orderType;
	}

	public void setOrderType(OrderType orderType) {
		this.orderType = orderType;
	}

	public Long getExecutionQuantity() {
		return executionQuantity;
	}

	public void setExecutionQuantity(Long executionQuantity) {
		this.executionQuantity = executionQuantity;
	}

	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}

	@Override
	public String toString() {
		return "OrderDetails [orderDetailsId=" + orderDetailsId + ", orderStatus=" + orderStatus + ", orderType="
				+ orderType + ", executionQuantity=" + executionQuantity + "]";
	}

}
