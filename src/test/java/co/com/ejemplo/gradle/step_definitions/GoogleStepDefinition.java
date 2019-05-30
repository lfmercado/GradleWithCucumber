package co.com.ejemplo.gradle.step_definitions;

import org.openqa.selenium.WebDriver;
import co.com.ejemplo.gradle.tasks.BuscarYoutube;
import co.com.ejemplo.gradle.tasks.OpenTheBrowser;
import co.com.ejemplo.gradle.userinterface.Google;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class GoogleStepDefinition {
	
	@Managed(driver = "chrome", options = "--incognito --start-maximized,  --ignore-certificate-errors, --disable-translate, --always-authorize-plugins, --disable-extensions, --disable-popup-blocking, --lang=es,--disable-download-notification,--test-type, --allow-running-insecure-content")
	private WebDriver herBrowser;
	private Actor actor = Actor.named("actor");
	private Google google;
	
	@Before
	public void setup() {
		actor.can(BrowseTheWeb.with(herBrowser));

	}
	
	@Given("^el usuario ingresa a la pagina de google$")
	public void el_usuario_ingresa_a_la_pagina_de_google() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		actor.wasAbleTo(OpenTheBrowser.at(google));
	    
	}


	@When("^el usurio selecciona una cancion en youtube$")
	public void el_usurio_selecciona_una_cancion_en_youtube() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		actor.attemptsTo(BuscarYoutube.toYoutube());   
	}

	@Then("^el titulo de la cancion debe de verse en el titulo de la pagina$")
	public void el_titulo_de_la_cancion_debe_de_verse_en_el_titulo_de_la_pagina() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

}
