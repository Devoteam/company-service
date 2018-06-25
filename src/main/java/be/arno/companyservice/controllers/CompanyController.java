package be.arno.companyservice.controllers;

import static com.google.common.collect.Lists.newArrayList;
import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

import be.arno.companyservice.models.Company;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/companies", produces = APPLICATION_JSON_UTF8_VALUE)
public class CompanyController {

  @GetMapping(value = "/all")
  public List<Company> getAllcompanies() {
    return newArrayList(
        new Company(1, "Belfius"),
        new Company(2, "KBC"),
        new Company(3, "ING"),
        new Company(4, "Argenta")
    );
  }

}
