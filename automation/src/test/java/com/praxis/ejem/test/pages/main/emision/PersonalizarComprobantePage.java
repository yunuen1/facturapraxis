package com.praxis.ejem.test.pages.main.emision;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.praxis.ejem.test.pages.Page;
import com.praxis.ejem.test.pages.constants.PageURLsConstants;

public class PersonalizarComprobantePage extends Page<PersonalizarComprobantePage> {
	
	public static final String SUCCESS = "Se generó el comprobante exitosamente.";
	
	@FindBy(how = How.ID, using = "taxPayerCostum:items")
	private WebElement contribuyenteSelect;

	@FindBy(how = How.ID, using = "taxPayerCostum:plantillaIn:_1")
	private WebElement plantilla1Chk;
	
	@FindBy(how = How.ID, using = "taxPayerCostum:j_id78:j_id79:icn")
	private WebElement GuardarSelect;
	
	@FindBy(how = How.ID, using = "taxPayerCostum:j_id203")
	private WebElement confirmacionMsg;
	
	@FindBy(how = How.ID, using = "taxPayerCostum:j_id208")
	private WebElement aceptarBtn;	

	public PersonalizarComprobantePage(WebDriver driver) {
		super(driver, PageURLsConstants.PERSONALIZAR_COMPROBANTE_PAGE);
		// TODO Auto-generated constructor stub
	}
	
		public String personalizarComprobante() {
		String respuesta = "";
		
		safeSelectValue(contribuyenteSelect, "2935");
		safeClick(plantilla1Chk);
		safeClick(GuardarSelect);
		respuesta = safeGetLabel(confirmacionMsg);
		safeClick(aceptarBtn);
		return respuesta;
		
	}
		
}
