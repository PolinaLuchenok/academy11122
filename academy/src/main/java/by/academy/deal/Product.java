package by.academy.deal;

import java.util.Objects;

public abstract class Product {
	protected double price;
	protected String name;
	protected int quantity;
	protected int number;
	
	public Product() {
		super();
	}

	public abstract double discount();
	
	public double calcPrice() {
		double productPrice = price * quantity * discount();
		double roundOff = (double) Math.round(productPrice * 100) / 100;
		return roundOff; 
	}

	public abstract Product clone();
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, number, price, quantity);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(name, other.name) && number == other.number
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price) && quantity == other.quantity;
	}

	@Override
	public String toString() {
		return "Продукт наименование " + name + ", цена за единицу " + price + "р.," + "количество " + quantity;
	}
}
