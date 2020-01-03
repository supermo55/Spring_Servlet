package base.model;

import base.model.User;

public class Adults {

	  private String firstname;
	  private String lastname;
	  private String className;
	  private String time;
	  private String emergencycontact;
	  private String address;
	  
	  public String getFirstname() {
		  return firstname;
		  }
	  public void setFirstname(String firstname) {
		  this.firstname = firstname;
		  }
	  public String getLastname() {
		  return lastname;
		  }
	  public void setLastname(String lastname) {
		  this.lastname = lastname;
		  }
	  public void setclassName(String classname) {
	  this.className = classname;
	  }

	  public String getclassName() {
	  return className;
	  }
	  public void setTime(String classname) {
		  this.className = classname;
		  }

	  public String getTime() {
		  return className;
		  }
	  public void setemergencyContact(String econtact) {
		  this.emergencycontact = econtact;
		  }

	  public String getemergencyContact() {
		  return className;
		  }
	  
	  public String getAddress() {
		  return address;
		  }
		  public void setAddress(String address) {
		  this.address = address;
		  }
}
