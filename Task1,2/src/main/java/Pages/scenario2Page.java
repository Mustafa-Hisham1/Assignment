package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class scenario2Page extends base{
    private final By changeLanguageButtonLocator = By.id("icp-nav-flyout");
    private final By englishLanguageLocator = By.xpath("//div[@class=\"a-row a-spacing-mini\"]//input[@value=\"en_AE\"]");
    private final By saveChangesButtonLocator = By.className("a-button-input");
    private final By todayDealsButtonLocator = By.xpath("//div[@id=\"nav-xshop-container\"]//a[@class=\"nav-a  \"][1]");
    private final By seeMoreLocator = By.xpath("//a[@aria-labelledby=\"see-more-departments-label\"]");
    private final By groceryDepartmentLocator = By.xpath("//div[@data-csa-c-element-id=\"filter-departments-Grocery\"]//i");
    //private final By groceryDepartmentLocator = By.xpath("//div[@data-csa-c-element-id=\"filter-departments-السوبر ماركت\"]");
    // private final By tenPercentageOffLocator = By.xpath("//div[@data-csa-c-id=\"t10bur-ins12c-z8bc8b-606u6q\"]");
    private final By tenPercentageOffLocator = By.xpath("//div[@data-csa-c-element-id=\"filter-percentOff-10% off or more\"]");
    private final By productLocator = By.xpath("//div[@data-test-index=\"126\"]");
    private final By addToCartButtonLocator = By.id("add-to-cart-button");

    public scenario2Page(WebDriver driver) {
        super(driver);
    }

    public void goToTodayDeals() throws InterruptedException {
        click(todayDealsButtonLocator);
         Thread.sleep(5000);
    }

    public void filter() throws InterruptedException {
        click(seeMoreLocator);
        click(groceryDepartmentLocator);
        Thread.sleep(2000);
        click(tenPercentageOffLocator);
    }
    public void scrollDown() throws InterruptedException {

        for (int i = 0; i <= 4; i++) {
            scrollDownBy(1500);
            Thread.sleep(3000);

        }
    }
    public void addProductToCart() {
            click(productLocator);
            click(addToCartButtonLocator);

        }
    }

