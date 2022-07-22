package by.academy.deal;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Application {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Здравствуйте! Приветствуем Вас на нашей онлайн-платформе! Введите, пожалуйста, наименование интересующей Вас компании)");
		String sellerName = scan.nextLine();
		
		User seller = new User(sellerName, 100);
		
		System.out.println("Наша компания " + sellerName + " рада, что Вы выбрали нас для заключения сделки! Введите, пожалуйста, Ваше имя)");
		String buyerName = scan.nextLine();
		
		System.out.println(buyerName + ", введите, пожалуйста, дату Вашего Дня рождения в формате dd/MM/yyyy или dd-MM-yyyy!");
		String buyerDate = scan.nextLine();
		RegEx date = new RegEx(buyerDate);
		date.checkDate();
		if(date.checkDate() == false) {
			System.out.println("Вы неверно ввели дату!");
			return;
		}
		
		String regex;
		if(date.checkDate1() == true) {
			regex = "dd/MM/yyyy";
		} else {
			regex = "dd-MM-yyyy";
		}
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(regex);
		LocalDate localDate = LocalDate.parse(buyerDate, formatter);
		int year = localDate.getYear();
        int month = localDate.getMonthValue();
        int dayOfMonth = localDate.getDayOfMonth();
        System.out.println("День: " + dayOfMonth);
        System.out.println("Месяц: " + month);
        System.out.println("Year: " + year);
        
        final class EmailValidator implements Validator {
        	private Pattern patternEmail = Pattern.compile("\\w+@[a-zA-Z_]+?\\.[a-zA-Z]{2,6}");

        	public EmailValidator() {
        		super();
        	}
        	@Override
        	public Pattern getPattern() {
        		return patternEmail;
        	}
        }
        
        System.out.println(buyerName + ", введите, пожалуйста, Ваш номер телефона в формате +375ХХХХХХХХХ!");
		String buyerPhone = scan.nextLine();
		BelarusPhoneValidator phone = new BelarusPhoneValidator();
		phone.validate(buyerPhone);
		if(phone.validate(buyerPhone) == false) {
			System.out.println("Вы неверно ввели номер телефона!");
			return;
		}
        
		System.out.println(buyerName + ", введите, пожалуйста, Ваш адрес электронной почты!");
		String buyerEmail = scan.nextLine();
		EmailValidator email = new EmailValidator();
		email.validate(buyerEmail);
		if(email.validate(buyerEmail) == false) {
			System.out.println("Вы неверно ввели адрес электронной почты!");
			return;
		}
		
		
		System.out.println(buyerName + ", введите, пожалуйста, количество денежных средств у Вас в рублях!");
		double buyerMoney = scan.nextDouble();
		
		User buyer = new User(buyerName, buyerMoney);
		//buyer.setDateOfBirth(buyerDate);//???
		
		Product milk = new Milk("Молоко", 1.5, 1, 4, 2.5);
		Product juice = new Juice("Сок", 5.0, 2, "апельсиновый", 5);
		Product apples = new Apples("Яблоки", 3.1, 3, "Ред Принц", "Польша");
		
		LocalDate dateNow = LocalDate.now();
		LocalDate deadline = dateNow.plusDays(10);
		
		Deal deal = new Deal(seller, buyer, deadline, dateNow);
		
		Product[] assortment = new Product[] {milk, juice, apples};
		
		int solution;
		do {
			deal.showMenu();
			solution = scan.nextInt();
			if(solution == 1) {
				printChoiceProduct(assortment);
				int productNumber = scan.nextInt();
				Product product = findProductFromAssortment(assortment, productNumber);
				if(product == null) {
					System.out.println("Вы неверно указали номер товара!");
				} else {
					System.out.println("Укажите, пожалуйста, количество выбранного Вами товара!");
					int quantityNext = scan.nextInt();
					product.setQuantity(quantityNext);
					deal.addProduct(product);
				}
			} else if(solution == 2) {
				if(deal.isEmptyCard()) {
					System.out.println("Ваша корзина пустая!");
				} else {
					deal.printProductsForRemoving();
					int indexPr = scan.nextInt();
					deal.removeProduct(indexPr);
				}
			} else if(solution == 3){
				System.out.println(deal.toString());
				deal.showCart();
				deal.checkMoney();
			} else {
				System.out.println("Вы указали неверный номер!");
			}
		} while (solution != 3);
			
		scan.close();
	}
	
	public static void printChoiceProduct(Product[] productList) {
		System.out.println("Выберите, пожалуйста, один товар из списка и укажите его номер!");
		for(Product product: productList) {
			System.out.println("Номер " + product.number + " - " + product.toString());
		}
	}
	
	public static void printProductsForRemoving(Product[] productList) {
		System.out.println("Выберите, пожалуйста, товар, который хотите удалить из корзины, и укажите соответствующую цифру!");
		for (int k=0; k<productList.length; k++) {
			if (productList[k] != null) {
				System.out.println("Номер " + (k+1) + " - " + productList[k] + ", количество - " + productList[k].quantity);
			}
		}
	}
	
	public static Product findProductFromAssortment(Product[] assortment, int productNumber) {
		for(Product product: assortment) {
			if (productNumber == product.number) {
				return product.clone();
			} 
		}
		return null;
	}
}
