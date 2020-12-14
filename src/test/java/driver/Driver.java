package driver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

/**
 * 
 * @author Widancassio Galindo da Silva
 * 
 *         Esta classe é responsável por manter o driver que está sendo usado na
 *         execução dos testes. Nela se encontram os métodos para criação do
 *         driver passando todas as informações necessárias para realizar a
 *         comunicação com o servidor Appium. Também mantém os métodos de para
 *         uso e fechamento do driver
 *
 */

public class Driver {

	private static AppiumDriver<MobileElement> appiumDriver;

	public static AppiumDriver<MobileElement> createDriver() {
		try {
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
			cap.setCapability("appPackage", "br.jus.tse.resultados");
			cap.setCapability("appActivity", "br.jus.tse.resultados.MainActivity");
			cap.setCapability("autoGrantPermissions", true);
			appiumDriver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		} catch (MalformedURLException e) {
			System.out.println(e.getMessage());
		}
		return appiumDriver;
	}

	public static AppiumDriver<MobileElement> getDriver() {
		if (appiumDriver == null) {
			return createDriver();
		}
		return appiumDriver;
	}

	public static void closeDriver() {
		appiumDriver.quit();
	}
}
