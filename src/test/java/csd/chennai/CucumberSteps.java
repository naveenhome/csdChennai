package csd.chennai;

import junit.framework.TestCase;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucumberSteps extends TestCase{
	
	PatientVisit patientVisit = new PatientVisit();
	String actionButton;
	@Given("^\"([^\"]*)\" is uploading new Rx as doctor name \"([^\"]*)\" and date is \"([^\"]*)\", time is \"([^\"]*)\" and file name is \"([^\"]*)\"$")
	public void InputData(String pName, String dName, String vDate, String vTime, String fileName) throws Throwable {
	    // Express the Regexp above with the code you wish you had
		patientVisit.setpName(pName);
		patientVisit.setdName(dName);
		patientVisit.setvDate(vDate);
		patientVisit.setvTime(vTime);
		patientVisit.setFileName(fileName);
	}

	@When("^click on \"([^\"]*)\"$")
	public void ActionPerformed(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    actionButton=arg1;
	}

	@Then("^System display a message \"([^\"]*)\"$")
	public void ExpectedOutput(String expectedResult) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    PatientController pControl = new PatientController();
	    if(actionButton.equals("Submit"))
	    {
	    	assertEquals(expectedResult, pControl.saveRx(patientVisit));
	    }
	    
	}

	@Given("^User has enter correct data$")
	public void User_has_enter_correct_data() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}
	@Given("^\"([^\"]*)\" is loggied In$")
	public void is_loggied_In(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

}
