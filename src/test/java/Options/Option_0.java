package Options;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class Option_0 {

    @Step("Проверяем, что поле fio не активно")
    public Option_0 fio_is_disabled(){
        $(byXpath("//input[@name='fio']")).shouldNotBe(enabled);
        return this;
    }
    @Step("Проверяем, что поле  phone не активно")
    public Option_0 phone_is_disabled(){
        $(byXpath("//input[@name='phone']")).shouldNotBe(enabled);
        return this;
    }
    @Step("Проверяем, что поле  email не активно")
    public Option_0 email_is_disabled(){
        $(byXpath("//input[@name='email']")).shouldNotBe(enabled);
        return this;
    }

    @Step("Проверяем, что поле  message не активно")
    public Option_0 message_is_disabled(){
        $(byXpath("//textarea[@name='message']")).shouldNotBe(enabled);
        return this;
    }

}
