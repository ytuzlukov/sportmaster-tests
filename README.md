# https://www.sportmaster.ru/
# This is the Project with UI/API Autotests for 'Sportmaser' website, allows us to get actual information about smoke UI/API test, and learn about actual working status of the site.
<p align="center">
<img title="Sportmaster" src="images/sportmaster-main.png">
</p>

## :computer: Technology Stack used in the project:
<p align="center">
<a href="https://www.jetbrains.com/idea/"><img src="images/logo/Idea.svg" width="50" height="50"  alt="IDEA" title="IntelliJ IDEA"/></a>
<a href="https://www.java.com/"><img src="images/logo/Java.svg" width="50" height="50"  alt="Java" title="Java"/></a>
<a href="https://github.com/"><img src="images/logo/GitHub.svg" width="50" height="50"  alt="Github" title="GitHub"/></a>
<a href="https://junit.org/junit5/"><img src="images/logo/Junit5.svg" width="50" height="50"  alt="JUnit 5" title="JUnit 5"/></a>
<a href="https://gradle.org/"><img src="images/logo/Gradle.svg" width="50" height="50"  alt="Gradle" title="Gradle"/></a>
<a href="https://selenide.org/"><img src="images/logo/Selenide.svg" width="50" height="50"  alt="Selenide" title="Selenide"/></a>
<a href="https://aerokube.com/selenoid/"><img src="images/logo/Selenoid.svg" width="50" height="50"  alt="Selenoid" title="Selenoid"/></a>
<a href="https://github.com/allure-framework/allure2"><img src="images/logo/Allure.svg" width="50" height="50"  alt="Allure" title="Allure"/></a>
<a href="https://www.jenkins.io/"><img src="images/logo/Jenkins.svg" width="50" height="50"  alt="Jenkins" title="Jenkins"/></a>
</p>

## :notebook_with_decorative_cover: Summary:

- PageObjects
- UI/API tests
- Parameterized build
- Owner.config
- AllureTestops
- Selenoid remote launch
- Jenkins
- Allure
- Gradle
- Selenide

Cases:
UI:
- Add to cart from category page
- Add to cart from product page
- Approve recognized city
- Catalog open check
- Check banner wrapper filled by banners
- Check category correct open
- Closing cookie bar check
- Login modal open check
- Main site's elements visibility check
- Open change city modal check

API:
- Add for comparison test
- Check product quantity
- Check subscribe unavailable
- Delete from comparison test
- Get auto hints
 

## :floppy_disk: To run tests locally use:

```
gradle clean test -DswitchLaunch=local
```

## :robot: Jenkins job
Jenkins is an automation server which lets us run tests

Click <a target="_blank" href="https://jenkins.autotests.cloud/job/%D1%8111_sportmaster_tuzlukov/">here</a> to see Jenkins project

<p align="center">
<img title="Parameters configuration" src="images/jenkins-main.png">
</p>

## :open_book: Allure report
Allure Framework is a flexible test report tool that shows a concise representation of what have been tested in a neat web report form

Click <a target="_blank" href="https://jenkins.autotests.cloud/job/%D1%8111_sportmaster_tuzlukov/allure/">here</a> to see the report of the tests

In-jenkins graphics overview:

<p align="center">
<img title="Allure overview" src="images/allure.png">
</p>

Allure-testops graphics:

<p align="center">
<img title="Allure overview" src="images/testops.png">
</p>


For best readability in ui tests all steps have locators and abbreviation of that they do in this case. At the post steps screenshot and video will be added to.
<p align="center">
<img title="Allure overview" src="images/testops-ui.png">
</p>


In api tests request and responce have readable abbreviation too.
<p align="center">
<img title="Allure overview" src="images/testops-api.png">
</p>

## :film_projector: Video example of a running test

<img src="images/video.gif">

