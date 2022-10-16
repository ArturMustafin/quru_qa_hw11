package com.github.pages;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.page;
import static com.codeborne.selenide.Selenide.$;
import static org.openqa.selenium.By.linkText;

public class WikiPage {

    public static final String PAGE_SOFT_ASSERTIONS = "SoftAssertions";

    public WikiPage clickMorePage() {
        $(".wiki-more-pages-link button").click();

        return this;
    }

    public SoftAssertionsPage clickSoftAssertion() {
        $("#wiki-pages-box").shouldHave(visible, text(PAGE_SOFT_ASSERTIONS))
                .$(linkText(PAGE_SOFT_ASSERTIONS)).click();

        return page(SoftAssertionsPage.class);
    }

}
