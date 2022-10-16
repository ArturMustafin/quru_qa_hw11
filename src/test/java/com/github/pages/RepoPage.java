package com.github.pages;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class RepoPage {

    public WikiPage clickTabWiki() {
        $("#wiki-tab").click();
        return page(WikiPage.class);
    }

}
