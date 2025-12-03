import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class LoginTests {

    @ParameterizedTest
    @CsvSource({
        "standard_user, stand_pass1",
        "locked_out_user, lock_pass2",
        "problem_user, prob_pass3",
        "performance_glitch_user, perf_pass4",
        "error_user, erro_pass5",
        "visual_user, visu_pass6"
    })
    void testLogin(String username, String password) {
        // Открываем страницу логина
        open("https://slqamsk.github.io/cases/slflights/v01/");

        // Вводим имя пользователя
        $("#username").setValue(username);

        // Вводим пароль
        $("#password").setValue(password);

        // Нажимаем кнопку входа
        $("#loginButton").click();

        // Ждём результат
        sleep(2000);
    }
}
