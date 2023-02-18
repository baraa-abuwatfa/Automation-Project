import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class HomePageAndOpenFearniturePageTest {
    BaseTest baseTest = new BaseTest();
    public static ChromeDriver driver;

    @BeforeClass
    public void setUp() {
        driver = baseTest.setUp("https://www.worldmarket.com/category/gifts/all.do");
    }

    @Test(priority = 1)
    public void verifyThatHomeScreenIsOpenedSuccessfully() {
        //*[@id="cpwm-additionaldisclaimer3"]/button
        //ازالة الاعلان الظاهر
        WebElement additionaldiscbutton = BaseTest.driver.findElement(By.xpath("//*[@id='cpwm-additionaldisclaimer3']/button"));
        BaseTest.driver.manage().deleteAllCookies();
        additionaldiscbutton.click();

       //البحث عن سكشن بالصفحة
        WebElement MainDiv = BaseTest.driver.findElement(By.xpath("//*[@id='home_topnav_layout_15_fillslot-1']"));
        assertTrue(MainDiv.isDisplayed());
    }

    @Test (priority = 2)
    public void verifyThatFurniturelinkIsDisplayed() {
        WebElement Furniturelink = BaseTest.driver.findElement(By.xpath("//*[@id='ml-accessible-megamenu-furniture-1']"));
        assertTrue(Furniturelink.isDisplayed());
    }
    @Test (priority = 3)
    public void verifyThatClickOnFurniturelink() {
        WebElement Furniturelink = BaseTest.driver.findElement(By.xpath("//*[@id='ml-accessible-megamenu-furniture-1']"));
        BaseTest.driver.manage().deleteAllCookies();
        Furniturelink.click();
    }
    @Test(priority = 4)
    public void verifyThatClickOnShopAllFurniturelinkInTheList() {
        WebElement ShopAllFurniturelink = BaseTest.driver.findElement(By.xpath("//*[@id='ml-accessible-megamenu-furniture-sub']/li[1]/ul/li[2]/a"));
        assertTrue(ShopAllFurniturelink.isDisplayed());
        BaseTest.driver.manage().deleteAllCookies();
        ShopAllFurniturelink.click();

    }



//h1[@class='wm-header']
    @Test(priority = 5)
    public void verifyThatShopAllFurniturePageIsDisplayed(){
    WebElement ShopAllFurnitureText = BaseTest.driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div/div/div[3]/h1]"));
    assertTrue(ShopAllFurnitureText.isDisplayed());
    }
}