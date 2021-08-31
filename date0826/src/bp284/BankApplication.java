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
			System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
			System.out.println("------------------------------------------");
			System.out.print("����> ");

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
		System.out.println("���α׷� ����");
	}

	private static void createAccount() {
		System.out.println("--- method : createAccount() -----------");
		accountArray[++index] = new Account("111-111", "ȫ�浿", 10000);
	}

	private static void accountList() {
		System.out.println("--- method : accountList() -----------");

		for (int i = 0; i <= index; i++) {
			System.out.println(accountArray[i].getAno() + " / " + accountArray[i].getOwner() + " / "
					+ accountArray[i].getBalance());
		}
	}

	private static void deposit() {
		System.out.print("���¹�ȣ: ");
		String ano = scanner.next();
		System.out.print("���ݾ�: ");
		int balance = scanner.nextInt();

		for (int i = 0; i <= index; i++) {
			if (accountArray[i].getAno().equals(ano)) {
				int curBalance = accountArray[i].getBalance();
				accountArray[i].setBalance(curBalance + balance);
				System.out.println("���: ������ �����Ǿ����ϴ�.");
			}
		}
	}

	private static void withdraw() {
		System.out.print("���¹�ȣ: ");
		String ano = scanner.next();
		System.out.print("��ݾ�: ");
		int balance = scanner.nextInt();

		for (int i = 0; i <= index; i++) {
			if (accountArray[i].getAno().equals(ano)) {
				int curBalance = accountArray[i].getBalance();
				if (curBalance - balance < 0) {
					System.out.println("���: ����� ���еǾ����ϴ�.");
				} else {
					accountArray[i].setBalance(curBalance - balance);
					System.out.println("���: ����� �����Ǿ����ϴ�.");
				}
			}
		}
	}
}