package com.addressbook;

import java.util.Scanner;

public class NewAddressBooks {
    Scanner sc = new Scanner(System.in);

    public void addContact() {
        ContactDetails person = new ContactDetails();
        System.out.println("Enter First Name: ");
        String firstName = sc.nextLine();
        System.out.println("Enter Last Name: ");
        String lastName = sc.nextLine();
        System.out.println("Enter Your AddressCity: ");
        String addressCity = sc.nextLine();
        System.out.println("Enter Your State: ");
        String state = sc.nextLine();
        System.out.println("Enter Zip Code : ");
        Long zip = sc.nextLong();
        sc.nextLine();
        System.out.println("Enter Phone Number: ");
        Long phoneNumber = sc.nextLong();
        sc.nextLine();
        System.out.println("Enter your Email ID: ");
        String email = sc.nextLine();
        person.setFirstName(firstName);
        person.setLastName(lastName);
        person.setAddressCity(addressCity);
        person.setState(state);
        person.setZip(zip.intValue());
        person.setPhoneNumber(phoneNumber.intValue());
        person.setEmail(email);
        System.out.println("The Contact Details of " + firstName + " "+lastName +"\n" + person);
    }
}