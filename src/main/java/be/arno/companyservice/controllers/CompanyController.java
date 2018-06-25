package be.arno.companyservice.controllers;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

import be.arno.companyservice.repositories.CarClient;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/companies", produces = APPLICATION_JSON_UTF8_VALUE)
public class CompanyController {

  @Autowired
  private CarClient carClient;

  @GetMapping(value = "/hello")
  public String helloFromCompanyService() {
    return "Hello from Company-Service";
  }

  @GetMapping(value = "/cars/{companyId}")
  public List<String> getAllCarsForCompany(@PathVariable Long companyId) {
    return carClient.getAllCarsForCompany(companyId);
  }

}
