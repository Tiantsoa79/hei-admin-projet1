package school.hei.haapi.endpoint.rest.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:3000")
public class HealthController {

  @GetMapping(value = "/ping", produces = "text/plain")
  public String ping() {
    return "pong";
  }
}
