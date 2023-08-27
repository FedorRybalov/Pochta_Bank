package Options;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.value;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class Option_13 {
    @Step("Вводим имя")
    public Option_13 send_data_to_fio(String data){
        $(byXpath("//input[@name='fio']")).click();
        $(byXpath("//input[@name='fio']")).val(data);
        return this;
    }
    @Step("Проверяем правильность введённых данных в поле ФИО")
    public Option_13 fio_check(String data){
        $(byXpath("//input[@name='fio']")).shouldHave(value(data));
        return this;
    }
    @Step("Вводим адрес")
    public Option_13 send_data_to_address(String data){
        $(byXpath("//input[@name='address']")).click();
        $(byXpath("//input[@name='address']")).val(data);
        return this;
    }
    @Step("Проверяем правильность введённых данных в поле Адрес")
    public Option_13 address_check(String data){
        $(byXpath("//input[@name='address']")).shouldHave(value(data));
        return this;
    }
    @Step("Вводим телефон")
    public Option_13 send_data_to_phone(String data){
        $(byName("phone")).click();
        $(byName("phone")).val(data);
//        SelenideElement input = $(byName("phone"));
//        JavascriptExecutor executor = (JavascriptExecutor) getWebDriver();
//        executor.executeScript("arguments[0].value='+7 (000) 000-00-00';", input);
//        $(byName("phone")).click();
//        $(byName("phone")).setValue("+7 (353) 253-25-12");
        return this;
    }
    @Step("Проверяем правильность введённых данных в поле Телефон")
    public Option_13 phone_check(String data){
        $(byName("phone")).shouldHave(value(data));
        return this;
    }
    @Step("Вводим мэйл")
    public Option_13 send_data_to_email(String data){
        $(byXpath("//input[@name='email']")).click();
        $(byXpath("//input[@name='email']")).val(data);
        return this;
    }
    @Step("Проверяем правильность введённых данных в поле Email")
    public Option_13 email_check(String data){
        $(byXpath("//input[@name='email']")).shouldHave(value(data));
        return this;
    }
    @Step("Вводим галочку")
    public Option_13 checkbox(){
        $(".style_checkmark___GZe2").shouldBe(enabled).click();
        return this;
    }
    @Step("Отправляем данные")
    public Option_13 send_feedback(){
        $(".style_btnBlue__elfaw").shouldBe(enabled).click();
        sleep(5000);
        return this;
    }
}
