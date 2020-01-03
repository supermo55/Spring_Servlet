package base.service;


import base.model.Kids;
import org.springframework.beans.factory.annotation.Autowired;
import base.dao.KidsDao;


public class KidsServiceImpl implements KidsService{
	@Autowired	 
	 public KidsDao kidDao;
	 
	 public int register(Kids kid) {
		    return kidDao.register(kid);
		  }
}
