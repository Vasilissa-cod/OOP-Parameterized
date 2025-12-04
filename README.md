# AT-Java-ДЗ-14 & ДЗ-15

**ДЗ-14:** [Google Презентация](https://docs.google.com/presentation/d/1VuBpYPDVN7ZXe0px1JqxDLFJsWcHcwSJy61j_4dg-3U/edit?slide=id.g3a31d5ecb5e_0_393#slide=id.g3a31d5ecb5e_0_393)

**ДЗ-15:** [Google Презентация](https://docs.google.com/presentation/d/11inRbG8suyUdieTejAkQ8Mg6zS9eCv4uPcxGUtS2qXA/edit?slide=id.g3acb956c248_0_617#slide=id.g3acb956c248_0_617)

---

## Задание

### 1. Сделать класс MainPage для хранения информации о веб-странице.

**Поля:**
- `String url`
- `String title`
- `int size`

**Конструкторы:**
- конструктор без параметров
- конструктор с тремя параметрами

**Методы:**
- `isSizeLessThen(int)` — проверяет, что у страницы размер меньше, чем переданное число и выводит на консоль сообщение о результате проверки.

### 2. В функции main создать 3 разных объекта класса MainPage с помощью 3-х разных конструкторов и выполнить проверку размера для каждого.

---

## ДЗ-15: Параметризованный тест

**Тестовый сайт:** https://slqamsk.github.io/cases/slflights/v01/

**Используемые технологии:**
- JUnit 5 (`@ParameterizedTest`, `@CsvSource`)
- Selenide 7.7.3
- Allure Reports 2.29.0

**Задание:** Параметризованный тест для проверки входа под разными пользователями:

| Username | Password |
|----------|----------|
| standard_user | stand_pass1 |
| locked_out_user | lock_pass2 |
| problem_user | prob_pass3 |
| performance_glitch_user | perf_pass4 |
| error_user | erro_pass5 |
| visual_user | visu_pass6 |

**Тестовый класс:** `src/test/java/LoginTests.java`

**Запуск тестов:**
```bash
./gradlew test
```

**Генерация Allure отчёта:**
```bash
./gradlew allureServe
```

---

## Структура проекта

```
OOP/
├── src/
│   ├── main/java/
│   │   ├── classes/
│   │   │   ├── MainPage.java          ← класс для хранения информации о веб-странице
│   │   │   ├── Book.java
│   │   │   ├── Cat.java
│   │   │   ├── NewCat.java
│   │   │   ├── TextStatistics.java
│   │   │   └── TextStatisticsDemo.java
│   │   ├── MainPageDemo.java          ← демонстрация работы MainPage
│   │   ├── BookWorld.java
│   │   ├── CatWorld.java
│   │   └── TextStatisticsDemo.java
│   └── test/java/
│       └── LoginTests.java            ← параметризованный тест (ДЗ-15)
├── build.gradle
├── settings.gradle
└── README.md
```

