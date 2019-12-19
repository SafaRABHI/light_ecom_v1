package Ecommerce.web;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

import Ecommerce.entities.Client;
@Data
public class OrderForm {
    public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public List<OrderProduct> getProducts() {
		return products;
	}
	public void setProducts(List<OrderProduct> products) {
		this.products = products;
	}
	private Client client=new Client();
    private List<OrderProduct> products=new ArrayList<>();
}
@Data
class OrderProduct{
    private Long id;
    private int quantity;
	public Long getId() {
		// TODO Auto-generated method stub
		return id;
	}
	public int getQuantity() {
		// TODO Auto-generated method stub
		return quantity;
	}

}