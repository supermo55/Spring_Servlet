package  base.service;

import org.springframework.beans.factory.annotation.Autowired;

import  base.dao.UserDao;
import  base.model.Login;
import  base.model.User;

public class UserServiceImpl implements UserService {

  @Autowired
  public UserDao userDao;

  public int register(User user) {
    return userDao.register(user);
  }

  public User validateUser(Login login) {
    return userDao.validateUser(login);
  }

}