package  base.dao;
import  base.model.Login;
import  base.model.User;
public interface UserDao {
  int register(User user);
  User validateUser(Login login);
}
