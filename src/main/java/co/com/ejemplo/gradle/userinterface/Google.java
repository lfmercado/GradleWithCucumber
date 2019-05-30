package co.com.ejemplo.gradle.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.By;
@DefaultUrl("https://google.com.co")
public class Google  extends PageObject {

	public static final Target BARRA_BUSCAR = Target.the("el cajon de busqueda de google").located(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input"));
}
