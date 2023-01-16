#  Проект по автоматизации тестирования мобильного приложения Wikipedia

##	Содержание

- [Технологии и инструменты](#technologist-технологии-и-инструменты)
- [Реализованные проверки](#bookmark_tabs-реализованные-проверки)
- [Запуск тестов из терминала](#computer-запуск-тестов-из-терминала)
- [Запуск тестов в Jenkins](#-запуск-тестов-в-jenkins)
- [Отчет о результатах тестирования в Allure Report](#-отчет-о-результатах-тестирования-в-Allure-report)
- [Видео пример](#video_camera-Видео)



## :rocket: Технологии и инструменты:

<p  align="center">

<code><img width="5%" title="Java" src="images/Java.svg"></code>
<code><img width="5%" title="GitHub" src="images/GitHub.svg"></code>
<code><img width="5%" title="IntelliJ IDEA" src="images/Idea.svg"></code>
<code><img width="5%" title="Gradle" src="images/Gradle.svg"></code>
<code><img width="5%" title="Junit5" src="images/Junit5.svg"></code>
<code><img width="5%" title="Allure Report" src="images/Allure.svg"></code>
<code><img width="5%" title="Jenkins" src="images/Jenkins_logo.svg"></code>
<code><img width="5%" title="Browserstack" src="images/browserstack-icon.svg"></code>
</p>

## :heavy_check_mark: Реализованные проверки:

- Проверка функции поиска по тексту
- Проверка текста на стартовом экране
- Проверка добавления языка


## :computer: Запуск тестов из терминала: 


### Локальный запуск тестов:

```bash
gradle clean test
```

## <img width="4%" title="Jenkins" src="images/Jenkins_logo.svg"> Запуск тестов в [Jenkins](https://jenkins.autotests.cloud/job/hw_mobile/):
Для запуска сборки необходимо нажать кнопку <code><strong>*Собрать сейчас*</strong></code>.

<p align="center">
  <img src="images/jenk3.png" alt="Jenkins" width="800">
</p>

После выполнения сборки, в блоке <code><strong>*История сборок*</strong></code> напротив номера сборки появится
значок *Allure Report*, кликнув по которому, откроется страница с сформированным html-отчетом.

<p align="center">
  <img src="images/allure_report4.png" alt="allure" width="800">
</p>



## <img width="4%" title="Allure Report" src="images/Allure.svg"> Отчет о результатах тестирования в [Allure Report](https://jenkins.autotests.cloud/job/hw_mobile/allure/):

<p align="center">
  <img src="images/all4.png" alt="jenk" width="900">
</p>

## :video_camera: Видео пример 
<p align="center">
<img src="/images/video-c73a8c89b863866f200615f7b01dca21cc3abc1e.gif" alt="video"/></a>
</p>
