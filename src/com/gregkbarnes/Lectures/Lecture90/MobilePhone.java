package com.gregkbarnes.Lectures.Lecture90;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// Able to store, modify, remove and query contact names.
public class MobilePhone {

  private static Scanner scanner = new Scanner(System.in);
  private ArrayList<Contact> contacts;

  MobilePhone() {
    this.contacts = new ArrayList<Contact>();
  }

  public MobilePhone(ArrayList<Contact> contacts) {
    this.contacts = contacts;
  }

  public void storeContact() {
    String name;
    String phoneNumber;

    System.out.print("Enter Name: ");
    name = scanner.nextLine();
    System.out.print("Enter Number: ");
    phoneNumber = scanner.nextLine();

    Contact contact = new Contact(name, phoneNumber);
    this.contacts.add(contact);

    System.out.println("Contact added.");
  }

  public void storeContact(String name, String phoneNumber) {
    Contact contact = new Contact(name, phoneNumber);
    this.contacts.add(contact);
  }

  public void modifyContact() {
    System.out.println("Enter the contact you wish to modify: ");
    String choice = scanner.nextLine();
    int choiceIndex = findName(choice);

    if (choiceIndex >= 0) {
      String name;
      String phoneNumber;

      System.out.print("Enter Name: ");
      name = scanner.nextLine();
      System.out.print("Enter Number: ");
      phoneNumber = scanner.nextLine();

      this.contacts.get(choiceIndex).setName(name);
      this.contacts.get(choiceIndex).setPhoneNumber(phoneNumber);

      System.out.println("Contact updated.");
    }
  }

  public void removeContact() {
    System.out.println("Enter the contact you wish to remove: ");
    String choice = scanner.nextLine();
    int choiceIndex = findName(choice);

    if (choiceIndex >= 0) {
      this.contacts.remove(choiceIndex);
      System.out.println("Contact removed.");
    }
  }

  public void printContacts() {
    for (int i = 0; i < contacts.size(); i++) {
      System.out.println(contacts.get(i).getName());
    }
  }

  private int findName(String name) {
    for (int i = 0; i < this.contacts.size(); i++) {
      if (name.equals(this.contacts.get(i).getName())) {
        return i;
      }
    }
    System.out.println("Contact not found");
    return -1;
  }
}
