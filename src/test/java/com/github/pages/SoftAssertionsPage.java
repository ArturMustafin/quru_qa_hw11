package com.github.pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class SoftAssertionsPage {

    public void checkTextJunit(){
        $(".markdown-body").shouldHave(text("Using JUnit5 extend test class"));
    }

}
