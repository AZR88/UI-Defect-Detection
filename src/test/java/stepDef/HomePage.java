package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.Dimension;

import static Helper.WebHelper.driver;
import static org.junit.Assert.assertTrue;

public class HomePage {
    @Given("user is on homepage")
    public void userIsOnHomepage() {
        driver.get("https://www.demoblaze.com/");
    }


    @When("Check picture Size")
    public void checkPictureSize() {
        Dimension imageSize = page.HomePage.getProductImageSize(driver);
        int width = imageSize.getWidth();
        int height = imageSize.getHeight();

        System.out.println("Lebar gambar produk: " + width + "px");
        System.out.println("Tinggi gambar produk: " + height + "px");
    }


    @And("check title is equals to {string}")
    public void checkTitleIsEqualsTo(String expectedTitle) {
        boolean isTitleCorrect = page.HomePage.isTitleTextEqual(driver, expectedTitle);
        assertTrue("Title tidak sesuai dengan yang diharapkan!", isTitleCorrect);
    }

    @And("check product prize is {string}")
    public void checkProductPrizeIs(String expectedTitle) { boolean isTitleCorrect = page.HomePage.isPriceTextEqual(driver, expectedTitle);
        assertTrue("Title tidak sesuai dengan yang diharapkan!", isTitleCorrect);
    }
}
