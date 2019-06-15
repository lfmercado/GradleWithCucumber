package co.com.ejemplo.gradle.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import co.com.ejemplo.gradle.userinterface.CreateAnAccount;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

public class CreateUser implements Task {
	public String name = "Luis Fernando";
	public String lastName = "Mercado";
	public String email = "correprueba009@hotmail.com";
	public String password = "123456";
	@Override
	@Step("{0} busca youtube en el cajon de google")
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(	
				Click.on(CreateAnAccount.SIGN_IN),
				Enter.theValue(email).into(CreateAnAccount.EMAIL),
				Click.on(CreateAnAccount.CREATE_ACCOUNT),
				WaitUntil.the(CreateAnAccount.RADIO_BUTTON_MR, isVisible()),
				Click.on(CreateAnAccount.RADIO_BUTTON_MR),
				Enter.theValue(name).into(CreateAnAccount.FIRST_NAME1),
				Enter.theValue(lastName).into(CreateAnAccount.LAST_NAME1),
				Enter.theValue(email).into(CreateAnAccount.EMAIL_CONFIRM),
				Enter.theValue(password).into(CreateAnAccount.PASSWORD),
				Click.on(CreateAnAccount.DAY),
				Click.on(CreateAnAccount.MONTH),
				Click.on(CreateAnAccount.YEAR),
				Enter.theValue(name).into(CreateAnAccount.FIRST_NAME),
				Enter.theValue(lastName).into(CreateAnAccount.LAST_NAME),
				Enter.theValue("SOFKA").into(CreateAnAccount.COMPANY),
				Enter.theValue("Cra 10").into(CreateAnAccount.ADDRESS),
				Enter.theValue("Medellin").into(CreateAnAccount.CITY),
				Click.on(CreateAnAccount.STATE),
				Enter.theValue("00000").into(CreateAnAccount.POSTAL_CODE),
				Click.on(CreateAnAccount.COUNTRY),
				Enter.theValue("0000000").into(CreateAnAccount.PHONE),
				Enter.theValue("Cra 11").into(CreateAnAccount.ADDRESS_CONFIRM),
				Click.on(CreateAnAccount.CONFIRM)
				);
		
		//aud = Text.of(ApprovedPage.INFOAUD).viewedBy(actor).asString();
		//Serenity.setSessionVariable("aud").to(aud);
		
		
		//se llama en las question
		//String aud = Serenity.sessionVariableCalled("aud");		
	}
	public static CreateUser SignIn() {
		return instrumented(CreateUser.class);
	}


}
