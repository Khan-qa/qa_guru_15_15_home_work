package tests;

import org.junit.jupiter.api.Test;
import pages.OlxPage;

public class OlxTest extends TestBaseConfiguration{
    OlxPage olxPage = new OlxPage();

    @Test
    void tst() {
        olxPage.openMainPage();
    }
}
