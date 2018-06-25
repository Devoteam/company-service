package be.arno.userservice.controllers;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/companies", produces = APPLICATION_JSON_UTF8_VALUE)
public class UserController {

  @GetMapping(value = "hello")
  public String helloFromUserService() {
    return "Hello from Company-Service";
  }

}
