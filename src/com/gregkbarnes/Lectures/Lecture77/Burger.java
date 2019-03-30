package com.gregkbarnes.Lectures.Lecture77;

public class Burger {
  protected double cost;
  public Bun bun;
  protected Meat[] meats = new Meat[3];
  protected int numMeats = 1;
  protected static int numBurgers = 0;
  protected int burgerNumber;
//  protected String cheese;
//  protected String[] toppings;

  public Burger() {
    numBurgers += 1;
    burgerNumber = numBurgers;
    this.bun = new Bun();
    this.meats[0] = new Meat();
    printOrder();
  }

  public void calculateCost() {
    this.cost = 0;
    this.cost += this.bun.getCost();
    for (Meat meat :
            meats) {
      if (meat != null) {
        this.cost += meat.getCost();
      }
    }
  }

  public double getCost() {
    calculateCost();
    return this.cost;
  }

  public void addMeat() {
    for (int i=0;i < meats.length; i++) {
      if (meats[i] == null) {
        numMeats++;
        meats[i] = new Meat();
        printOrder();
        break;
      }
    }
  }

  public void printOrder() {
    System.out.println("---------------------------");
    System.out.println("Burger #" + burgerNumber);
    System.out.println("Bun: " + this.bun.getName());
    for (Meat meat : meats) {
      if (meat != null) {
        System.out.println("Meat: " + meat.getName());
      }
    }
    System.out.println("Cost: $" + this.getCost());
    System.out.println("---------------------------");
  }
}
