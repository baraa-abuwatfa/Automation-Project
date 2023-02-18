import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class OpenGitsPageTest {


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
    public void verifyThatGiftslinkIsDisplayed() {
        WebElement Giftslink = Setup.driver.findElement(By.xpath("//*[@id='ml-accessible-megamenu-gifts-1']"));
        assertTrue(Giftslink.isDisplayed());
    }
    @Test (priority = 3)
    public void verifyThatClickOnGiftslink() {
        WebElement Giftslink= Setup.driver.findElement(By.xpath("//*[@id='ml-accessible-megamenu-gifts-1']"));
        Giftslink.click();
    }
    @Test(priority = 4)
    public void verifyThatClickOnShopAllGiftslinkInTheList() {
        WebElement ShopAllGiftslink = Setup.driver.findElement(By.xpath("//*[@id='ml-accessible-megamenu-gifts-sub']/li[1]/ul/li[2]/a"));
        assertTrue(ShopAllGiftslink.isDisplayed());
        ShopAllGiftslink.click();

    }



    //h1[@class='wm-header']
    @Test(priority = 5)
    public void verifyThatShopAllFurniturePageIsDisplayed(){
        WebElement ShopAllGiftsText = Setup.driver.findElement(By.xpath("//*[@id='ml-body-container']/main/div[3]/div/div/div/div[3]/h1"));
        assertTrue(ShopAllGiftsText.isDisplayed());
    }
}