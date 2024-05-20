package org.example.elkdemo.web;

import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class DemoController {

  @GetMapping("/hello")
  public String testable() {
    log.info("Hello World!");
    return "hello";
  }

  @GetMapping("/list")
  public List<String> testableList() {
    log.info("List of values are requested.");
    return List.of("String 1", "String 2");
  }
}
