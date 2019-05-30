package co.com.ejemplo.gradle.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.ejemplo.gradle.userinterface.Google;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

public class BuscarYoutube implements Task {

	@Override
	@Step("{0} busca youtube en el cajon de google")
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(
				Click.on(Google.BARRA_BUSCAR),
				Enter.theValue("Youtube \n").into(Google.BARRA_BUSCAR));
		
	}
	public static BuscarYoutube toYoutube() {
		return instrumented(BuscarYoutube.class);
	}


}
