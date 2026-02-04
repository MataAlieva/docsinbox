package tests;

import UiTests.tests.TestBase;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import UiTests.pages.DocsInBoxPage;

public class DocsInBoxTests extends TestBase {

    DocsInBoxPage docsPage = new DocsInBoxPage();

    @Test
    @DisplayName("Переход в Тарифы")
    void testTariffsNavigation() {
        docsPage.openPage()
                .goToTariffs();
    }

    @Test
    @DisplayName("Переход в Тарифы, Полгода -10%")
    void testHalfYearTariff() {
        docsPage.openPage();
        docsPage.goToTariffs();
        docsPage.clickHalfYearDiscount();
    }

    @Test
    @DisplayName("Некорректное заполнение формы Войти")
    void testInvalidLogin() {
        docsPage.openPage();
        docsPage.openLoginForm();
        docsPage.fillLoginForm("Matama", "12ws");
    }

    @Test
    @DisplayName("Пустая форма Войти")
    void testEmptyLoginForm() {
        docsPage.openPage();
        docsPage.openLoginForm();
    }

    @Test
    @DisplayName("Некорректное заполнение формы Демо")
    void testInvalidDemoSignUp() {
        docsPage.openPage();
        docsPage.openDemoForm();
        docsPage.fillDemoForm("Matama", "9269999999", "Mata@gmail.com");
    }
}