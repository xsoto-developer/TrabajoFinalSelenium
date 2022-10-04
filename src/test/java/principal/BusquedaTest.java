package principal;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.falabella.*;

import java.util.concurrent.TimeUnit;

public class BusquedaTest extends BaseTest  {

    @Test
    public void testPrincipalPage(){
        PrincipalPage principalPage = new PrincipalPage(webDriver);
//        principalPage.search("TV");
        principalPage.search("Consola Sony PS5 Digital 825GB");
//        boolean res = loginPage.errorIsVisible();
        Assert.assertTrue(new ProductoPage(webDriver).isPageDisplayed());
    }

    @Test
    public void testGooglePage() throws InterruptedException {
        GooglePage  googlePage = new GooglePage(webDriver);
        googlePage.typeSearchName("Falabella Colombia");
        Thread.sleep(3000);
        googlePage.clickSelectFirstLink();
        webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Test
    public void testSelectProducto() throws InterruptedException {

        String  expectedDepartamento = "ATLANTICO";
        String  expectedCiudad = "GALAPA";
        String  expectedBarrio = "GALAPA";
        String expectedDireccion = "Av. Direccion Prueba 123";
        String expectedApartamento = "18 PA C la Florida";
        String expectedGiftCardNumber = "160023400567890";
        String expectedGiftCardNumberCode = "WSQ12AB34CD";
        String expectedSearchName = "Falabella Colombia";
        String expectedProductName = "Consola Sony PS5 Digital 825GB";

        GooglePage  googlePage = new GooglePage(webDriver);
        googlePage.typeSearchName(expectedSearchName);
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        googlePage.clickSelectFirstLink();
        webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        PrincipalPage principalPage = new PrincipalPage(webDriver);
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        principalPage.search(expectedProductName);
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        ProductoPage productoPage = new ProductoPage(webDriver);
//      Assert.assertTrue(productoPage.isPageDisplayed());
        productoPage.clickProductButton();

        DetalleProductoPage detalleProductoPage = new DetalleProductoPage(webDriver);
//      Assert.assertTrue(detalleProductoPage.isDescriptionProductDisplayed());
        detalleProductoPage.clickAgregarBolsaButton();
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        BolsaComprasPage bolsaComprasPage = new BolsaComprasPage(webDriver);
//      Assert.assertTrue(bolsaComprasPage.isBolsaComprasDisplayed());
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        bolsaComprasPage.clickListGarantiaButton();
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        bolsaComprasPage.clickSelectGaratiaButton();
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//      Assert.assertTrue(bolsaComprasPage.isGarantiaButtonSelectedDisplayed());
        bolsaComprasPage.clickVerBolsaComprasButton();
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        DetalleBolsaComprasPage detalleBolsaComprasPage = new DetalleBolsaComprasPage(webDriver);
//      Assert.assertTrue(detalleBolsaComprasPage.isVerBolsaComprasDisplayed());
        detalleBolsaComprasPage.clickIrAComprarButton();
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        OpcionesDespachoPage opcionesDespachoPage = new OpcionesDespachoPage(webDriver);
//      Assert.assertTrue(opcionesDespachoPage.isOpcionesDespachoTextDisplayed());
        opcionesDespachoPage.selectDepartamentoDespacho(expectedDepartamento);
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        opcionesDespachoPage.selectCiudadDespacho(expectedCiudad);
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        opcionesDespachoPage.selectBarrioDespacho(expectedBarrio);
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        opcionesDespachoPage.clickContinuarDespachoButton();
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        DespachoDomicilioPage despachoDomicilioPage = new DespachoDomicilioPage(webDriver);
//      Assert.assertTrue(despachoDomicilioPage.isOpcionesDespachoDomicilioTextDisplayed());
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        despachoDomicilioPage.typeDireccion(expectedDireccion);
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        despachoDomicilioPage.typeApartamento(expectedApartamento);
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        despachoDomicilioPage.clickIngresarDireccionButton();
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        DetalleDespachoDomicilioPage detalleDespachoDomicilioPage = new DetalleDespachoDomicilioPage(webDriver);
//      Assert.assertTrue(detalleDespachoDomicilioPage.isIrAPagarDisplayed());
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        detalleDespachoDomicilioPage.clickcontinuarButton();
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


        MedioPagoPage medioPagoPage = new MedioPagoPage(webDriver);
//      Assert.assertTrue(medioPagoPage.isMedioPagoDisplayed());
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        medioPagoPage.clickGiftCardButton();
        webDriver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        medioPagoPage.typeGiftCardNumber(expectedGiftCardNumber);
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        medioPagoPage.typeGiftCardSecurityCode(expectedGiftCardNumberCode);
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        medioPagoPage.clickAgregarButton();
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        GiftcardMessagePage giftcardMessagePage = new GiftcardMessagePage(webDriver);
        Assert.assertTrue(giftcardMessagePage.isGiftcardTextDisplayed());
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }
}
