package com.bridgelabz.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class post_Linkedin extends login_Linkedin{
    @FindBy(xpath = "//*[@id=\"main\"]/div[1]/div/div[1]/button")
    WebElement postButton;

    @FindBy(xpath = "//div[@class = 'ql-editor ql-blank']")
    WebElement Enter;

    @FindBy(xpath = "//button[starts-with(@class, 'share-action')]")
    WebElement Post;


    public post_Linkedin(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void uploaded() throws InterruptedException {
        postButton.click();
        Enter.sendKeys("https://en.wikipedia.org/wiki/Automation");
        Thread.sleep(2000);
        Post.click();
    }
}
