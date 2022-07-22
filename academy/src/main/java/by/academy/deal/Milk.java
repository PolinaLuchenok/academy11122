package by.academy.deal;

import java.util.Objects;

public class Milk extends Product {
	private int expirationDate; //срок годности в днях
	private double fatContent; //жирность в %
	
	public Milk() {
		super();
	}

	public Milk(String name, double price, int number, int expirationDate, double fatContent) {
		super();
		this.name = name;
		this.price = price;
		this.number = number;
		this.expirationDate = expirationDate;
		this.fatContent = fatContent;
	}
	
	@Override
	public double discount() {
		if (expirationDate == 2) {
			return 0.8;
		} else if (expirationDate <= 5) {
			return 0.5;
		} else {
			return 1;
		}
	}
	
	@Override
	public Milk clone() {
		return new Milk(name, price, number, expirationDate, fatContent);
	}

	public int getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(int expirationDate) {
		this.expirationDate = expirationDate;
	}

	public double getFatContent() {
		return fatContent;
	}

	public void setFatContent(double fatContent) {
		this.fatContent = fatContent;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(expirationDate, fatContent);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Milk other = (Milk) obj;
		return expirationDate == other.expirationDate
				&& Double.doubleToLongBits(fatContent) == Double.doubleToLongBits(other.fatContent);
	}

	@Override
	public String toString() {
		return  name + ", цена за единицу " + price + "р., срок годности в днях - " + expirationDate + ", жирность в % - " + fatContent;
	}
}
