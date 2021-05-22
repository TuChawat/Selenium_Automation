package com.bridgelabz.Pages;

import com.bridgelabz.Base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_Linkedin extends Base {
    @FindBy(id = "username")
    WebElement username;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(xpath = "//*[@id='organic-div']/form/div[3]/button")
    WebElement clickSignin;

    public login_Linkedin(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public login_Linkedin() {
    }

    public post_Linkedin loggedin(){
        username.sendKeys("tushar1chawat@gmail.com");
        password.sendKeys("Wardha123");
        clickSignin.click();
        return new post_Linkedin(getDriver());
    }
}
