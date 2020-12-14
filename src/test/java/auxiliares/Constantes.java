package auxiliares;

/**
 * 
 * @author Widancassio Galindo da Silva
 * 
 *         Esta classe é por armazenar as tags dos elementos que serão
 *         utilizados pelos Page Objects.
 *
 */
public class Constantes {

	public static final String BTN_PROXIMO = "new UiSelector().textMatches(\"" + "Próximo" + "\")";
	public static final String BTN_ENTENDI = "new UiSelector().textMatches(\"" + "Entendi" + "\")";
	public static final String BTN_LI_ACEITO = "new UiSelector().textMatches(\"" + "Li e Aceito" + "\")";
	public static final String BTN_ESCOLHER_ELEICAO = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[1]";
	public static final String BTN_TURNO = "new UiSelector().textMatches(\""
			+ "Eleição Ordinária Municipal - 2020 - 29/11/2020 2º Turno" + "\")";
	public static final String BTN_ESCOLHER_LOCAL = "new UiSelector().textMatches(\"" + "Escolher local" + "\")";
	public static final String BTN_ESCOLHER_UF = "new UiSelector().textMatches(\"" + "Selecione o estado" + "\")";
	public static final String BTN_UF = "new UiSelector().textMatches(\"" + "Pernambuco" + "\")";
	public static final String BTN_ESCOLHER_MUNICIPIO = "new UiSelector().textMatches(\"" + "Selecione o município"
			+ "\")";
	public static final String BTN_MUNICIPIO = "new UiSelector().textMatches(\"" + "Recife" + "\")";
	public static final String BTN_CONFIRMAR = "new UiSelector().textMatches(\"" + "Confirmar" + "\")";
	public static final String FRASE_TELA_INICIAL = "new UiSelector().textMatches(\"" + "Selecione uma localidade acima"
			+ "\")";
	public static final String MSG_TELA_INICIAL = "Selecione uma localidade acima";
	public static final String TOTAL_APURADO = "new UiSelector().textMatches(\"" + "100,00% das seções totalizadas"
			+ "\")";
	public static final String MSG_TOTAL_APURADO = "100,00% das seções totalizadas";
	public static final String PREFEITO_ELEITO = "new UiSelector().textMatches(\""
			+ "56,27% 447.913 Votos PSB – 40 JOÃO CAMPOS Eleito" + "\")";
	public static final String MSG_PREFEITO_ELEITO = "56,27% 447.913 Votos PSB – 40 JOÃO CAMPOS Eleito";
}
