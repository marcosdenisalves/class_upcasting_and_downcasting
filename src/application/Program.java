package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Account> account = new ArrayList<>();
		account.add(new SavingsAccount(1001, "Alex", 500.0, 0.01));
		account.add(new BusinessAccount(1002, "Maria", 1000.0, 400.0));
		account.add(new SavingsAccount(1004, "Bob", 300.0, 0.01));
		account.add(new BusinessAccount(1005, "Ana", 500.0, 500.0));

		double sum = 0.0;

		for (Account acc : account) {
			sum += acc.getBalance();
		}

		System.out.printf("Total balance: %.2f%n", sum);

		for (Account acc : account) {
			acc.deposit(10.0);
		}
		for (Account acc : account) {
			System.out.printf("Update balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
		}

	}

}
