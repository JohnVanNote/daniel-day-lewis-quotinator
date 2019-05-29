package com.jvn;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MonsterController {

  private static final String TEMPLATE = "Nom, nom, nom eating %s";
  private final AtomicLong counter = new AtomicLong();

  @RequestMapping("/monster") //, method = RequestMethod.GET)
  public Monster monster(@RequestParam(value = "food", defaultValue = "Pizza") String food) {
    return new Monster(counter.incrementAndGet(), String.format(TEMPLATE, food));
  }

}
