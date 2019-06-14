package co.com.ejemplo.gradle.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import co.com.ejemplo.gradle.userinterface.MyStore;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

public class CrearUsuario implements Task {

	@Override
	@Step("{0} busca youtube en el cajon de google")
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(	
				Click.on(MyStore.SIGN_IN),
				Enter.theValue("correprueba002@hotmail.com").into(MyStore.EMAIL),
				Click.on(MyStore.CREATE_ACCOUNT),
				WaitUntil.the(MyStore.RADIO_BUTTON_MR, isVisible()),
				Click.on(MyStore.RADIO_BUTTON_MR),
				Enter.theValue("Luis Fernando").into(MyStore.FIRST_NAME1),
				Enter.theValue("Mercado").into(MyStore.LAST_NAME1),
				Enter.theValue("correprueba002@hotmail.com").into(MyStore.EMAIL_CONFIRM),
				Enter.theValue("123456").into(MyStore.PASSWORD),
				Click.on(MyStore.DAY),
				Click.on(MyStore.MONTH),
				Click.on(MyStore.YEAR),
				Enter.theValue("Luis Fernando").into(MyStore.FIRST_NAME),
				Enter.theValue("Mercado").into(MyStore.LAST_NAME),
				Enter.theValue("SOFKA").into(MyStore.COMPANY),
				Enter.theValue("Cra 10").into(MyStore.ADDRESS),
				Enter.theValue("Medellin").into(MyStore.CITY),
				Click.on(MyStore.STATE),
				Enter.theValue("00000").into(MyStore.POSTAL_CODE),
				Click.on(MyStore.COUNTRY),
				Enter.theValue("0000000").into(MyStore.PHONE),
				Enter.theValue("Cra 11").into(MyStore.ADDRESS_CONFIRM)
				
				);
		
		//aud = Text.of(ApprovedPage.INFOAUD).viewedBy(actor).asString();
		//Serenity.setSessionVariable("aud").to(aud);
		
		
		//se llama en las question
		//String aud = Serenity.sessionVariableCalled("aud");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static CrearUsuario toYoutube() {
		return instrumented(CrearUsuario.class);
	}


}
