package app.controller;

import app.entity.User;
import app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class UserController {

  private UserService service;

  public UserController(@Autowired UserService service) {
    this.service = service;
  }

  @GetMapping("/users")
  public Collection<User> getAll() {
    return service.getAll();
  }

  @GetMapping("/user/{id}")
  public User getOne(@PathVariable("id") int id) {
    return service.get(id);
  }

  @PostMapping("/user/add/{name}")
  public User addOne(@PathVariable("name") String name) {
    return service.create(name);
  }

  @PostMapping("/user/add2")
  public User addOne2(@RequestParam("name") String name) {
    return service.create(name);
  }

}
