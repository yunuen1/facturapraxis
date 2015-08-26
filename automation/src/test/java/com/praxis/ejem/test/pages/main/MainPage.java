package com.praxis.ejem.test.pages.main;

import static com.praxis.ejem.test.pages.constants.PageURLsConstants.PAGE_MAIN;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.praxis.ejem.test.pages.Page;
import com.praxis.ejem.test.pages.main.emision.GenerarComprobantePage;
import com.praxis.ejem.test.pages.main.emision.PersonalizarComprobantePage;

public class MainPage extends Page<MainPage>{
	
	@FindBy (how = How.LINK_TEXT, using= "Emisión")
	private WebElement emisionParentNode;
	
	@FindBy (how = How.LINK_TEXT, using= "Generar Comprobante")
	private WebElement generarComprobante;
	
	@FindBy (how = How.LINK_TEXT, using= "Personalizar Comprobante")
	private WebElement personalizarComprobante;
	
	public MainPage(WebDriver driver) {
		super(driver, PAGE_MAIN);
		// TODO Auto-generated constructor stub
	}
	
	public GenerarComprobantePage abrirGenerarComprobante(){
		Actions actions = new Actions(driver);
		actions.moveToElement(emisionParentNode).perform();
		actions.moveToElement(generarComprobante).click().perform();
		return new GenerarComprobantePage(driver).loadPage();
	}
	
	public PersonalizarComprobantePage abrirPersonalizarComprobante(){
		Actions actions = new Actions(driver);
		actions.moveToElement(emisionParentNode).perform();
		actions.moveToElement(personalizarComprobante).click().perform();
		return new PersonalizarComprobantePage(driver).loadPage();
	}
}