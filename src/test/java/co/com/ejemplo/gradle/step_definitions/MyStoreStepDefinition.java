package co.com.ejemplo.gradle.step_definitions;

import org.openqa.selenium.WebDriver;
import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static org.hamcrest.Matchers.is;
import co.com.ejemplo.gradle.questions.ThePurcheseIsCorrect;
import co.com.ejemplo.gradle.tasks.CreateUser;
import co.com.ejemplo.gradle.tasks.OpenTheBrowser;
import co.com.ejemplo.gradle.tasks.PurchaseItem;
import co.com.ejemplo.gradle.userinterface.CreateAnAccount;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class MyStoreStepDefinition {
	
	@Managed(driver = "chrome", options = "--incognito --start-maximized,  --ignore-certificate-errors, --disable-translate, --always-authorize-plugins, --disable-extensions, --disable-popup-blocking, --lang=es,--disable-download-notification,--test-type, --allow-running-insecure-content")
	private WebDriver herBrowser;
	private Actor actor = Actor.named("actor");
	private CreateAnAccount google;
	
	@Before
	public void setup() {
		actor.can(BrowseTheWeb.with(herBrowser));

	}
	
	@Given("^The user enters the page of My Store and registers$")
	public void The_user_enters_the_page_of_My_Store_and_registers() throws Exception {
		actor.wasAbleTo(OpenTheBrowser.at(google));
	    
	}


	@When("^The user buys an article$")
	public void The_user_buys_an_article() throws Exception {
		actor.attemptsTo(CreateUser.SignIn());
		actor.attemptsTo(PurchaseItem.Buy());
	}

	@Then("^The user should see the purchased item$")
	public void The_user_should_see_the_purchased_item() throws Exception {
	    actor.should(seeThat(ThePurcheseIsCorrect.Item(), is(true)));
	    
	}

}
