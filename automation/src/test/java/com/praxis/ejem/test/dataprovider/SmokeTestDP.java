package com.praxis.ejem.test.dataprovider;
import org.testng.annotations.DataProvider;
import static com.praxis.ejem.test.dataprovider.DataProviderReferencesConstants.*;

public class SmokeTestDP {

	@DataProvider(name = SIGNON)
	public static Object [][] signonProvider(){
		return new Object[][] {
				{"demotst@praxis.com.mx.8", "123456"}
		};
	}

	@DataProvider(name = "EMISION_GENERAR_COMPROBANTE")
	public static Object [][] signonForRentabilidad(){
		
		return new Object[][] {
			{"2935","1752","155","50110","MXN", "No identificado","16","16", "1","1", "prueba aut 1"}
		};
	}
	
	@DataProvider(name = "EMISION_PERSONALIZAR_COMPROBANTE")
	public static Object [][] signonForRentabilidad1(){
		
		return new Object[][] {
			{"2935","Plantilla2_ComprobanteCFDI"}
		};
	}
}
