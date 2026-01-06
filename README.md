# Проект по UI тестированию для компании  [DocsInBox](https://www.beeline.ru)

<p align="center"><a href="https://docsinbox.ru/"><img src="images/logoDocsInBox.png" align="center" width="500" height="150"  alt="Java"/></a></p>

> DocsInBox - продуктовая IT-компания. Наш продукт - облачный B2B SaaS, который упрощает управление ресторанным бизнесом и взаимодействие ресторанов с поставщиками и государственными органами.

#  Содержание:

- [Технологии и инструменты](#computer-технологии-и-инструменты)
- [Тестовые сценарии](#clipboard-тестовые-сценарии)
- [Сборка в Jenkins](#-сборка-в-jenkins)
- [Команда для запуска](#-команда-для-запуска)
- [Allure отчет](#-allure-отчет)
- [Интеграция с Allure TestOps](#-интеграция-с-allure-testops)
- [Уведомления в Telegram чат с ботом](#-уведомления-в-telegram-чат-с-ботом)
- [Видео запуска тестов в Selenoid](#-видео-запуска-тестов-в-selenoid)

---

<a id="tools"></a>
##  Технологии и инструменты:

| Java                                                                                                | IntelliJ  <br>  Idea                                                                                          | GitHub                                                                                                | JUnit 5                                                                                                      | Gradle                                                                                                | Selenide                                                                                                    | Selenoid                                                                                                             | Allure <br> Report                                                                                                    | Jenkins                                                                                                     | Jira                                                                                                                               | Telegram                                                                                                       |                                                                                            Allure <br> TestOps |
|:----------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------:|
| <a href="https://www.java.com/"><img src="images/Java.svg" width="50" height="50"  alt="Java"/></a> | <a href="https://www.jetbrains.com/idea/"><img src="images/Idea.svg" width="50" height="50"  alt="IDEA"/></a> | <a href="https://github.com/"><img src="images/GitHub.svg" width="50" height="50"  alt="Github"/></a> | <a href="https://junit.org/junit5/"><img src="images/JUnit5.svg" width="50" height="50"  alt="JUnit 5"/></a> | <a href="https://gradle.org/"><img src="images/Gradle.svg" width="50" height="50"  alt="Gradle"/></a> | <a href="https://selenide.org/"><img src="images/Selenide.svg" width="50" height="50"  alt="Selenide"/></a> | <a href="https://aerokube.com/selenoid/"><img src="images/Selenoid.svg" width="50" height="50"  alt="Selenoid"/></a> | <a href="https://github.com/allure-framework"><img src="images/Allure.svg" width="50" height="50"  alt="Allure"/></a> | <a href="https://www.jenkins.io/"><img src="images/Jenkins.svg" width="50" height="50"  alt="Jenkins"/></a> | <a href="https://www.atlassian.com/software/jira/"><img src="images/Jira.svg" width="50" height="50" alt="Java" title="Java"/></a> | <a href="https://web.telegram.org/"><img src="images/Telegram.svg" width="50" height="50" alt="Telegram"/></a> |      <a href="https://qameta.io/"><img src="images/Allure_TO.svg" width="50" height="50" alt="Allure_TO"/></a> |

#### Для работы с тестами в данном проекте используются:
* язык - <code>Java</code>;
* фреймворк для тестирования - <code>Selenide</code>;
* сборщик - <code>Gradle</code>;
* фреймворк модульного тестирования - <code>JUnit 5</code>;
* запуск браузеров с помошью <code>Selenoid</code>;
* джоба для удалённого запуска в - <code>Jenkins</code>;
* отчёт в <code>Allure Report</code>;
* отправка результатов при помощи бота в - <code>Telegram</code>;
* интеграция с - <code>Allure TestOps</code>;