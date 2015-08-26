package com.praxis.ejem.test.smoke;

import static com.praxis.ejem.test.pages.constants.GroupsConstants.SIGNON;
import static com.praxis.ejem.test.pages.constants.GroupsConstants.SMOKE;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.praxis.ejem.test.WebDriverSetup;
import com.praxis.ejem.test.dataprovider.SmokeTestDP;
import com.praxis.ejem.test.pages.main.LogInPage;
import com.praxis.ejem.test.pages.main.MainPage;
import com.praxis.ejem.test.pages.main.emision.GenerarComprobantePage;
import com.praxis.ejem.test.pages.main.emision.PersonalizarComprobantePage;

public class SimpleSmokeTest extends WebDriverSetup {

	@Test(enabled = true, priority = 1, groups = { SMOKE,
			SIGNON }, dataProviderClass = SmokeTestDP.class, dataProvider = SIGNON)
	public void signOn(String userName, String password) {
		LogInPage logInPage = new LogInPage(driver).refreshPage();
		Assert.assertNotNull(logInPage);

		MainPage mainPage = logInPage.signon(userName, password);
		Assert.assertNotNull(mainPage);
		System.out.println("funciona");
	}

	@Test(enabled = true, priority = 2, groups = { "SMOKE", "EMISION" } )
	public void casoGenerarComprobante() {
		MainPage mainPage = new MainPage(driver).loadPage();
		GenerarComprobantePage generarComprobantePage = mainPage.abrirGenerarComprobante();
		Assert.assertNotNull(generarComprobantePage);
		String respuesta = generarComprobantePage.generarComprobante();
		Assert.assertEquals(respuesta, GenerarComprobantePage.SUCCESS);
		System.out.println("si paso");

	}
	
	@Test(enabled = true, priority = 2, groups = { "SMOKE", "PERSONALIZAR" } )
	public void casoPersonalizarComprobante() {
		MainPage mainPage = new MainPage(driver).refreshPage();
		PersonalizarComprobantePage personalizarComprobantePage = mainPage.abrirPersonalizarComprobante();
		Assert.assertNotNull(personalizarComprobantePage);
		String respuesta = personalizarComprobantePage.personalizarComprobante();
		Assert.assertEquals(respuesta, PersonalizarComprobantePage.SUCCESS);
		System.out.println("si paso");

	}
}
