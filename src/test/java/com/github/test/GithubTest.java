package com.github.test;

import com.github.BaseTest;
import com.github.pages.RepoPage;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class GithubTest extends BaseTest {

    @Test
    void checkExampleJunitInSoftAssertionsPageTest() {
        open("/selenide/selenide", RepoPage.class)
                .clickTabWiki()
                .clickMorePage()
                .clickSoftAssertion()
                .checkTextJunit();
    }

}
