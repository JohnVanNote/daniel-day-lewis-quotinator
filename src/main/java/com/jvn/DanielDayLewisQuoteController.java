package com.jvn;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DanielDayLewisQuoteController {

  private final AtomicLong counter = new AtomicLong();

  @RequestMapping("/daniel-day-lewis-quotinator") //, method = RequestMethod.GET)
  public DanielDayLewisQuote quote(@RequestParam(value = "noun", defaultValue = "Milkshake") String noun) {
    return new DanielDayLewisQuote(counter.incrementAndGet(), noun);
  }

}
