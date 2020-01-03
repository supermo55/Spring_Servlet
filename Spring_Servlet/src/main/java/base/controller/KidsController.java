package base.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import base.model.Kids;
import  base.model.User;
import  base.service.KidsService;
@Controller
public class KidsController {
  @Autowired
  KidsService kidService;
  @RequestMapping(value = "/kids", method = RequestMethod.GET)
  public ModelAndView showRegister(HttpServletRequest request, HttpServletResponse response) {
	    ModelAndView mav = new ModelAndView("kids");
	    mav.addObject("kids", new Kids());
	    return mav;
	  }
  @RequestMapping(value = "/kidsClasses", method = RequestMethod.POST)
  public ModelAndView registerKid(HttpServletRequest request, HttpServletResponse response,
		   @ModelAttribute("kids") Kids kid) {
		  kidService.register(kid);
		  return new ModelAndView("kidRegistered", "kidsfname", kid.getKidsfname());
		  }
}
