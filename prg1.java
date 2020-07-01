package EncapAbs;
import java.util.*;
public class prg1 {

	  private String name;
	  private String email;
	  private char gender; 
	  public Author(String name, String email, char gender) {
	       this.name = name;
	       this.email = email;
	       this.gender = gender;
	    }
	    public String getName() ss
	        return name;
	     }
	     public char getGender() {
	        return gender;
	     }
	     public String getEmail() {
	        return email;
	     }
	     public void setEmail(String email) {
	        this.email = email;
	     }
	     public String toString() {
	        return name + " (" + gender + ") at " + email;
	     }
	}


 