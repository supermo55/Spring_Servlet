package  base.service;


import  base.model.Login;
import  base.model.User;

public interface UserService {

  int register(User user);

  User validateUser(Login login);
}