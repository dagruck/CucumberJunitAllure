package hooks;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.cucumber.java.Before;
import io.qameta.allure.selenide.AllureSelenide;

/**
* Класс аллюр менеджер: для отображения в аллюре селенидовских шагов при наличии в проекте параллелизации
* Если в проекте нет параллелизации то всё это нужно описать в RunnerTest в @BeforeClass
*/
public class AllureSelenideSubscription {
    @Before
    public static void allureSubThreadParallel(){
        String listenerName = "AllureSelenide";

        if(!(SelenideLogger.hasListener(listenerName)))
            SelenideLogger.addListener(listenerName,
                    new AllureSelenide().
                    screenshots(true).
                    savePageSource(false));
    }
}
