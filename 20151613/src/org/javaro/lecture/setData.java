package org.javaro.lecture;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class setData {
	Scanner sc = new Scanner(System.in);
	ArrayList<BookItem> arrayList = new ArrayList<>();
	String date;
	String BankType;
	String explanation;
	int money;
	String BankAccountNumber;
	Date nowDate = new Date(); // 현재시간

	public void Dateset() {
		date = nowDate.toString();
	}

	public void setMoney() {
		while (true) {
			try {
				money = sc.nextInt();
				break;
			} catch (InputMismatchException e) {

				System.out.print("잘못 입력하셨습니다. 숫자만 입력해주세요. : ");
				sc = new Scanner(System.in);

			}
		}
	}

	public void removeItem(int removePosition) {
		arrayList.remove(removePosition);

	}

	public void setBankType() {
		BankType = sc.next();

	}

	public void setExplanation() {
		explanation = sc.next();

	}

	public void setBankAccountNumber() {
		BankAccountNumber = sc.next();
	}

	public void addItem() {
		BookItem bookItem = new BookItem();
		bookItem.setDate(date);
		bookItem.setMoney(money);
		bookItem.setBankType(BankType);
		bookItem.setExplanation(explanation);
		bookItem.setBankAccountNumber(BankAccountNumber);
		arrayList.add(bookItem);
	}

	public void showHouseKeepingBook(int positon) {
		arrayList.get(positon);
	}

}
