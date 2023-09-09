package core;

import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class BaseSelenideClass {

    public void setUp(){
        WebDriverManager.chromedriver().setup();
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.headless = true;
        Configuration.timeout = 60000;

    }

    @BeforeEach
    public void init(){
        setUp();
    }

    @AfterEach
    public void tearDown(){

    }

}
