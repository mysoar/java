package org.javaro.lecture;

public class BookItem {
	String date;
	int money;
	String BankType;
	String explanation;
	String BankAccountNumner;

	public String getDate() {
		return this.date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getMoney() {
		return this.money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getBankType() {
		return this.BankType;
	}

	public void setBankType(String BankType) {
		this.BankType = BankType;
	}

	public String getExplanation() {
		return this.explanation;
	}

	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}

	public void setBankAccountNumber(String bankAccountNumber) {
		this.BankAccountNumner = bankAccountNumber;
	}

	public String getBankAccountNumber() {
		return this.BankAccountNumner;
	}

	@Override
	public String toString() {
		return " 시간='" + getDate() + "'" + ", 금액='" + getMoney() + "'원" + ", 은행종류='" + getBankType() + "'은행	"
				+ ", 계좌번호='" + getBankAccountNumber() + "'" + ", 사용목적='" + getExplanation() + "'";
	}

}
