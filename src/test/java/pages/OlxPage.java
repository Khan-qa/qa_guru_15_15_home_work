package pages;

import static com.codeborne.selenide.Selenide.open;

public class OlxPage {

    public OlxPage openMainPage() {
        open("/");

        return this;
    }
}
