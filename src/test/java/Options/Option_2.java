package Options;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class Option_2 {
    @Step("Проверяем наличие поля fio")
    public Option_2 fio_is_enabled(){
        $(byXpath("//input[@name='fio']")).shouldBe(enabled);
        return this;
    }
    @Step("Проверяем наличие поля phone")
    public Option_2 phone_is_enabled(){
        $(byXpath("//input[@name='phone']")).shouldBe(enabled);
        return this;
    }
    @Step("Проверяем наличие поля email")
    public Option_2 email_is_enabled(){
        $(byXpath("//input[@name='email']")).shouldBe(enabled);
        return this;
    }
    @Step("Проверяем наличие поля date")
    public Option_2 date_is_enabled(){
        $(byXpath("//input[@name='dateError']")).shouldBe(enabled);
        return this;
    }
    @Step("Проверяем наличие поля screenshot")
    public Option_2 screenshot_is_enabled(){
        $(byXpath("//img[@alt='Скриншот / фото экрана с ошибкой']")).shouldBe(enabled);
        return this;
    }
    @Step("Проверяем наличие поля os")
    public Option_2 os_is_enabled(){
        $(byXpath("//input[@name='os']")).shouldBe(enabled);
        return this;
    }
    @Step("Проверяем наличие поля url")
    public Option_2 url_is_enabled(){
        $(byXpath("//input[@name='url']")).shouldBe(enabled);
        return this;
    }
}
