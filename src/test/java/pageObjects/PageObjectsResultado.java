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
 *         utilizados nas interações dos testes relacionados ao fluxo de busca
 *         de resultado no app Resultados.
 *
 */
public class PageObjectsResultado {

	AppiumDriver<MobileElement> driver = Driver.getDriver();
	Auxiliares aux = new Auxiliares();

	public By frase_tela_inicial = MobileBy.AndroidUIAutomator(Constantes.FRASE_TELA_INICIAL);
	public By btn_escolher_eleicao = MobileBy.xpath(Constantes.BTN_ESCOLHER_ELEICAO);
	public By btn_escolher_turno = MobileBy.AndroidUIAutomator(Constantes.BTN_TURNO);
	public By btn_escolher_local = MobileBy.AndroidUIAutomator(Constantes.BTN_ESCOLHER_LOCAL);
	public By btn_escolher_uf = MobileBy.AndroidUIAutomator(Constantes.BTN_ESCOLHER_UF);
	public By btn_uf = MobileBy.AndroidUIAutomator(Constantes.BTN_UF);
	public By btn_confirmar = MobileBy.AndroidUIAutomator(Constantes.BTN_CONFIRMAR);
	public By btn_escolher_municipio = MobileBy.AndroidUIAutomator(Constantes.BTN_ESCOLHER_MUNICIPIO);
	public By btn_municipio = MobileBy.AndroidUIAutomator(Constantes.BTN_MUNICIPIO);
	public By result_total_apurado = MobileBy.AndroidUIAutomator(Constantes.TOTAL_APURADO);
	public By result_prefeito_eleito = MobileBy.AndroidUIAutomator(Constantes.PREFEITO_ELEITO);

}
