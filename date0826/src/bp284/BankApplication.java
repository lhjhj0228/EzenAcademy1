package bp284;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	private static int index = -1;

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("------------------------------------------");
			System.out.print("선택> ");

			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

	private static void createAccount() {
		System.out.println("--- method : createAccount() -----------");
		accountArray[++index] = new Account("111-111", "홍길동", 10000);
	}

	private static void accountList() {
		System.out.println("--- method : accountList() -----------");

		for (int i = 0; i <= index; i++) {
			System.out.println(accountArray[i].getAno() + " / " + accountArray[i].getOwner() + " / "
					+ accountArray[i].getBalance());
		}
	}

	private static void deposit() {
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		System.out.print("예금액: ");
		int balance = scanner.nextInt();

		for (int i = 0; i <= index; i++) {
			if (accountArray[i].getAno().equals(ano)) {
				int curBalance = accountArray[i].getBalance();
				accountArray[i].setBalance(curBalance + balance);
				System.out.println("결과: 예금이 성공되었습니다.");
			}
		}
	}

	private static void withdraw() {
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		System.out.print("출금액: ");
		int balance = scanner.nextInt();

		for (int i = 0; i <= index; i++) {
			if (accountArray[i].getAno().equals(ano)) {
				int curBalance = accountArray[i].getBalance();
				if (curBalance - balance < 0) {
					System.out.println("결과: 출금이 실패되었습니다.");
				} else {
					accountArray[i].setBalance(curBalance - balance);
					System.out.println("결과: 출금이 성공되었습니다.");
				}
			}
		}
	}
}