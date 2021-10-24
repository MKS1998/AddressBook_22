package com.addressbook;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome into the Program of AddressBook...");
        NewAddressBooks book = new NewAddressBooks();
        book.getMenu();
        book.showContact();
    }
}