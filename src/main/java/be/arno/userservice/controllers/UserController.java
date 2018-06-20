package be.arno.userservice.controllers;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users", produces = APPLICATION_JSON_UTF8_VALUE)
public class UserController {

  @GetMapping
  public String test() {
    return "User-Service";
  }

}
