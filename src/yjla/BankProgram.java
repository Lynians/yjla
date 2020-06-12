package yjla;

import java.io.IOException;
import java.util.Scanner;

public class BankProgram {
	private Scanner scan = new Scanner(System.in);
	private int accountmoney = 10000;
	public void insertAccount() {
		String account = null;
		String bankaccount = "123-456789";
		String owner = "홍길동";
		System.out.print("계좌 입력 : ");
		account = scan.next();
		if(bankaccount.equals(account)) {
			System.out.println("(예금주 : " + owner + ")");
		}
		printMenu2();
		
	}
	public void depositMoney() {
		int money;
		System.out.println("잔액 : "+ accountmoney);
		System.out.print("입금할 금액 : ");
		money = scan.nextInt();
		accountmoney += money;
		System.out.println("잔액 : "+ accountmoney);
	}
	public void withdrawMoney() {
		int money;
		System.out.println("잔액 : "+ accountmoney);
		System.out.print("출금할 금액 : ");
		money = scan.nextInt();
		checkMoney(money);
		System.out.println("잔액 : "+ accountmoney);
	}
	public void checkMoney(int money) {
		if(accountmoney - money < 0) {
			System.out.println("잔액이 부족합니다. 다시 입력해주세요.");
			System.out.print("출금할 금액 : ");
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
			System.out.print("1. 계좌 입력\n2. 종료\n입력 : ");
			selection = scan.nextInt();
			checkSelection(selection);
		}
	}
	public void printMenu2() {
		int selection = 0;
		while(selection != 4) {
			System.out.print("1. 입금\n2. 출금\n3. 잔액 조회\n4. 돌아가기\n입력 : ");
			selection = scan.nextInt();
			checkSelection2(selection);
		}
	}
	public void checkSelection(int selection) {
		if(selection == 1) {
			insertAccount();
		}
		else if(selection == 2) {
			System.out.println("종료합니다.");
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
			System.out.println("잔액 : "+ accountmoney);
		}
		else if(selection == 4) {
			System.out.println("종료합니다.");
		}
	}
	public static void main(String[] args) {
		BankProgram bank = new BankProgram();
		bank.printMenu();
	}
}
