import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class HomePageTest{
    Setup baseTest= new Setup();


    @Test(priority = 1)
    public void verifyThatHomeScreenIsOpenedSuccessfully() {
        //*[@id="cpwm-additionaldisclaimer3"]/button
        //ازالة الاعلان الظاهر
        WebElement additionaldiscbutton = Setup.driver.findElement(By.xpath("//*[@id='cpwm-additionaldisclaimer3']/button"));

       additionaldiscbutton.click();
       //البحث عن سكشن بالصفحة
        WebElement MainDiv = Setup.driver.findElement(By.xpath("//*[@id='home_topnav_layout_15_fillslot-1']"));

        assertTrue(MainDiv.isDisplayed());
    }

    @Test (priority = 2)
    public void verifyThatFurniturelinkIsDisplayed() {
        WebElement Furniturelink = Setup.driver.findElement(By.xpath("//*[@id='ml-accessible-megamenu-furniture-1']"));
        assertTrue(Furniturelink.isDisplayed());
    }
    @Test (priority = 3)
    public void verifyThatClickOnFurniturelink() {
        WebElement Furniturelink = Setup.driver.findElement(By.xpath("//*[@id='ml-accessible-megamenu-furniture-1']"));
        Furniturelink.click();
    }
    @Test(priority = 4)
    public void verifyThatClickOnShopAllFurniturelinkInTheList() {
        WebElement ShopAllFurniturelink = Setup.driver.findElement(By.xpath("//*[@id='ml-accessible-megamenu-furniture-sub']/li[1]/ul/li[2]/a"));
        assertTrue(ShopAllFurniturelink.isDisplayed());
        ShopAllFurniturelink.click();
    }
//h1[@class='wm-header']
    @Test(priority = 5)
    public void verifyThatShopAllFurniturePageIsDisplayed(){
    WebElement ShopAllFurnitureText = Setup.driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div/div/div[3]/h1]"));
    assertTrue(ShopAllFurnitureText.isDisplayed());
    }
}