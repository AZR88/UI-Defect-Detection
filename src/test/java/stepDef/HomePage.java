package stepDef;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

import static Helper.WebHelper.driver;
import static org.junit.Assert.assertTrue;

public class HomePage {



    @When("check multiple titles and ids")
    public void checkMultipleTitlesAndIds(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);

        for (Map<String, String> row : data) {
            String productId = row.get("id");
            String expectedTitle = row.get("title");
            String expectedPrice = row.get("price");

            try {
                Thread.sleep(5000); // 5 detik delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            boolean isTitleAndPriceCorrect = page.HomePage.isTitleAndPriceTextEqual(driver, productId, expectedTitle, expectedPrice);


            System.out.println("ID Produk: " + productId);
            System.out.println("Expected Title: " + expectedTitle);
            System.out.println("Expected Price: " + expectedPrice);
            System.out.println("Actual Title and Price: " + (isTitleAndPriceCorrect ? "Sesuai" : "Tidak Sesuai"));

            assertTrue("Title atau Price tidak sesuai untuk produk dengan ID " + productId, isTitleAndPriceCorrect);
        }
    }





    @Given("user is on homepage")
    public void userIsOnHomepage() {
        driver.get("https://www.demoblaze.com/");
    }
}
