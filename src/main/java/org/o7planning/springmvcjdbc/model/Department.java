package org.o7planning.springmvcjdbc.model;

public class Department {

	private float bunny;
	   private String name;
	   private String sex;
	   
	 
	   public Department() {
	 
	   }
	 
	   public Department(float bunny, String name, String sex) {
	       this.bunny = bunny;
		   this.name = name;
	       this.sex = sex;
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
}
