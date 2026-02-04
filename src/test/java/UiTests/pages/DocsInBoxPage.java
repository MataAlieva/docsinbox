package UiTests.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class DocsInBoxPage {

    private final SelenideElement
            tariffsMenu = $(byText("Тарифы")),
            loginMenuButton = $(byText("Войти")),
            demoMenuButton = $(byText("Записаться на демо")),
            halfYearDiscountButton = $(".tn-atom__button-content"),

    loginInput = $("#loginForm_login"),
            passwordInput = $("#loginForm_password"),
            submitLoginButton = $(byText("Войти")),

    demoNameInput = $("#input_6727350581250"),
            demoPhoneInput = $("#input_6727350581251"),
            demoEmailInput = $("#input_6727350581252"),
            submitDemoButton = $(".t-btn_effects");

    @Step("Открыть главную страницу")
    public DocsInBoxPage openPage() {
        open("https://docsinbox.ru/");
        return this;
    }

    @Step("Перейти в раздел Тарифы")
    public void goToTariffs() {
        tariffsMenu.click();
    }

    @Step("Выбрать тариф на полгода со скидкой")
    public void clickHalfYearDiscount() {
        halfYearDiscountButton.click();
    }

    @Step("Открыть форму входа")
    public void openLoginForm() {
        loginMenuButton.click();
    }

    @Step("Заполнить форму входа: логин {login}, пароль {password}")
    public void fillLoginForm(String login, String password) {
        loginInput.shouldBe(visible).setValue(login);
        passwordInput.shouldBe(visible).setValue(password);
        submitLoginButton.click();
    }

    @Step("Открыть форму записи на демо")
    public void openDemoForm() {
        demoMenuButton.click();
    }

    @Step("Заполнить форму демо: имя {name}, телефон {phone}, почта {email}")
    public void fillDemoForm(String name, String phone, String email) {
        demoNameInput.shouldBe(visible).setValue(name);
        demoPhoneInput.setValue(phone);
        demoEmailInput.setValue(email);
        submitDemoButton.click();
    }
}