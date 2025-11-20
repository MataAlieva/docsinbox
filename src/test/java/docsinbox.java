import com.codeborne.selenide.Configuration;
import io.qameta.allure.Step;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class docsinbox extends TestBase {

    @BeforeAll
    static void setUp() {
        Configuration.timeout = 10000;
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://docsinbox.ru";
        Configuration.pageLoadStrategy = "eager";
    }

    @Test
    @Step("Переход в Тарифы")
    void test() {
            open("https://docsinbox.ru/");
            $(byText("Тарифы")).click();
    }

    @Test
    @Step("Переход в Тарифы, Пакетные решения, Полгода -10%")
    void test1() {
        open("https://docsinbox.ru/");
        $(byText("Тарифы")).click();
        $(".tn-atom").click();
        $(".tn-atom__button-content").click();
    }

    @Test
    @Step("Некорректное заполнение формы Войти")
    void testForm() {
            open("https://docsinbox.ru/");
            $(byText("Войти")).click();
            $("#loginForm_login").shouldBe(visible).setValue("Matama");
            $("#loginForm_password").shouldBe(visible).setValue("12ws");
            $(byText("Войти")).click();
    }

    @Test
    @Step("Пустая форма Войти")
    void testEmptyForm() {
            open("https://docsinbox.ru/");
            $(byText("Войти")).click();
    }

    @Test
    @Step ("Некорректное заполнение формы Демо")
    void SignUpForDemo() {
            open("https://docsinbox.ru/");
            $(byText("Записаться на демо")).click();
            $("#input_6727350581250").shouldBe(visible).setValue("Matama");
            $("#input_6727350581251").setValue("9269999999");
            $("#input_6727350581252").setValue("Mata@gmail.com");
            $(".t-btn_effects").click();
    }
}