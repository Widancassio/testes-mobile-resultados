package auxiliares;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import driver.Driver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

/**
 * 
 * @author Widancassio Galindo da Silva
 * 
 *         Esta classe é contém métodos que auxiliam na execução das interações
 *         com o device e respectivamente nos testes
 *
 */
public class Auxiliares {

	AppiumDriver<MobileElement> driver = Driver.getDriver();

	public void implicitlyWait() {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	/**
	 * 
	 * @param x_origem
	 * @param y_origem
	 * @param x_destino
	 * @param y_destino
	 * 
	 *                  Método que vai realizar um swipe na tela quando for
	 *                  necessário, ele recebe como parametro as posições origem e
	 *                  destino dos eixos X e Y.
	 */
	public void performSwipe(int x_origem, int y_origem, int x_destino, int y_destino) {
		implicitlyWait();
		new TouchAction(driver).press(PointOption.point(x_origem, y_origem))
				.moveTo(PointOption.point(x_destino, y_destino)).release().perform();
		generateLog("Swipe realizado na tela com sucesso!");
	}

	/**
	 * 
	 * @param element
	 * 
	 *                Método que irá receber como parametro um elemento mapeado no
	 *                page object e realizar a busca do mesmo utilizando o método
	 *                existente findElement.
	 */
	public void searchElement(By element) {
		implicitlyWait();
		driver.findElement(element).click();
		generateLog("Elemento " + element.toString() + " clicado com sucesso!");
	}

	/**
	 * 
	 * @param element
	 * @return
	 * 
	 *         Método que irá auxiliar na validação do teste. O mesmo irá retornar o
	 *         texto que contém no elemento que foi buscado na tela.
	 */
	public String validateElement(By element) {
		return driver.findElement(element).getText();
	}

	/**
	 * 
	 * @param msg
	 * 
	 *            Método para gerar logs
	 */
	public void generateLog(String msg) {
		System.out.println(msg);
	}

}
