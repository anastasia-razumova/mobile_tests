package tests;

import io.appium.java_client.AppiumBy;
import org.junit.jupiter.api.Test;

import java.net.MalformedURLException;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import org.junit.jupiter.api.DisplayName;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;


public class WikiTests extends TestBase {

    @Test
    @DisplayName("Проверка поиска по тексту Java")
    void successSearchTest() {
        step("Skip onboarding pages", () -> back());
        step("Type search", () -> {
            $(AppiumBy.accessibilityId("Search Wikipedia")).click();
            $(AppiumBy.id("org.wikipedia.alpha:id/search_src_text")).sendKeys("Java");
        });
        step("Verify content found", () ->
                $$(AppiumBy.id("org.wikipedia.alpha:id/page_list_item_title")).shouldHave(sizeGreaterThan(0)));
    }

    @Test
    @DisplayName("Проверка текста на стартовом экране")
    void checkTextStartScreen() {
        step("Skip onboarding pages", () -> back());

        step("Check text", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/view_announcement_text"))
                    .shouldHave(text("Customize your Explore feed You can now choose what to show on your feed," +
                            " and also prioritize your favorite types of content."));
        });
    }

    @Test
    @DisplayName("Проверка добавления языка")
    void addLanguage() {
        step("Skip onboarding pages", () -> back());
        step("Type search", () ->
                $(AppiumBy.accessibilityId("Search Wikipedia")).click());
        step("Add new language", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/search_lang_button")).click();
            $$(AppiumBy.id("org.wikipedia.alpha:id/wiki_language_title")).findBy(text("ADD LANGUAGE")).click();
            $$(AppiumBy.id("org.wikipedia.alpha:id/localized_language_name")).findBy(text("Deutsch")).click();
        });
        step("Verify added language", () ->
                $$(AppiumBy.className("android.widget.TextView")).findBy(text("Deutsch")).shouldBe(visible));
    }

}