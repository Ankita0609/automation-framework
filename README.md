<p align="center">
  <img src="https://img.icons8.com/?size=200&id=119111&format=png" width="120"/>
</p>

<h1 align="center">🚀 Selenium Automation Framework (TestNG + Java + Maven)</h1>

<p align="center">
A maintainable automation framework built using Selenium WebDriver, TestNG, Maven & Page Object Model.
</p>

---

<p align="center">

<img src="https://img.shields.io/badge/Selenium-Automation-green?style=for-the-badge"/>
<img src="https://img.shields.io/badge/TestNG-Framework-blue?style=for-the-badge"/>
<img src="https://img.shields.io/badge/Java-21-red?style=for-the-badge"/>
<img src="https://img.shields.io/badge/Maven-Build Tool-orange?style=for-the-badge"/>
<img src="https://img.shields.io/badge/WebDriverManager-Drivers Auto Setup-purple?style=for-the-badge"/>
<img src="https://img.shields.io/badge/PageObjectModel-Design Pattern-darkblue?style=for-the-badge"/>

</p>

---

## 📌 Overview

This framework automates the testing of the **OrangeHRM** web application.  
It follows **POM (Page Object Model)** with reusable utilities and supports reporting using **Allure Reports**.

---

## 🧱 Project Structure

automation-framework
│
├── src/main/java
│ ├── base # Browser setup driver
│ ├── config # Configuration file
│ ├── pages # Page Object Model classes
│ └── utils # Helper utilities (waits, reusable functions)
│
├── src/test/java
│ └── uiTests # Test classes
│
├── test-output # TestNG report output
├── allure-results # Allure raw result files
├── pom.xml # Maven dependencies
└── testng.xml # Test execution suite


---

## ⚙️ Technology Stack

| Category | Tool |
|---------|------|
| Programming Language | Java |
| Automation Tool | Selenium WebDriver |
| Test Runner | TestNG |
| Build Tool | Maven |
| Design Pattern | Page Object Model |
| Reporting | Allure Report |
| Driver Manager | WebDriverManager |

---

## ▶️ Running the Tests

### 1️⃣ Clone the Project
```bash
git clone https://github.com/Ankita0609/automation-framework.git
cd automation-framework

2️⃣ Install Dependencies
mvn clean install

3️⃣ Execute Test Suite
mvn test

📊 Generate Allure Report
allure serve allure-results


🧪 Available Tests

| Test Name            | Description                              |
| -------------------- | ---------------------------------------- |
| `LoginTest`          | Verifies valid login functionality       |
| `UserManagementTest` | Creates a new user and validates success |

⭐ Framework Features

✔ Clean Page Object Model (POM)
✔ Explicit waits (No flakiness)
✔ Centralized test execution (testng.xml)
✔ Scalable and expandable structure
✔ Automatic driver setup via WebDriverManager

🚀 Planned Enhancements

🔹 CI/CD with GitHub Actions
🔹 Docker Grid support
🔹 Cross-browser testing
🔹 Parallel execution

👩‍💻 Author

Ankita Singh
📌 Automation Test Engineer
🔗 GitHub: https://github.com/Ankita0609

<p align="center">⭐ If this project helped you, please give it a star!</p> <p align="center">Made with ❤️ and ☕</p> ```

