package login;



import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class test {
	@Given("^Browser must install the browser$")
	public void browser_must_install_the_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^user enters the required fields$")
	public void user_enters_the_required_fields(DataTable arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		List<Map<String , String>> Credential= arg1.asMaps(String.class, String.class);
				for(int i=0;i<Credential.size();i++)
				{
					System.out.println(Credential.get(i).get("Username")+"\t "+ Credential.get(i).get("password"));
				}
	  
		
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("^user will find the entered page$")
	public void user_will_find_the_entered_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Given("^user must enter the registration page$")
	public void user_must_enter_the_registration_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^user enters the data into required fields$")
	public void user_enters_the_data_into_required_fields() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("^user must be enterd into the login page$")
	public void user_must_be_enterd_into_the_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Given("^user enters the username$")
	public void user_enters_the_username() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Given("^user enters the password$")
	public void user_enters_the_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("^user enters login credentials$")
	public void user_enters_login_credentials() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  
	}

	@Then("^user clicks submit and enters the home page$")
	public void user_clicks_submit_and_enters_the_home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}


}
