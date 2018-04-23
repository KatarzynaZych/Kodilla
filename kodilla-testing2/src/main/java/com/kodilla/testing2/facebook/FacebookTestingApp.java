package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.time.LocalDateTime;

public class FacebookTestingApp {


    public static final String XPATH_SELECT_DAY = "//div[contains(@class, \"58mq\" )]/div/span/span/select[1]";
    public static final String XPATH_SELECT_MONTH = "//div[contains(@class, \"58mq\" )]/div/span/span/select[2]";
    public static final String XPATH_SELECT_YEAR = "//div[contains(@class, \"58mq\" )]/div/span/span/select[3]";

    public static void main(String[] args) {
        System.out.println(LocalDateTime.now().getYear()-31);
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        WebElement selectComboDay = driver.findElement(By.xpath(XPATH_SELECT_DAY));
        Select selectDay = new Select(selectComboDay);
        selectDay.selectByIndex(9);

        WebElement selectComboMonth = driver.findElement(By.xpath(XPATH_SELECT_MONTH));
        Select selectMonth = new Select(selectComboMonth);
        selectMonth.selectByIndex(3);

        WebElement selectComboYear = driver.findElement(By.xpath(XPATH_SELECT_YEAR));
        Select selectYear = new Select(selectComboYear);
        selectYear.selectByIndex(32);
    }
}
