package co.com.ejemplo.gradle.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import co.com.ejemplo.gradle.userinterface.ItemPage;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class PurchaseItem implements Task {
	public String success;
	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(
				WaitUntil.the(ItemPage.PRINCIPAL, isVisible()),
				Click.on(ItemPage.PRINCIPAL),
				Click.on(ItemPage.DRESSES),
				WaitUntil.the(ItemPage.CASUALDRESSES, isVisible()),
				Click.on(ItemPage.CASUALDRESSES),
				WaitUntil.the(ItemPage.ITEM, isVisible()),
				Click.on(ItemPage.ITEM),
				WaitUntil.the(ItemPage.ADD, isVisible()),
				Click.on(ItemPage.ADD),
				Click.on(ItemPage.PROCEED),
				Click.on(ItemPage.PROCEED2),
				Click.on(ItemPage.CHECKOUT),
				Click.on(ItemPage.TERMSSERVICE),
				Click.on(ItemPage.CHECKOUT2),
				Click.on(ItemPage.PAYBAYCHECK),
				Click.on(ItemPage.CONFIRM)
				);
		
		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		success = Text.of(ItemPage.SUCCESS).viewedBy(actor).asString();
		Serenity.setSessionVariable("success").to(success);
		
	}
	
	public static PurchaseItem Buy() {
		return instrumented(PurchaseItem.class);
	}

}
