package com.addressbook;

public class AddressBookMain {
	public static void main(String[] args) {
		System.out.println("Welcome to the Address Book Problem..");
		ContactDetails newContact = new ContactDetails();

		newContact.setFirstName("Mohin\n");
		newContact.setLastName("Sayyad\n");
		newContact.setAddressCity("Pune\n");
		newContact.setState("Maharashtra\n");
		newContact.setEmail("mahi98@gmail.com\n");
		newContact.setZip(431519);
		newContact.setPhoneNumber(749844688);
		System.out.println("That Contact Is :\n" + newContact);

	}
}
