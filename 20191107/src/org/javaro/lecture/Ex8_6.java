package org.javaro.lecture;

public class Ex8_6 {
	public static void main(String[] args) {
		Beverage coke = new Beverage("�ݶ�", 2000, 15);
		coke.printTitle();
		coke.printData();
		// Beverage tea=new Beverage();
		// tea.setProduct("����");tea.setPrice(3000);tea.setQuantity(20);
		Beverage tea = new Beverage("����", 3000, 20);
		tea.printData();
	}
}

class Beverage {
	String product;
	int price;
	int quantity;

	public Beverage(String product, int price, int quantity) {
		this.product = product;
		this.price = price;
		this.quantity = quantity;
	}

	public String getProduct() {
		return this.product;
	}

	public int getPrice() {
		return this.price;
	}

	public int quantity() {
		return this.quantity;
	}

	public int getTotal() {
		return this.price * this.quantity;
	}

	void printTitle() {
		System.out.println("��ǰ��\t�ܰ�\t����\t�ݾ�");
	}

	void printData() {
		System.out.println(this.product + "\t" + this.price + "\t" + this.quantity + "\t" + this.getTotal());
	}

}
