package com.jvn;

public class Monster {

  private long id;
  private String food;

  public Monster(long id, String food) {
    this.id = id;
    this.food = food;
  }

  public long getId() {
    return id;
  }

  public String getFood() {
    return food;
  }

}
