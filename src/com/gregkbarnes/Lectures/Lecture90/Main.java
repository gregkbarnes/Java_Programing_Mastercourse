package com.gregkbarnes.Lectures.Lecture90;

import com.gregkbarnes.Lectures.Lecture90.MobilePhone;

import java.util.Scanner;

public class Main {

  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
      // Create a program that implements a simple mobile phone with the following capabilities.
      // Able to store, modify, remove and query contact names.
      // You will want to create a separate class for Contact (name and phone number).
      // Create a master class (MobilePhone) that holds the ArrayList of Contact
      // The MobilePhone class has the functionality listed above.
      // Add a menu of options that are available.
      // Options:  Quit, print list of contacts, add new contact, update existing contact, remove contact
      // and search/find contact.5
      // When adding or updating be sure to check if the contact already exists (use name)
      // Be sure not to expose the inner workings of the Arraylist to MobilePhone
      // e.g. no ints, no .get(i) etc
      // MobilePhone should do everything with Contact objects only.

    boolean done = false;
    int choice;

    MobilePhone myPhone = new MobilePhone();
    myPhone.storeContact("Greg Barnes", "2406752858");
    myPhone.storeContact("Nazi Paikidze", "4439003213");
    myPhone.storeContact("Eric Barnes", "4436055924");

    while (!done) {
//      myPhone.printContacts();
      printMenu();
      choice = scanner.nextInt();
      scanner.nextLine();

      switch (choice) {
        case 1:
          myPhone.printContacts();
          break;
        case 2:
          myPhone.storeContact();
          break;
        case 3:
          myPhone.modifyContact();
          break;
        case 4:
          myPhone.removeContact();
          break;
        default:
          done = true;
          break;
      }
    }
  }

  private static void printMenu() {
    System.out.println("1 - Show Contacts");
    System.out.println("2 - Store");
    System.out.println("3 - Modify");
    System.out.println("4 - Remove");
    System.out.print("Enter your choice: ");
  }
}
