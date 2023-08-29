package tests;

import Session.Session;
import core.BaseSelenideClass;
import core.Params;
import io.qameta.allure.Description;
import org.junit.jupiter.api.Test;

public class TestCases extends BaseSelenideClass {
    @Test
    @Description("пробный тест на java")
    public void TC_5(){
        Session tst = new Session();

        Params data = new Params();
        data.fio = "Test";
        data.phone = "1111111111";
        data.email = "test@mail.com";

        tst.MainPage();
        tst.choose_option_1()
                .send_data_to_fio(data.fio)
                .send_data_to_phone(data.phone)
                .send_data_to_email(data.email)
                .fio_check(data.fio)
                .phone_check("+7 (111) 111-11-11")
                .email_check(data.email)
                .checkbox()
                .send_feedback()
                .check_feedback_success();
    }

    @Test
    @Description("Test Case 2")
    public void TC_2(){
        Session tst = new Session();

        Params data = new Params();
        data.fio = "Test";
        data.address = "test adress";
        data.phone = "1111111111";
        data.email = "test@mail.com";

        tst.MainPage();
        tst.choose_option_13()
                .send_data_to_fio(data.fio)
                .send_data_to_address(data.address)
                .send_data_to_phone(data.phone)
                .send_data_to_email(data.email)
                .fio_check(data.fio)
                .address_check(data.address)
                .phone_check("+7 (111) 111-11-11")
                .email_check(data.email)
                .checkbox()
                .send_feedback()
                .check_feedback_success();
    }

    @Test
    @Description("Test Case 6")
    public void TC_6(){
        Session tst = new Session();
        tst.MainPage();
        tst.choose_option_1()
                .send_invalid_data_to_phone()
                .check_error();



    }
    @Test
    @Description("Test Case 1")
    public void TC_1(){
        Session tst = new Session();
        tst.MainPage();
        tst.choose_option_2()
                .fio_is_enabled()
                .phone_is_enabled()
                .email_is_enabled()
                .date_is_enabled()
                .screenshot_is_enabled()
                .os_is_enabled()
                .url_is_enabled();
    }

    @Test
    @Description("Test Case 3")
    public void TC_3(){
        Session tst = new Session();
        tst.MainPage();
        tst.page_without_option()
                .fio_is_disabled()
                .phone_is_disabled()
                .email_is_disabled()
                .message_is_disabled();

    }
}
