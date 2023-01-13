
# Проект по автоматизации тестирования сайта [OLX.KZ](https://olx.kz/)
<p align="center">
<a href="https://olx.kz"><img src="images\logo\OLX-logo.svg" width="150" height=150"  alt="OLX-logo"/></a>
</p>


##	Содержание

- [Технологии и инструменты](#technologist-технологии-и-инструменты)
- [Реализованы проверки](#bookmark_tabs-реализованные-проверки)
- [Запуск тестов из терминала](#computer-запуск-тестов-из-терминала)
- [Запуск тестов в Jenkins](#-запуск-тестов-в-jenkins)
- [Отчет о результатах тестирования в Allure Report](#-отчет-о-результатах-тестирования-в-Allure-report)
- [Интеграция с Allure TestOps](#-интеграция-с-allure-testops)
- [Уведомления в Telegram с использованием бота](#-уведомления-в-telegram-с-использованием-бота)


## :technologist: Технологии и инструменты

<p align="center">
<code><a href="https://www.jetbrains.com/idea/"><img src="images/logo/Idea.svg" width="50" height="50"  alt="IDEA"/></a></code>
<code><a href="https://www.java.com/"><img src="images/logo/Java.svg" width="50" height="50"  alt="Java"/></a></code>
<code><a href="https://github.com/"><img src="images/logo/GitHub.svg" width="50" height="50"  alt="Github"/></a></code>
<code><a href="https://junit.org/junit5/"><img src="images/logo/Junit5.svg" width="50" height="50"  alt="JUnit 5"/></a></code>
<code><a href="https://gradle.org/"><img src="images/logo/Gradle.svg" width="50" height="50"  alt="Gradle"/></a></code>
<code><a href="https://selenide.org/"><img src="images/logo/Selenide.svg" width="50" height="50"  alt="Selenide"/></a></code>
<code><a href="https://aerokube.com/selenoid/"><img src="images/logo/Selenoid.svg" width="50" height="50"  alt="Selenoid"/></a></code>
<code><a href="https://github.com/allure-framework/"><img src="images/logo/Allure.svg" width="50" height="50"  alt="Allure"/></a></code>
<code><a href="https://qameta.io/"><img src="images/logo/Allure_TO.svg" width="50" height="50"  alt="Allure_TO"/></a></code>
</p>


## :bookmark_tabs: Реализованные проверки:
### UI Tests

- Проверка видимости элементов верхнего меню сайта
- Проверка поиска товара
- Проверка деталей товара
- Добавление товара в список 'Избранные'
- Проверка текста на странице 'Избранных' товаров

## :computer: Запуск тестов из терминала

### Локальный запуск тестов

```bash
gradle clean test
```

### Удаленный запуск тестов

```bash
gradle clean test
-Dbrowser=${BROWSER}
-Dbrowser_size=${BROWSER_SIZE}
```

## Параметры сборки


<code>BROWSER</code> – браузер, в котором будут выполняться тесты (_по умолчанию - <code>chrome</code>_).

<code>BROWSER_SIZE</code> – размер окна браузера, в котором будут выполняться тесты.

## <img width="4%" title="Jenkins" src="images/logo/Jenkins_logo.svg"> Запуск тестов в [Jenkins](https://jenkins.autotests.cloud/job/qa_guru_15_15_home_work/)

Для запуска сборки необходимо указать значения параметров и нажать кнопку <code><strong>*Собрать с параметрами*</strong></code>.

<p align="center">
  <img src="images/jenkins.png" alt="Jenkins" width="800">
</p>

После выполнения сборки, в блоке <code><strong>*История сборок*</strong></code> напротив номера сборки появится
значок *Allure Report*, кликнув по которому, откроется страница с сформированным html-отчетом.

<p align="center">
  <img src="images/jenkins-allure-report.png" alt="jenkins-allure-report" width="800">
</p>


## <img width="4%" title="Allure Report" src="images/logo/Allure.svg"> Отчет о результатах тестирования в [Allure Report](https://jenkins.autotests.cloud/job/qa_guru_15_15_home_work/allure/)

<p align="center">
  <img src="images/allure1.png" alt="allure1" width="900">
</p>
<p align="center">
  <img src="images/allure2.png" alt="allure2" width="900">
</p>


## <img width="4%" title="Allure TestOPS" src="images/logo/Allure_TO.svg"> Интеграция с [Allure TestOps](https://allure.autotests.cloud/project/1797/dashboards)

## Основной дашборд

<p align="center">
  <img src="images/allure-main-dashboard.png" alt="dashboard" width="900">
</p>

## Тест-кейсы

<p align="center">
  <img src="images/allure-testcase.png" alt="allure-testcase" width="900">
</p>

## <img width="4%" title="Telegram" src="images/logo/Telegram.svg"> Уведомления в Telegram с использованием бота
После завершения сборки <code>Telegram</code> бот, автоматически обрабатывает и отправляет сообщение с отчетом о прогоне тестов.

<p align="center">
<img title="Telegram Notifications" src="images/telegram.png">
</p>
