package by.academy.deal;

import java.util.Objects;

public class Juice extends Product{
	private String taste; //вкус 
	private int volume; //объем упаковки
	
	public Juice () {
		super();
	}
	
	public Juice(String name, double price, int number, String taste, int volume) {
		super();
		this.name = name;
		this.price = price;
		this.number = number;
		this.taste = taste;
		this.volume = volume;
	}
	
	@Override
	public double discount() {
		if (volume == 5) { 
			return 0.8;
		} else {
			return 1;
		}
	}
	
	@Override
	public Juice clone() {
		return new Juice(name, price, number, taste, volume);
	}

	public String getTaste() {
		return taste;
	}

	public void setTaste(String taste) {
		this.taste = taste;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(taste, volume);
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
		Juice other = (Juice) obj;
		return Objects.equals(taste, other.taste)
				&& Double.doubleToLongBits(volume) == Double.doubleToLongBits(other.volume);
	}

	@Override
	public String toString() {
		return name + ", цена за единицу " + price + "р., вкус " + taste + ", объем упаковки в литрах - " + volume;
	}	
}
