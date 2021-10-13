package com.testing.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InputController {

  @RequestMapping("/hello")
  public String helloWorld() {
    return "hello world!";
  }
}