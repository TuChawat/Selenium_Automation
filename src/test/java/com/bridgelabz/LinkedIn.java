package com.bridgelabz;


import com.bridgelabz.Base.Base;
import com.bridgelabz.Pages.login_Linkedin;
import com.bridgelabz.Pages.post_Linkedin;
import org.testng.annotations.Test;

public class LinkedIn extends Base {
    public login_Linkedin login;
    public post_Linkedin post;

    @Test
    public void login_Linkedin() throws InterruptedException {
        login = new login_Linkedin(driver);
        login.loggedin();
    }

    @Test
    public void post_Linkedin() throws InterruptedException {
        post = new post_Linkedin(driver);
        post.uploaded();
    }
}
