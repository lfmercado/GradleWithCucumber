package co.com.ejemplo.gradle.questions;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ThePurcheseIsCorrect implements Question<Boolean> {

	private String message = "Your order on My Store is complete.";
	@Override
	public Boolean answeredBy(Actor actor) {
		
		String success = Serenity.sessionVariableCalled("success");
		System.out.println(success);
		
		return this.message.equalsIgnoreCase(success);
	}

	public static ThePurcheseIsCorrect Item() {
		return new ThePurcheseIsCorrect();
	}
}
