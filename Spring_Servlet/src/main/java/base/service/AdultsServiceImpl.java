package base.service;

import org.springframework.beans.factory.annotation.Autowired;

import base.dao.AdultsDao;
import base.model.Adults;


public class AdultsServiceImpl implements AdultsService {
	@Autowired	 
	 public AdultsDao adultDao;
	 
	 public int register(Adults adult) {
		    return adultDao.register(adult);
		  }
}
