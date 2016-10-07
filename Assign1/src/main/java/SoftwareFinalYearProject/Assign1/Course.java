package SoftwareFinalYearProject.Assign1;

import java.util.ArrayList;

import org.joda.time.LocalDate;

public class Course {
	
	private String Course;
	private ArrayList<Module> modules = new ArrayList<Module>(); 
	private LocalDate startDate;
	private LocalDate endDate;
	
	public Course(String Course,LocalDate startDate, LocalDate endDate)
	{ 
		this.Course=Course;
		this.startDate=startDate;
		this.endDate=endDate;
	}
	
	  public String getCourseName() // name
	    {
	        return Course;
	    }
	  public LocalDate getstartDate()
	    {
	        return startDate;
	    }
	  public LocalDate getendDate()
	    {
	        return endDate;
	    }
	  public ArrayList<Module> getmodules()
	    {
	    	return modules;
	    	
	    }
}
