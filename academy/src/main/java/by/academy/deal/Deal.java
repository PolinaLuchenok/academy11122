package by.academy.deal;

import java.util.Arrays;
import java.util.Objects;
import java.time.*;

public class Deal {
	private User seller;
	private User buyer;
	
	private Product[] products;
	private int index = 0;
	
	private LocalDate deadlineDate;
	private LocalDate dealDate;
	
	public Deal() {
		super();
	}

	public Deal(User seller, User buyer, LocalDate deadlineDate, LocalDate dealDate) {
		super();
		this.seller = seller;
		this.buyer = buyer;
		this.products = new Product[5];
		this.deadlineDate = deadlineDate;
		this.dealDate = dealDate;
	}

	public void showMenu() {
		System.out.println("Выберите нужное Вам действие и введите соответствующий номер:");
		System.out.println("Добавить товар в корзину - 1");
		System.out.println("Удалить товар из корзины - 2");
		System.out.println("Завершить сделку - 3");
	}
	
	public double fullPrice() {
		double sum = 0;
		for (int i = 0; i < products.length; i++) {
			if (products[i] != null) {
				sum = sum + products[i].calcPrice();
			}
		}
		double roundSum = (double) Math.round(sum * 100) / 100;
		return roundSum;
	}
	
	
	public void deal() {
		double buyerMoney = buyer.getMoney() - fullPrice();
		buyer.setMoney(buyerMoney);
		
		double sellerMoney = seller.getMoney() + fullPrice();
		seller.setMoney(sellerMoney);
		
		System.out.println("Остаток денежных средств у покупателя " + buyer.getMoney() + "р.");
	}
	
	private void grow() {
		int newLength = (int) (products.length == 0 ? 1 : products.length * 1.5);
		Product[] newProducts = new Product[newLength];
		System.arraycopy(products, 0, newProducts, 0, products.length);
		products = newProducts;
	}
	
	public void addProduct(Product product) {
		if(index == products.length) {
			grow();
		}
		products[index++] = product;
	}

	public void removeProduct(int productNumber) {
		if(productNumber < 0 | productNumber > index) {
			System.out.println("Неверно введен номер товара");
		} else {
			for (int i = productNumber; i < index; i++) {
				products[i-1] = products[i];
			   }
			products[index-1] = null;
		}
	}

	public boolean isEmptyCard() {
		return index == 0;
	}
	
	public void printProductsForRemoving() {
		System.out.println("Выберите, пожалуйста, товар, который хотите удалить из корзины, и укажите соответствующую цифру!");
		for (int k=0; k<products.length; k++) {
			if (products[k] != null) {
				System.out.println("Номер " + (k+1) + " - " + products[k] + ", количество - " + products[k].quantity);
			}
		}
	}
	
	public void printBill() {
		System.out.println();
		System.out.println("ЧЕК");
		System.out.println("Дата совершения сделки: " + dealDate);
		System.out.println("Продавец " + seller.getName());
		System.out.println("Покупатель " + buyer.getName());
		System.out.println("ТОВАРЫ:");
		for (int i = 0; i < products.length; i++) {
			if (products[i] != null) {
				System.out.println((i+1) + ") " + products[i].name + ": " + products[i].price + " x "+ products[i].quantity + " x " + (100 - products[i].discount()*100) + "% = " + products[i].calcPrice() + "р.");
			}
		}
		System.out.println("Итоговая сумма: " + fullPrice() + "р.");
	}

	public void showCart() {
		for (int i = 0; i < products.length; i++) {
			if (products[i] != null) {
				System.out.println(products[i].toString() + ", количество - " + products[i].quantity + ", скидка " + (100 - products[i].discount()*100) + "%, итого " + products[i].calcPrice() + "р.");
			}
		}
		System.out.println("Итоговая сумма: " + fullPrice() + "р.");
	}
	
	public void checkMoney() {
		if (buyer.getMoney() < fullPrice()) {
			System.out.println("У Вас недостаточно средств!");
		} else {
			deal();
			printBill();
		}
	}
	
	
	public User getSeller() {
		return seller;
	}

	public void setSeller(User seller) {
		this.seller = seller;
	}

	public User getBuyer() {
		return buyer;
	}

	public void setBuyer(User buyer) {
		this.buyer = buyer;
	}

	public Product[] getProducts() {
		return products;
	}

	public void setProducts(Product[] products) {
		this.products = products;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public LocalDate getDeadlineDate() {
		return deadlineDate;
	}

	public void setDeadlineDate(LocalDate deadlineDate) {
		this.deadlineDate = deadlineDate;
	}

	public LocalDate getDealDate() {
		return dealDate;
	}

	public void setDealDate(LocalDate dealDate) {
		this.dealDate = dealDate;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(products);
		result = prime * result + Objects.hash(buyer, deadlineDate, dealDate, index, seller);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Deal other = (Deal) obj;
		return Objects.equals(buyer, other.buyer) && Objects.equals(deadlineDate, other.deadlineDate)
				&& Objects.equals(dealDate, other.dealDate) && index == other.index
				&& Arrays.equals(products, other.products) && Objects.equals(seller, other.seller);
	}

	@Override
	public String toString() { 
		return "Информация о сделке: продавец " + seller.getName() + ", покупатель " + buyer.getName() + ", крайний срок сделки " + deadlineDate;	
	}
}
