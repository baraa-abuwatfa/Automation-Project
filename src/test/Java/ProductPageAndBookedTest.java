import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class ProductPageAndBookedTest {
    BaseTest baseTest = new BaseTest();
    public static ChromeDriver driver;

    @BeforeClass
    public void setUp() {
        driver = baseTest.setUp("https://www.worldmarket.com/category/gifts/all.do");
    }

    @Test(priority = 1)
    public void verifyThatFurniturelinkIsDisplayed() {
        WebElement Furniturelink = BaseTest.driver.findElement(By.xpath("//*[@id='ml-accessible-megamenu-furniture-1']"));
        assertTrue(Furniturelink.isDisplayed());
    }

    @Test(priority = 2)
    public void verifyThatClickOnFurniturelink() {
        WebElement Furniturelink = BaseTest.driver.findElement(By.xpath("//*[@id='ml-accessible-megamenu-furniture-1']"));
        Furniturelink.click();

    }
    @Test(priority = 3)
    public void verifyThatClickOnOfficeDeskinkInTheList() {
        WebElement OfficeDeskink = BaseTest.driver.findElement(By.xpath("//*[@id='ml-accessible-megamenu-furniture-sub']/li[3]/ul/li[2]/ul/li[1]/a"));
        assertTrue(OfficeDeskink.isDisplayed());
        OfficeDeskink.click();
    }
    //*[@id="ml-body-container"]/main/div[3]/div/div/div/div[3]/h1
    @Test(priority =4 )
    public void verifyThatOfficeDeskPageIsDisplayed() {
        WebElement OfficeDeskItem = BaseTest.driver.findElement(By.xpath("//*[@id='ml-body-container']/main/div[3]/div/div/div/div[3]/h1"));
        assertTrue(OfficeDeskItem.isDisplayed());

    }
    //*[@id="ml-grid-view-items"]/div[1]/div/div[1]/div[2]/div/a
    @Test(priority = 5)
    public void verifyThatClickOnProduct() {

        WebElement Product = BaseTest.driver.findElement(By.xpath("//*[@id='ml-grid-view-items']/div[1]/div/div[1]/div[2]/div/a"));
        assertTrue(Product.isDisplayed());
        Product.click();
    }
    //*[@id="addToBasket112680"]
    @Test(priority = 6)
    public void verifyThatAddProductToTheCart() {

        WebElement AddProductToTheCart = BaseTest.driver.findElement(By.id("addToBasket112680"));
        assertTrue(AddProductToTheCart.isDisplayed());

        AddProductToTheCart.click();
    }
}

