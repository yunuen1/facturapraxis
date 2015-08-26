
package com.praxis.ejem.test.pages.main.emision;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.praxis.ejem.test.pages.Page;
import com.praxis.ejem.test.pages.constants.PageURLsConstants;

public class GenerarComprobantePage extends Page<GenerarComprobantePage> {

	public static final String SUCCESS = "Se generó el comprobante exitosamente.";

	@FindBy(how = How.ID, using = "factura:factPan:0:selectEmisor")
	private WebElement emisorSelect;

	@FindBy(how = How.ID, using = "factura:factPan:0:selectSerie")
	private WebElement serieSelect;

	@FindBy(how = How.ID, using = "factura:factPan:0:selectGrupos")
	private WebElement gruposSelect;

	@FindBy(how = How.ID, using = "factura:factPan:0:selectReceptor")
	private WebElement receptorSelect;

	@FindBy(how = How.ID, using = "factura:factPan:0:selectMoneda")
	private WebElement monedaSelect;

	@FindBy(how = How.ID, using = "factura:factPan:0:selectFormaPago")
	private WebElement formaPagoSelect;

	@FindBy(how = How.ID, using = "factura:factPan:0:selectMetodoPago")
	private WebElement metodoPagoSelect;

	@FindBy(how = How.ID, using = "factura:factPan:0:idIVA")
	private WebElement ivaTxt;

	@FindBy(how = How.ID, using = "factura:factPan:0:idCantiProd")
	private WebElement cantidaTxt;

	@FindBy(how = How.ID, using = "factura:factPan:0:idUnidad")
	private WebElement medidaTxt;

	@FindBy(how = How.ID, using = "factura:factPan:0:idValorUnitario")
	private WebElement valorUnitarioTxt;

	@FindBy(how = How.ID, using = "factura:factPan:0:idDescrip")
	private WebElement conceptoTxt;

	@FindBy(how = How.ID, using = "factura:factPan:0:btnAgregarConcep")
	private WebElement agregarbtn;

	@FindBy(how = How.ID, using = "factura:btnGenCompFoot")
	private WebElement generarComprobantebtn;

	@FindBy(how = How.ID, using = "factura:j_id3039")
	private WebElement confirmacionMsg;

	@FindBy(how = How.ID, using = "factura:j_id3042")
	private WebElement aceptarBtn;

	public GenerarComprobantePage(WebDriver driver) {
		super(driver, PageURLsConstants.GENERAR_COMPROBANTE_PAGE);
		// TODO Auto-generated constructor stub
	}

	public String generarComprobante() {
		String respuesta = "";
		try {
			safeSelectValue(emisorSelect, "2935");
			Thread.sleep(1000);
			safeSelectValue(serieSelect, "1752");
			Thread.sleep(1000);
			safeSelectValue(gruposSelect, "155");
			Thread.sleep(1000);
			safeSelectValue(receptorSelect, "50110");
			Thread.sleep(1000);
			safeSelectValue(monedaSelect, "MXN");
			safeSelectValue(metodoPagoSelect, "No identificado");
			safeSendKeys(ivaTxt, "16");
			safeSendKeys(cantidaTxt, "16");
			safeSendKeys(medidaTxt, "1");
			safeSendKeys(valorUnitarioTxt, "1");
			safeSendKeys(conceptoTxt, "prueba aut 1");
			safeClick(agregarbtn);
			safeClick(generarComprobantebtn);
			Thread.sleep(1000);
			respuesta = safeGetLabel(confirmacionMsg);
			safeClick(aceptarBtn);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return respuesta;
	}

}
