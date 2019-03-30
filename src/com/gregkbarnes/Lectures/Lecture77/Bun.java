package com.gregkbarnes.Lectures.Lecture77;

public class Bun {
  private double cost;
  private String name;

  public Bun() {
    setCost(1.00);
    setName("White roll");
  }

  public void changeBun(int bunSelection) {
    switch (bunSelection) {
      case 1: {
        setCost(1.00);
        setName("White roll");
      }
      case 2: {
        setCost(1.25);
        setName("Wheat roll");
      }
      case 3: {
        setCost(1.50);
        setName("Pretzel roll");
      }
      case 4: {
        setCost(1.50);
        setName("Brown rye roll");
      }
      default: {
        if (bunSelection >= 1 && bunSelection <= 4) {
          break;
        } else System.out.println("Invalid bun selected.");
        break;

      }
    }
  }

  public double getCost() {
    return cost;
  }

  public String getName() {
    return name;
  }

  private void setCost(double cost) {
    this.cost = cost;
//    System.out.println("Bun: this.cost = " + this.cost);
  }

  private void setName(String name) {
    this.name = name;
  }
}
