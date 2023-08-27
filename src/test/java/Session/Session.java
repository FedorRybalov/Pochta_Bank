package Session;

import Options.Option_0;
import Options.Option_1;
import Options.Option_13;
import Options.Option_2;
import core.BaseSelenideClass;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Session extends BaseSelenideClass {
    public void MainPage(){

        open("https://www.pochtabank.ru/feedback");
    }

    public Option_1 choose_option_1(){
//        String data = String.format("//div[@id='react-select-:Rjdekm:-option-1']", i);
        $(".select-filters__single-value").click();
        $(byXpath("//div[@id='react-select-:Rjdekm:-option-1']")).click();
        return new Option_1();
    }

    public Option_13 choose_option_13(){
        $(".select-filters__single-value").click();
        $(byXpath("//div[@id='react-select-:Rjdekm:-option-13']")).click();
        return new Option_13();
    }

    public Option_2 choose_option_2(){
        $(".select-filters__single-value").click();
        $(byXpath("//div[@id='react-select-:Rjdekm:-option-2']")).click();
        return new Option_2();
    }

    public Option_0 page_without_option(){
        return new Option_0();
    }
}
