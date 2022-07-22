package by.academy.deal;

import java.util.Objects;

public class Apples extends Product{
	private String sort;
	private String country;
	
	public Apples() {
		super();
	}
	
	public Apples(String name, double price, int number, String sort, String country) {
		super();
		this.name = name;
		this.price = price;
		this.number = number;
		this.sort = sort;
		this.country = country;
	}
	
	@Override
	public double discount() {
		switch (country) {
		case "Польша":
			return 0.9;
		case "Беларусь":
			return 0.8;
		default:
			return 1;
		}
	}

	@Override
	public Apples clone() {
		return new Apples(name, price, number, sort, country);
	}
	
	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(country, sort);
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
		Apples other = (Apples) obj;
		return Objects.equals(country, other.country) && Objects.equals(sort, other.sort);
	}

	@Override
	public String toString() {
		return name + ", цена за упаковку(1 кг) " + price + "р., сорт " + sort + ", страна " + country;
	}
	
	
}
