package tests;

import Pages.*;
import org.testng.annotations.Test;

public class test extends testBase{
    testPage test;
    @Test
    public void test() throws InterruptedException {

        test = new testPage(driver);
        test.goToTodayOffer();
        test.filter();
        test.scrollDown();
        test.addProductToCart();
    }
}
