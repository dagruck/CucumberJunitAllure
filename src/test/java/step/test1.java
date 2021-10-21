package step;

import io.cucumber.java.ru.И;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class test1 {

    @И("^Открываем главную сраницу GitHub$")
    public void someTest() {
        open(utils.Configuration.getConfigurationValue("main.GitHub"));
    }

}
