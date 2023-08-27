package Options;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.JavascriptExecutor;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.value;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class Option_1 {
    @Step("Вводим имя")
    public Option_1 send_data_to_fio(String data){

        $(byXpath("//input[@name='fio']")).click();
        $(byXpath("//input[@name='fio']")).val(data);
        return this;
    }
    public Option_1 fio_check(String data){
        $(byXpath("//input[@name='fio']")).shouldHave(value(data));
        return this;
    }
    @Step("Вводим телефон")
    public Option_1 send_data_to_phone(String data){
//        $(byName("phone")).click();
//        $(byName("phone")).val("+7 (000) 000-00-00");

        SelenideElement input = $(byName("phone"));

        JavascriptExecutor executor = (JavascriptExecutor) getWebDriver();
        executor.executeScript("arguments[0].value='data';", input);

//        $(byName("phone")).click();
//        $(byName("phone")).setValue("+7 (353) 253-25-12");
        return this;
    }
    @Step("Проверяем правильность введённых данных в поле Телефон")
    public Option_1 phone_check(String data){
        $(byName("phone")).shouldHave(value(data));
        return this;
    }
    @Step("Вводим мэйл")
    public Option_1 send_data_to_email(String data){
        $(byXpath("//input[@name='email']")).click();
        $(byXpath("//input[@name='email']")).val(data);
        return this;
    }
    @Step("Проверяем правильность введённых данных в поле Email")
    public Option_1 email_check(String data){
        $(byXpath("//input[@name='email']")).shouldHave(value(data));
        return this;
    }
    @Step("Вводим галочку")
    public Option_1 checkbox(){
        $(byXpath("//div[@id=\'wrapper\']/div[3]/div[2]/div/div/div/div/div/div/form/div[6]/label/span")).shouldBe(enabled).click();
        return this;
    }
    @Step("Отправляем данные")
    public Option_1 send_feedback(){
        $(".style_btnBlue__elfaw").shouldBe(enabled).click();
        sleep(5000);
        return this;
    }

    @Step("Отправляем невалидные данные в поле телефон")
    public Option_1 send_invalid_data_to_phone(){
        $(byName("phone")).click();
        $(byName("phone")).val("+7 (абв) 000-00-00");
        return this;
    }

    @Step("Проверяем, что система отреагировала на невалидные данные")
    public Option_1 check_error(){
        $(byXpath("//div[@class='style_error__uEjCt']")).shouldHave(Condition.text("Неверный формат номера телефона"));
        return this;

    }
}
