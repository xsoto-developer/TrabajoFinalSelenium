package pages.boliviamart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class ProductoPage extends BasePage {

    // Texto pagina principal del numero de productos encontrados
//    private By resultadoText = By.id("testId-SearchLandingContainer-totalResults");
    private By resultadoText = By.xpath("/html/body/div[1]/section/div/div/div/div[2]/ul/li[3]");
    // Imagen producto pagina principal
//    private By productSelect = By.xpath("//*[@id=\"testId-pod-44721956\"]/div[1]/div[1]/a");

//    private By productSelect = By.id("testId-pod-image-27495254");
    private By productSelect = By.xpath("//*[@id=\"content\"]/div[3]/ul/li[1]/div/div[1]/a");
    //img[@id='testId-pod-image-27495254']
    // Pagina producto - descripcion del producto =  Televisores y Smart tv



    ////// DetalleProductoPage
//    private By descriptionProduct = By.xpath("//*[@id=\"breadcrumb\"]/ol/li[3]/a");

    // Pagina producto - Boton de AGRGAR A LA BOLSA
//        private By agregarBolsaButton = By.xpath("//button[contains(text(),'Agregar a la Bolsa')]");




/** BolsaPage **/
//    // Pagina producto - modal = Detalle del producto agragado a la bolsa
//    private By bolsaCompraModal = By.xpath("//span[contains(text(),'Producto(s) agregado(s) a la bolsa de compras')]");
//    // private By bolsaCompraModal = By.xpath("/html/body/div[1]/div/div/div/div/div/div/div[1]/span/span");
//
//    private By listGarantiaButton = By.xpath("//*[@id=\"__next\"]/div/div/div/div/div/div/div[2]/div/div/div[2]/div/div/div[1]/div/i");
//
//    // pagina producto - modal = Boton de gatantia de 1 año 1 año de Garantía Extendida $ 419.990
//    private By garantiaButton = By.id("testId-InCart-inPDP-WarrantyOption-btn-0");
//    // Option de boton seleccionado
//    private By garantiaButtonSelected = By.xpath("//*[contains(@class, 'option-selected')]");
//    // Boton ver  bolsa de compras
//    //*[@id="__next"]/div/div/div/div/div/div/div[3]/div/div
//    private By verBolsaComprasButton = By.xpath("//*[@id=\"__next\"]/div/div/div/div/div/div/div[3]/div/div");




/** DetalleBolsaComprasPage **/
//    //Detalle bolsa de compras
//    //*[@id="root"]/div[2]/div[1]/div[2]/span[1]
//    private By bolsaComprasText = By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[2]/span[1]");
//
//    // Boton Ir a Comprar
//    private By irAComprarButton = By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[1]/form/div[2]/div[2]/div[2]/button");




    // Formulario de Eleccion de Opciones de Despacho
//    private By opcionesDespachoText = By.xpath("/html/body/div[3]/div[1]/div[1]/h2");
//
//    private By departamentoDespachoSelect= By.xpath("//select[@id=\"region\"]");
//
//    private By ciudadDespachoSelect= By.xpath("//select[@id=\"ciudad\"]");
//
//    private By barrioDespachoSelect= By.xpath("//select[@id=\"comuna\"]");
//
//    private By continuarDespachoButton = By.xpath("//*[@id=\"fbra_checkoutRegionAndComuna\"]/div/section/section/form/div/div[4]/div/button");


/** DespachoDomicilioPage **/
//    private By opcionesDespachoDomicilioText = By.xpath("/html/body/div[3]/div[1]/div[1]/h2");
//
////    private By direccionInput = By.id("address");
//    private By direccionInput = By.xpath("//input[@id='address']");
//
////    private By apartamentInput = By.id("departmentNumber");
//    private By apartamentInput = By.xpath("//input[@id='departmentNumber']");
//
//    private By ingresarDireccionButton = By.xpath("//*[@id=\"fbra_checkoutDeliverAndCollect\"]/div/div/div[1]/div/div[2]/div/div/form/section/div/div[4]/button");


/**DetalleDespachoDomicilioPage**/
//    private By irPagarText = By.xpath(" //*[@id=\"fbra_checkoutDeliveryActions\"]/div/div/span/div/div/div/div[1]/h1");

//    private By continuarButton = By.xpath("//*[@id=\"fbra_checkoutDeliveryActions\"]/div/div/span/div/div/div/div[2]/button");


/** MedioPagoPage **/

//    private By medioPagoText = By.xpath("/html/body/div[3]/div[1]/div[1]/h2");
////    private By giftCardButton = By.xpath("//*[@id=\"fbra_checkoutAddGiftCard\"]/div/div");
////    private By giftCardButton = By.xpath("//*[@id=\"fbra_checkoutAddGiftCard\"]/div/div/div/a");
//    private By giftCardButton = By.xpath("//body/div[3]/div[1]/div[4]/div[1]/div[1]/div[1]/a[1]");
//
//    private By giftCardNumber = By.id("giftCardNumber");
////    private By giftCardNumber = By.xpath("//input[@id='giftCardNumber']");
//
//    private By giftCardSecurityCode = By.id("giftCardSecurityCode");
////    private By giftCardSecurityCode = By.id("//input[@id='giftCardSecurityCode']");
//
//    private By agregarButton = By.xpath("//button[contains(text(),'AGREGAR')]");


/** GiftcardMessagePage **/
////    private By giftcardText = By.xpath("//p[contains(text(),'Giftcard')]");
//    private By giftcardText = By.xpath("//*[@id=\"fbra_notifications\"]/div/div/div/div/section");



    public ProductoPage(WebDriver webDriver) {
        super(webDriver);
    }

    public boolean isPageDisplayed(){
        WebElement element = webDriver.findElement(resultadoText);
        return element.isDisplayed();
    }

//    public boolean isProductPageDisplayed(){
//        WebElement element = webDriver.findElement(productSelect);
//        return element.isDisplayed();
//    }

    public ProductoPage clickProductButton(){
        WebElement element = webDriver.findElement(productSelect);
        element.click();
        return new ProductoPage(webDriver);
    }

    //DetalleProductoPage

//    public boolean isDescriptionProductDisplayed(){
//        WebElement element = webDriver.findElement(descriptionProduct);
//        return element.isDisplayed();
//    }
//
//    public ProductoPage clickAgregarBolsaButton(){
//        WebElement element = webDriver.findElement(agregarBolsaButton);
//        element.click();
//        return new ProductoPage(webDriver);
//    }


    /** Bolsa Page **/
//    public boolean isBolsaComprasDisplayed(){
//        WebElement element = webDriver.findElement(bolsaCompraModal);
//        return element.isDisplayed();
//    }
//
//    public ProductoPage clickListGarantiaButton(){
//        WebElement element = webDriver.findElement(listGarantiaButton);
//        element.click();
//        return new ProductoPage(webDriver);
//    }
//
//    public ProductoPage clickSelectGaratiaButton(){
//        WebElement element = webDriver.findElement(garantiaButton);
//        element.click();
//        return new ProductoPage(webDriver);
//    }
//
//    public boolean isGarantiaButtonSelectedDisplayed(){
//        WebElement element = webDriver.findElement(garantiaButtonSelected);
//        return element.isDisplayed();
//    }
//
//    public ProductoPage clickVerBolsaComprasButton(){
//        WebElement element = webDriver.findElement(verBolsaComprasButton);
//        element.click();
//        return new ProductoPage(webDriver);
//    }

    /** DetalleBolsaComprasPage **/
//    public boolean isVerBolsaComprasDisplayed(){
//        WebElement element = webDriver.findElement(bolsaComprasText);
//        return element.isDisplayed();
//    }
//
//    public ProductoPage clickIrAComprarButton(){
//        WebElement element = webDriver.findElement(irAComprarButton);
//        element.click();
//        return new ProductoPage(webDriver);
//    }

/** OpcionesDespachoPage **/
//    public boolean isOpcionesDespachoTextDisplayed(){
//        WebElement element = webDriver.findElement(opcionesDespachoText);
//        return element.isDisplayed();
//    }
//
//    public void selectDepartamentoDespacho(String name){
//        Select select = new Select(webDriver.findElement(departamentoDespachoSelect));
//        select.selectByVisibleText(name);
//    }
//
//    public void selectCiudadDespacho(String name){
//        Select select = new Select(webDriver.findElement(ciudadDespachoSelect));
//        select.selectByVisibleText(name);
//    }
//
//    public void selectBarrioDespacho(String name){
//        Select select = new Select(webDriver.findElement(barrioDespachoSelect));
//        select.selectByVisibleText(name);
//    }
//
//    public ProductoPage clickContinuarDespachoButton(){
//        WebElement element = webDriver.findElement(continuarDespachoButton);
//        element.click();
//        return new ProductoPage(webDriver);
//    }


/** DespachoDomicilioPage **/
//    public boolean isOpcionesDespachoDomicilioTextDisplayed(){
//        WebElement element = webDriver.findElement(opcionesDespachoDomicilioText);
//        return element.isDisplayed();
//    }
//
//    public void typeDireccion(String direccion){
//        WebElement element = webDriver.findElement(direccionInput);
//        element.sendKeys(direccion);
//    }
//
////    public void typeDireccion(String direccion){
////        WebElement element = webDriver.findElement(direccionInput);
////        element.sendKeys(direccion);
////    }
//
//    public void typeApartamento(String apartamento){
//        WebElement element = webDriver.findElement(apartamentInput);
//        element.sendKeys(apartamento);
//    }
//
//    public ProductoPage clickIngresarDireccionButton(){
//        WebElement element = webDriver.findElement(ingresarDireccionButton);
//        element.click();
//        return new ProductoPage(webDriver);
//    }

/** DetalleespachoDomicilioPage **/
//    public boolean isIrAPagarDisplayed(){
//        WebElement element = webDriver.findElement(irPagarText);
//        return element.isDisplayed();
//    }

//    public ProductoPage clickcontinuarButton(){
//        WebElement element = webDriver.findElement(continuarButton);
//        element.click();
//        return new ProductoPage(webDriver);
//    }

/** MedioPagoPage **/

//    public boolean isMedioPagoDisplayed(){
//        WebElement element = webDriver.findElement(medioPagoText);
//        return element.isDisplayed();
//    }
//
//    public ProductoPage clickGiftCardButton(){
//        WebElement element = webDriver.findElement(giftCardButton);
//        element.click();
//        return new ProductoPage(webDriver);
//    }
//
//    public void typeGiftCardNumber(String giftCardNumero){
//        WebElement element = webDriver.findElement(giftCardNumber);
//        element.sendKeys(giftCardNumero);
//    }
//
//    public void typeGiftCardSecurityCode(String giftCardCode){
//        WebElement element = webDriver.findElement(giftCardSecurityCode);
//        element.sendKeys(giftCardCode);
//    }
//
//    public ProductoPage clickAgregarButton(){
//        WebElement element = webDriver.findElement(agregarButton);
//        element.click();
//        return new ProductoPage(webDriver);
//    }

/*****/
//    public boolean isGiftcardTextDisplayed(){
//        WebElement element = webDriver.findElement(giftcardText);
//        return element.isDisplayed();
//    }

}
