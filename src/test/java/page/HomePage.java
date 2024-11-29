package page;

import io.cucumber.messages.types.Product;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;



public class HomePage {

    private static By nextbutton = By.id("next2");
    private  static By PhoneCat = By.xpath("//a[@onclick=\"byCat('phone')\"]");


    public static By getProductTitleLocatorById(String productId, String expectedTitle) {
        return By.xpath("//a[contains(@href, 'prod.html?idp_=" + productId + "') and contains(text(), '" + expectedTitle + "')]");
    }
    private static By getProductPriceLocator(String expectedPrice, String productId) {
        return By.xpath("//a[contains(@href, 'prod.html?idp_=" + productId + "')]/following::h5[contains(text(), '" + expectedPrice + "')]");
    }


    public static Dimension getElementSize(WebDriver driver, By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return element.getSize();
    }


    public static boolean isTitleAndPriceTextEqual(WebDriver driver, String productId, String expectedTitle, String expectedPrice) {

        By productTitleLocator = getProductTitleLocatorById(productId, expectedTitle);
        By productPriceLocator = getProductPriceLocator(expectedPrice, productId);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement titleElement = wait.until(ExpectedConditions.visibilityOfElementLocated(productTitleLocator));
        String actualTitle = titleElement.getText();


        WebElement priceElement = wait.until(ExpectedConditions.visibilityOfElementLocated(productPriceLocator));
        String actualPrice = priceElement.getText();


        return actualTitle.equals(expectedTitle) && actualPrice.equals(expectedPrice);
    }

    public static void ClickNext(WebDriver driver, String nextProductID, String nextProductTitle) throws InterruptedException {

        driver.findElement(nextbutton).click();


        Thread.sleep(3000);


        By productTitleLocator = getProductTitleLocatorById(nextProductID, nextProductTitle);


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement productTitleElement = wait.until(ExpectedConditions.visibilityOfElementLocated(productTitleLocator));


        Assert.assertEquals("Expected product title did not match", productTitleElement.getText(), nextProductTitle);
    }


    public static void clickPhoneCategory(WebDriver driver)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement PhonCat = wait.until(ExpectedConditions.visibilityOfElementLocated(PhoneCat));

        Assert.assertTrue(PhonCat.isEnabled() && PhonCat.isDisplayed());
        PhonCat.click();

    }



}
