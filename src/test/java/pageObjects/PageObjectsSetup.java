package pageObjects;

import org.openqa.selenium.By;

import auxiliares.Auxiliares;
import auxiliares.Constantes;
import driver.Driver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

/**
 * 
 * @author Widancassio Galindo da Silva
 * 
 *         Esta classe é responsável pelo mapeamento dos elementos que serão
 *         utilizados nas interações dos testes relacionados ao fluxo de setup
 *         no app Resultados.
 *
 */
public class PageObjectsSetup {

	AppiumDriver<MobileElement> driver = Driver.getDriver();
	Auxiliares aux = new Auxiliares();

	public By btn_proximo = MobileBy.AndroidUIAutomator(Constantes.BTN_PROXIMO);
	public By btn_entendi = MobileBy.AndroidUIAutomator(Constantes.BTN_ENTENDI);
	public By btn_li_aceito = MobileBy.AndroidUIAutomator(Constantes.BTN_LI_ACEITO);
	public By result_tela_inicial = MobileBy.AndroidUIAutomator(Constantes.FRASE_TELA_INICIAL);

}
