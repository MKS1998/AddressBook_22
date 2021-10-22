package com.addressbook;

import java.util.Scanner;

public class AddressBookMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Address Book Problem..");
		NewAddressBooks person = new NewAddressBooks();
		person.addContact();
		System.out.println("Enter Y To Edit The Contact");
		String str = sc.nextLine();
		if (str.equals("y") || str.equals("Y")) {
			person.editContact(); // Calling The Edit Contact Method
			System.out.println("You have Entered following data");
			System.out.println("The Contact Details After Editing : " + person);
		}
	}
}