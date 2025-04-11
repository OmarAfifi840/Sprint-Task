# Sprint-Task

Hello, 

Purpose of the Project
The project verifies the following user actions:

Searching for a product

Adding the product to the cart

Entering shipment information
--------------------------------------------------------------
Tools & Technologies Used
Language: Java

IDE: IntelliJ IDEA

Automation Tool: Selenium WebDriver

Testing Framework: TestNG

Build Tool: Maven
--------------------------------------------------------------
Setup Instructions
Install IntelliJ IDEA
Download from: https://www.jetbrains.com/idea/

Install ChromeDriver

Download ChromeDriver from: https://chromedriver.chromium.org/downloads

Make sure the version matches your installed Chrome browser.

Add it to your system path or specify the path in your test code.

Clone the Project

bash
Copy
Edit
git clone <your-repo-url>
cd <project-directory>
--------------------------------------------------------------
Install Dependencies Maven will automatically install the required libraries defined in the pom.xml file.
Make sure the file includes:

xml
Copy
Edit
<dependencies>
  <dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>4.x.x</version>
  </dependency>
  <dependency>
    <groupId>org.testng</groupId>
    <artifactId>testng</artifactId>
    <version>7.x.x</version>
    <scope>test</scope>
  </dependency>
</dependencies>
--------------------------------------------------------------
How to Run the Tests
Open the project using IntelliJ IDEA.

Locate the TestCases package in the src/test/java directory.

Right-click the desired test class (or the whole package) and choose Run.

Make sure ChromeDriver is installed and accessible.
--------------------------------------------------------------

Notes
You must use IntelliJ IDEA to run and manage the project.

Ensure your Chrome browser is compatible with the installed ChromeDriver version.

Tests are written using TestNG annotations for clear test structure and reporting.
