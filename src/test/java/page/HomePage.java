package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

import static org.junit.Assert.assertTrue;

public class HomePage {

    private static By productImage = By.cssSelector("img.card-img-top.img-fluid");
    private static By nextbutton = By.id("next2");

    public static By getProductTitleLocatorById(String productId, String expectedTitle) {
        return By.xpath("//a[contains(@href, 'prod.html?idp_=" + productId + "') and contains(text(), '" + expectedTitle + "')]");
    }
    private static By getProductPriceLocator(String expectedPrice, String expectedTitle) {
        return By.xpath("//h4[contains(@class, 'card-title')]/a[text()='"+ expectedTitle+"']/ancestor::div[contains(@class, 'card-block')]/h5[contains(text(), '"+ expectedPrice+"')]");
    }

    public static Dimension getElementSize(WebDriver driver, By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return element.getSize();
    }


    public static boolean isTitleAndPriceTextEqual(WebDriver driver, String productId, String expectedTitle, String expectedPrice) {

        By productTitleLocator = getProductTitleLocatorById(productId, expectedTitle);
        By productPriceLocator = getProductPriceLocator(expectedPrice, expectedTitle);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement titleElement = wait.until(ExpectedConditions.visibilityOfElementLocated(productTitleLocator));
        String actualTitle = titleElement.getText();


        WebElement priceElement = wait.until(ExpectedConditions.visibilityOfElementLocated(productPriceLocator));
        String actualPrice = priceElement.getText();


        return actualTitle.equals(expectedTitle) && actualPrice.equals(expectedPrice);
    }

    public static void ClickNext(WebDriver driver, String nextProduct, String nextProductPrice) {
        driver.findElement(nextbutton).click();


        String expectedTitle = nextProduct;
        String expectedPrice = nextProductPrice;


        By productTitleLocator = getProductPriceLocator(expectedPrice, expectedTitle);


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement productTitleElement = wait.until(ExpectedConditions.visibilityOfElementLocated(productTitleLocator));


        assertTrue(productTitleElement.getText().equals(expectedTitle));
    }


    public static Dimension getProductImageSize(WebDriver driver) {
        return getElementSize(driver, productImage);
    }
}
