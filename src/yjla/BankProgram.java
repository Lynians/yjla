package yjla;

import java.io.IOException;
import java.util.Scanner;

public class BankProgram {
	private Scanner scan = new Scanner(System.in);
	private int accountmoney = 10000;
	public void insertAccount() {
		String account = null;
		String bankaccount = "123-456789";
		String owner = "ȫ�浿";
		System.out.print("���� �Է� : ");
		account = scan.next();
		if(bankaccount.equals(account)) {
			System.out.println("(������ : " + owner + ")");
		}
		printMenu2();
		
	}
	public void depositMoney() {
		int money;
		System.out.println("�ܾ� : "+ accountmoney);
		System.out.print("�Ա��� �ݾ� : ");
		money = scan.nextInt();
		accountmoney += money;
		System.out.println("�ܾ� : "+ accountmoney);
	}
	public void withdrawMoney() {
		int money;
		System.out.println("�ܾ� : "+ accountmoney);
		System.out.print("����� �ݾ� : ");
		money = scan.nextInt();
		checkMoney(money);
		System.out.println("�ܾ� : "+ accountmoney);
	}
	public void checkMoney(int money) {
		if(accountmoney - money < 0) {
			System.out.println("�ܾ��� �����մϴ�. �ٽ� �Է����ּ���.");
			System.out.print("����� �ݾ� : ");
			money = scan.nextInt();
			checkMoney(money);
		}
		else {
			accountmoney -= money;
		}
	}
	public void printMenu() {
		int selection = 0;
		while(selection != 2) {
			System.out.print("1. ���� �Է�\n2. ����\n�Է� : ");
			selection = scan.nextInt();
			checkSelection(selection);
		}
	}
	public void printMenu2() {
		int selection = 0;
		while(selection != 4) {
			System.out.print("1. �Ա�\n2. ���\n3. �ܾ� ��ȸ\n4. ���ư���\n�Է� : ");
			selection = scan.nextInt();
			checkSelection2(selection);
		}
	}
	public void checkSelection(int selection) {
		if(selection == 1) {
			insertAccount();
		}
		else if(selection == 2) {
			System.out.println("�����մϴ�.");
		}
	}
	public void checkSelection2(int selection) {
		if(selection == 1) {
			depositMoney();
		}
		else if(selection == 2) {
			withdrawMoney();
		}
		else if(selection == 3) {
			System.out.println("�ܾ� : "+ accountmoney);
		}
		else if(selection == 4) {
			System.out.println("�����մϴ�.");
		}
	}
	public static void main(String[] args) {
		BankProgram bank = new BankProgram();
		bank.printMenu();
	}
}
