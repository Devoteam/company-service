package be.arno.companyservice.controllers;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/companies", produces = APPLICATION_JSON_UTF8_VALUE)
public class CompanyController {

  @GetMapping(value = "/hello")
  public String helloFromCompanyService() {
    return "Hello from Company-Service";
  }

}
