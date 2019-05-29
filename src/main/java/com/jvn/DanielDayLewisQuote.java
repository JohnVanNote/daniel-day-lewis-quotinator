package com.jvn;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class DanielDayLewisQuote {

  private long id;
  private String noun;

  private static final List<String> QUOTES = Arrays.asList(
      "I drink your %s! I drink it up!", // There will be blood
      "Each of the Five Points is a finger. When I close it, it becomes a %s and if I choose I can turn it against you.", // Gangs of New York
      "There is an air of quiet %s in this house and I do not like the way it smells.", // Phantom Thread
      "I wish He had chosen an instrument more %s than the House of Representatives.", // Lincoln
      "I'm a %s, and I'm going out the front door." // In the Name of the Father
  );

  public DanielDayLewisQuote(long id, String noun) {
    this.id = id;
    this.noun = noun;
  }

  public long getId() {
    return id;
  }

  public String getQuote() {
    Random random = new Random();
    int index = random.nextInt(QUOTES.size());
    return String.format(QUOTES.get(index), noun);
  }

}
