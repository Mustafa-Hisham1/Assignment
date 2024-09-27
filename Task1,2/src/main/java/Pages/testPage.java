package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class testPage extends base {
    private final By todayOfferLocator = By.xpath("//div[@id=\"nav-xshop\"]//a[1]");
    private final By seeMoreLocaor = By.xpath("//a[@aria-labelledby=\"see-more-departments-label\"]");
//    private final By groseryLocator = By.xpath("//div[@aria-labelledby=\"departments\"]//span[10]");
private final By groseryLocator = By.xpath("//div[@aria-labelledby=\"departments\"]//div[@data-csa-c-element-id=\"filter-departments-السوبر ماركت\"]");

    private final By tenPercentageLocator = By.xpath("//div[@aria-labelledby=\"percentOff\"]//span[2]");
    private final By productLocator = By.xpath("//div[@data-test-index=\"130\"]");
    private final By addToCardButtonLocator = By.id("add-to-cart-button");

    public testPage(WebDriver driver) {
        super(driver);
    }
    public void goToTodayOffer(){
        click(todayOfferLocator);
    }

    public void filter() throws InterruptedException {
        click(seeMoreLocaor);
        click(groseryLocator);
        Thread.sleep(1500);
        scrollDownBy(1500);
        click(tenPercentageLocator);


    }

    public void scrollDown() throws InterruptedException {

        for (int i = 0; i <= 4; i++) {
            scrollDownBy(1500);
            Thread.sleep(3000);
        }
    }
    public void addProductToCart() {
        click(productLocator);
        click(addToCardButtonLocator);
    }
}
