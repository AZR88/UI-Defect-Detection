package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class HomePage {

    public static By productImage = By.cssSelector("img.card-img-top.img-fluid");
    public static By productPrice = By.xpath("//div[@class='card-block']/h5");
    public static By productDescription = By.xpath("//p[@id='article']");

    // Metode untuk mendapatkan locator dinamis berdasarkan ID produk
    public static By getProductTitleLocatorById(String productId, String expectedTitle) {
        return By.xpath("//a[@href='prod.html?idp_=" + productId + "' and text()='" + expectedTitle + "']");
    }
    public static By getProductPriceLocator(String expectedPrice) {
        return By.xpath("//h5[text()='" + expectedPrice + "']");
    }




    // Metode untuk mendapatkan ukuran (size) elemen
    public static Dimension getElementSize(WebDriver driver, By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return element.getSize();
    }

    // Metode untuk membandingkan teks dari elemen title
    public static boolean isTitleAndPriceTextEqual(WebDriver driver, String productId, String expectedTitle, String expectedPrice) {
        // Dapatkan locator untuk judul produk
        By productTitleLocator = getProductTitleLocatorById(productId, expectedTitle);
        // Dapatkan locator untuk harga produk
        By productPriceLocator = getProductPriceLocator(expectedPrice);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


        WebElement titleElement = wait.until(ExpectedConditions.visibilityOfElementLocated(productTitleLocator));
        String actualTitle = titleElement.getText();


        WebElement priceElement = wait.until(ExpectedConditions.visibilityOfElementLocated(productPriceLocator));
        String actualPrice = priceElement.getText();


        return actualTitle.equals(expectedTitle) && actualPrice.equals(expectedPrice);
    }




    public static boolean isPriceTextEqual(WebDriver driver, String expectedText) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement titleElement = wait.until(ExpectedConditions.visibilityOfElementLocated(productPrice));
        String actualText = titleElement.getText();
        return actualText.equals(expectedText);
    }

    public static boolean isDescTextEqual(WebDriver driver, String expectedText) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement titleElement = wait.until(ExpectedConditions.visibilityOfElementLocated(productDescription));
        String actualText = titleElement.getText();
        return actualText.equals(expectedText);
    }

    public static Dimension getProductImageSize(WebDriver driver) {
        return getElementSize(driver, productImage);
    }
}
