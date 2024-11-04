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
    public static By productTitle = By.xpath("//h4[@class='card-title']/a");
    public static By productPrice = By.xpath("//div[@class='card-block']/h5");
    public static By productDescription = By.xpath("//p[@id='article']");

    // Metode untuk mendapatkan ukuran (size) elemen
    public static Dimension getElementSize(WebDriver driver, By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return element.getSize();
    }

    // Metode untuk membandingkan teks dari elemen title
    public static boolean isTitleTextEqual(WebDriver driver, String expectedText) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement titleElement = wait.until(ExpectedConditions.visibilityOfElementLocated(productTitle));
        String actualText = titleElement.getText();
        return actualText.equals(expectedText);
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


    public static Dimension getProductTitleSize(WebDriver driver) {
        return getElementSize(driver, productTitle);
    }
}
