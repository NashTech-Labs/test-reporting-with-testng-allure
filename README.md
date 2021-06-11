# Test Automation Reporting with Allure and TestNG
Allure Report tool is a flexible lightweight test report tool. It allows everyone participating in the development process to extract the maximum of useful information from everyday execution of tests. Allure Report provides a nice big picture of which features have been covered, where defects are clustered and also it's help to create Test Automation Report with Allure and TestNG

## Prerequisites
* Java as the programming language
* Maven as the build tool
* Web Driver as the browser automation tool
* Allure & TestNG as the assertion framework
* Intellij as the IDE

## Installation of Allure

    npm install -g allure-commandline
    
## Add maven dependency for Allure Report

    <dependency>
                <groupId>io.qameta.allure</groupId>
                <artifactId>allure-testng</artifactId>
                <version>2.13.0</version>
    </dependency>

## How will we generate the Allure HTML Report? 
* Run the Framework.
* Refresh the project.
* Open the Terminal and go to project directory.
* Run the below command.

      Allure Serve
      
## Execution Steps
* Clone the framework.
* Run the TestNG.xml file.
* Go to Terminal and paste below command.

      Allure Serve

## Test Summary Report

![Screenshot from 2021-06-10 15-58-02](https://user-images.githubusercontent.com/43197101/121710658-7397e780-caf7-11eb-988b-1dfc1d548408.png)

![Screenshot from 2021-06-10 15-58-52](https://user-images.githubusercontent.com/43197101/121710707-7d214f80-caf7-11eb-8661-5a6d9e11278c.png)
![Screenshot from 2021-06-10 15-59-22](https://user-images.githubusercontent.com/43197101/121710774-890d1180-caf7-11eb-96e3-0e04994571d8.png)
