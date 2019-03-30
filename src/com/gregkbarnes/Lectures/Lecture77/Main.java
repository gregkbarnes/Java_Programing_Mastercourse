package com.gregkbarnes.Lectures.Lecture77;

import com.gregkbarnes.Lectures.Lecture77.Burger;

public class Main {
  public static void main(String[] args) {
    Burger myBurger = new Burger();
    NaziVeganPatty nazisBurger = new NaziVeganPatty();
    myBurger.bun.changeBun(2);
    myBurger.addMeat();
    myBurger.addMeat();
    myBurger.addMeat();
    myBurger.addMeat();
    myBurger.addMeat();

    System.out.println(myBurger.getCost());
    nazisBurger.addMeat();
    nazisBurger.printOrder();
    myBurger.printOrder();
  }
}
