package SoftwareFinalYearProject.Assign1;

import java.util.ArrayList;

import org.joda.time.LocalDate;

public class Module {
	    private String ModID;
	    private String ModuleName;
	    private ArrayList<Student> students = new ArrayList<Student>(); 
	    

	    public Module(String ModName, String id) 
	    {

	        this.ModuleName = ModName;
	        this.ModID= id;
	        students = new ArrayList<Student>();
	        
	    }

	    public void setModName(String ModuleName) // name
	    {
	        this. ModuleName = ModuleName;
	    }

	    public void setModID(String ModID) // name
	    {
	        this. ModID = ModID;
	    }
	    public void registerStudent (Student s)
	    {
	    	students.add(s);
	    	
	    }
	    public String getModuleName()
	    {
	    	return ModuleName;
	    	
	    }
	    public String getModuleID()
	    {
	    	return ModID;
	    }
	    public ArrayList<Student> getStudents()
	    {
	    	return students;
	    	
	    }
	    
}
