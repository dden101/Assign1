package SoftwareFinalYearProject.Assign1;
import java.util.ArrayList;

import org.joda.time.LocalDate;
import org.joda.time.Years;


public class Student {
	
	 	private String name;
	    private int age;
	    private int ID;
	    private String Username;
	    private LocalDate DOB;
	    

	    public Student(String name, int age,int ID, LocalDate DOB) 
	    {

	        this.name = name;
	        this.age = age;
	        this.DOB = DOB;
	        this.ID = ID;
	        this.setUsername();
	              	
	    }

	   

	    public void setName(String name) // name
	    {
	        this.name = name;
	    }
	   
	    public String getName() // name
	    {
	        return name;
	    }


	    public void setDOB(LocalDate DOB) //Date of birth
	    {
	        this.DOB = DOB;
	    }
	   
	    public LocalDate getDOB() 
	    {
	        return DOB;
	    }
	    
	  
	    public String setUsername()
	    {
	        this.Username = this.name +this.DOB;
	        return this.Username;
	    }
	    
	    public String getUsername()
	    {
	    	return Username;
	    	
	    }
	    public int getAge() 
	    {
	        return age;
	    }
	    
	    public int getID() 
	    {
	        return ID;
	    }
	}

