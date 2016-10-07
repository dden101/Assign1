package SoftwareFinalYearProject.Assign1;

import org.joda.time.LocalDate;

import junit.framework.Assert;
import junit.framework.TestCase;

public class Test extends TestCase {

	public void test(){
		Student test1 = new Student ("Earl", 69, 124, new LocalDate ("1994-07-12") );
		String UserName = "Earl1994-07-12";
		//Student test = new Student(name);
		Assert.assertTrue(test1.getUsername().equals(UserName));	
	}

}
