package testes;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runners.MethodSorters;

import auxiliares.Auxiliares;
import auxiliares.Constantes;
import driver.Driver;
import pageObjects.PageObjectsResultado;
import pageObjects.PageObjectsSetup;

/**
 * 
 * @author Widancassio Galindo da Silva
 * 
 *         Esta classe é responsável pelos testes a serem executados no app
 *         Resultados. Framework utilizado: JUnit
 *
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestResultados {

	Driver d = new Driver();
	PageObjectsSetup pSetup = new PageObjectsSetup();
	PageObjectsResultado pResultado = new PageObjectsResultado();
	Auxiliares aux = new Auxiliares();

	@BeforeEach
	public void startDriver() {
		d.getDriver();
	}

	@AfterEach
	public void closeDriver() {
		d.closeDriver();
	}

	/**
	 * Teste de fluxo do setup do app Resultados
	 */
	@Test
	public void appSetupTest() {
		aux.searchElement(pSetup.btn_proximo);
		aux.searchElement(pSetup.btn_entendi);
		aux.performSwipe(513, 1454, 513, 684);
		aux.searchElement(pSetup.btn_li_aceito);
		Assertions.assertEquals(Constantes.MSG_TELA_INICIAL, aux.validateElement(pSetup.result_tela_inicial));
	}

	/**
	 * Teste de fluxo de busca do resultado no app Resultados Eleição 2020, segundo
	 * turno, Recife - PE.
	 */
	@Test
	public void buscaResultadosRecifeTest() {
		aux.searchElement(pResultado.frase_tela_inicial);
		aux.searchElement(pResultado.btn_escolher_eleicao);
		aux.searchElement(pResultado.btn_escolher_turno);
		aux.searchElement(pResultado.btn_escolher_local);
		aux.searchElement(pResultado.btn_escolher_uf);
		aux.performSwipe(564, 1492, 564, 700);
		aux.searchElement(pResultado.btn_uf);
		aux.searchElement(pResultado.btn_confirmar);
		aux.searchElement(pResultado.btn_escolher_municipio);
		aux.searchElement(pResultado.btn_municipio);
		aux.searchElement(pResultado.btn_confirmar);
		aux.searchElement(pResultado.btn_confirmar);
		Assertions.assertEquals(Constantes.MSG_TOTAL_APURADO, aux.validateElement(pResultado.result_total_apurado));
		Assertions.assertEquals(Constantes.MSG_PREFEITO_ELEITO, aux.validateElement(pResultado.result_prefeito_eleito));
	}

}
