package com.gregkbarnes.Lectures.Lecture77;

import com.gregkbarnes.Lectures.Lecture77.Meats.VeggiePatty;

public class NaziVeganPatty extends Burger{
  public NaziVeganPatty() {
    this.bun.changeBun(4);
    this.meats[0].setName("Veggie Patty");
  }

  @Override
  public void calculateCost() {
    this.cost = 0;
  }

  @Override
  public void addMeat() {
    for (int i=0;i < meats.length; i++) {
      if (meats[i] == null) {
        numMeats++;
        meats[i] = new VeggiePatty();
        break;
      }
    }
  }
}
