package org.o7planning.springmvcjdbc.model;

public class Department {
	   
	   private float bunny;
	   private String name;
	   private String sex;
	   private String colour;
	   
	 
	   public Department() {
	 
	   }
	 
	   public Department(float bunny, String name, String sex, String colour) {
		   
	       this.bunny = bunny;
		   this.name = name;
	       this.sex = sex;
	       this.colour = colour;
	   } 
	  
	   public Float getBunny() {
		   return bunny;
	   }
	   
	   public void setBunny(Float bunny) {
		   this.bunny = bunny;
	   }
	 
	   public String getName() {
	       return name;
	   }
	 
	   public void setName(String name) {
	       this.name = name;
	   }
	 
	   public String getSex() {
	       return sex;
	   }
	 
	   public void setSex(String sex) {
	       this.sex = sex;
	   }
	   public String getColour() {
		   return colour;
	   }
	   public void setColour(String colour) {
		   this.colour = colour;
	   }
}
