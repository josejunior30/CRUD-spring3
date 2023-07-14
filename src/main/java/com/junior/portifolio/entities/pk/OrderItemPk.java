package com.junior.portifolio.entities.pk;

import java.io.Serializable;
import java.util.Objects;

import com.junior.portifolio.entities.Order;
import com.junior.portifolio.entities.Product;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class OrderItemPk implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn(name="id_product")
	private Product product;
	
	@ManyToOne
	@JoinColumn(name="id_Order")
	private Order Order;

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Order getOrder() {
		return Order;
	}

	public void setOrder(Order order) {
		Order = order;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Order, product);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderItemPk other = (OrderItemPk) obj;
		return Objects.equals(Order, other.Order) && Objects.equals(product, other.product);
	}
	
	
	}
	
	

