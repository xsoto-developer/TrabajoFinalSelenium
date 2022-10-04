package PrincipalMart;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.boliviamart.*;

import java.util.concurrent.TimeUnit;

public class BusquedaMartTest extends BaseTest  {

    @Test
    public void testSelectProducto() throws InterruptedException {

        String expectedSearchName = "boliviamart";
        String expectedProductName = "laptop";

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
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        DetalleProductoPage detalleProductoPage = new DetalleProductoPage(webDriver);
//      Assert.assertTrue(detalleProductoPage.isDescriptionProductDisplayed());
//        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        detalleProductoPage.clickAniadirCarritoButton();
        webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        CarritoComprasPage carritoComprasPage = new CarritoComprasPage(webDriver);
        carritoComprasPage.clickVerCarritoButton();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        PagoPage pagoPage = new PagoPage(webDriver);
        pagoPage.clickPagoButton();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        FacturacionPage facturacionPage = new FacturacionPage(webDriver);
        Assert.assertTrue(facturacionPage.isDetalleFacturacionDisplayed());

    }
}
