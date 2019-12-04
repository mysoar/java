package org.javaro.lecture;

import java.util.Scanner;

public class WriteStart {
	Scanner sc = new Scanner(System.in);
	ShowScript showScript = new ShowScript();
	setData setdata = new setData();
	private String explanation;

	public void start() {

		boolean loop = true;
		while (loop) {
			showScript.StartMessage();
			int input_Scanner = sc.nextInt();
			switch (input_Scanner) {
			case 0:

				setdata.Dateset();
				//////////////////////////////
				showScript.Price();
				setdata.setMoney();
				/////////////////////////////
				showScript.BankType();
				setdata.setBankType();
				/////////////////////////////
				showScript.explantion();
				setdata.setExplanation();
				//////////////////////////////
				showScript.BankAccountNumber();
				setdata.setBankAccountNumber();
				////////////////////////////////
				setdata.addItem();
				ShowList();
				break;
			case 1:

				ShowList();
				break;
			case 2:

				ShowList();
				showScript.removeMessage();
				int removePosition = sc.nextInt();
				setdata.removeItem(removePosition);
				break;
			}
			showScript.ContinueMessage();
			int question = sc.nextInt();
			if (question == 1) {
				loop = false;
			}
		}

	}

	public void ShowList() {
		showScript.EndMessage();
		for (int i = 0; i < setdata.arrayList.size(); i++) {
			System.out.println(setdata.arrayList.get(i));
		}
	}

}
