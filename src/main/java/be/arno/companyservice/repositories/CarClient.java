package be.arno.companyservice.repositories;

import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "car-service")
public interface CarClient {

  @GetMapping("/cars/companies/{companyId}")
  List<String> getAllCarsForCompany(@PathVariable("companyId") Long companyId);

}
