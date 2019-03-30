package com.gregkbarnes.Lectures.Lecture77;

public class Meat {
  protected double cost;
  protected String name;

  public Meat() {
    setCost(2.00);
    setName("Beef patty");
  }

  public void changeMeat(int MeatSelection) {
    switch (MeatSelection) {
      case 1: {
        setCost(2.00);
        setName("Beef patty");
      }
      case 2: {
        setCost(2.5);
        setName("Chicken Breast");
      }
      case 3: {
        setCost(3.0);
        setName("Fish filet");
      }
      case 4: {
        setCost(2.25);
        setName("Veggie patty");
      }
      default: {
        if (MeatSelection >= 1 && MeatSelection <= 4) {
          break;
        } else System.out.println("Invalid Meat selected.");
        break;
      }
    }
  }

  public double getCost() {
    return cost;
  }

  protected String getName() {
    return name;
  }

  protected void setCost(double cost) {
    this.cost = cost;
  }

  protected void setName(String name) {
    this.name = name;
  }
}
