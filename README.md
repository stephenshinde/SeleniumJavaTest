# SeleniumJavaTest

This project is developed with Selenium Java Page object model for Web application Testing

**IDE** : Eclipse,<br />
**Programming Language** : Java,<br />
**Library Used** : Selenium Webdriver , TestNG<br />
**Reporting library Used** : Extent Report<br />
**Build Tool** : Maven<br />


## How to Clone project:
1. Download and Install Git from https://git-scm.com/downloads,<br />
2. Navigate to computer drive<br />
3. Open command prompt<br />
3. Enter command **git clone **<br />

## Install Maven build tool
1. Download Apache Maven<br />
2. Set enviornment variable path<br />

## How to Run Project:
**First Way**
1. Open command prompt <br />
2. Navigate to the project directory, where you are able to see project files and pom.xml<br />
3. Execute pom. xml file with command **mvn clean test** <br />

**Second Way**
1. Import the maven existing project in eclipse editor<br />
2. Right click on project and run as with mvn test<br />

**Third Way**
1. Right click on project and run as with testng test<br />


## How to access report
1. Once the execution is done<br />
2. In Reports folder, report.html file will be genrated <br />


## Project Structure:

1. com.automation.tests : Test Cases<br />
2. com.automation.core : Base Class contains webdriver initialization<br />
3. com.automation.helpers : helpers package includes reusable function classees<br />
4. com.automation.pages : contains locators and steps <br />
5. Reports :  generated extents reports <br />
6. testng.xml : testng executable file<br />
