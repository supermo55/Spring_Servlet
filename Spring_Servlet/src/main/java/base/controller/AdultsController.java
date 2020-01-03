package base.controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import base.model.Adults;
import base.model.Kids;
import base.model.Login;
import  base.model.User;
import base.service.AdultsService;
import base.service.KidsService;
import  base.service.UserService;
@Controller
public class AdultsController
 {
	 @Autowired
	  AdultsService adultService;
	  @RequestMapping(value = "/adults", method = RequestMethod.GET)
	  public ModelAndView showRegister(HttpServletRequest request, HttpServletResponse response) {
		    ModelAndView mav = new ModelAndView("adults");
		    mav.addObject("adults", new Adults());
		    return mav;
		  }
	  @RequestMapping(value = "/adultsClasses", method = RequestMethod.POST)
	  public ModelAndView registerKid(HttpServletRequest request, HttpServletResponse response,
			   @ModelAttribute("adults") Adults adult) {
			  adultService.register(adult);
			  return new ModelAndView("adultRegistered", "firstname", adult.getFirstname());
			  }
}
