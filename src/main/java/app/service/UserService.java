package app.service;

import app.entity.User;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {
  private final Map<Integer, User> data = new HashMap<>();

  public UserService() {
    this.data.put(1, new User("Jim", 1));
    this.data.put(2, new User("John", 2));
  }

  public Collection<User> getAll() {
    return data.values();
  }

  public User get(int id) {
    return data.get(id);
  }

  public User create(String name) {
    User newUser = new User(name, data.size() + 1);
    this.data.put(data.size() + 1, newUser);
    return newUser;
  }
}
