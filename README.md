# UI-Defect-Detection

UI-Defect-Detection is a test automation project designed to identify UI defects in web applications. The project leverages Selenium WebDriver to perform functional and regression testing, with a focus on verifying the correctness of UI elements like buttons, images, titles, and prices on a web page.

## Features

- **Automated UI Testing**: Validates the visual and functional integrity of web elements (e.g., buttons, images, product titles, and prices).
- **Page Object Model (POM)**: Follows the Page Object Model design pattern for better maintainability and scalability of tests.
- **Data-Driven Testing**: Supports running tests with different sets of data, such as product IDs and titles.
- **Cross-Browser Support**: Can be configured to run tests on different browsers like Chrome and Firefox using WebDriver.
- **Test Reporting**: Generates detailed reports of test execution with passed/failed test results.

## Prerequisites

Before running the tests, make sure you have the following installed on your machine:

- **Java 17 or higher**: The project is built using Java and requires Java 17 or later.
- **Maven or Gradle**: The project uses Maven or Gradle as the build automation tool for managing dependencies and running tests.
- **Selenium WebDriver**: WebDriver for browser automation.
- **ChromeDriver or GeckoDriver**: Required for Chrome or Firefox automation respectively.
- **IDE (Optional)**: You can use any Java IDE such as IntelliJ IDEA or Eclipse for development and debugging.

## Installation

1. **Clone the repository**:

   ```bash
   git clone https://github.com/your-username/UI-Defect-Detection.git
   cd UI-Defect-Detection
Install dependencies:

If you're using Maven, run:

```bash
mvn install
```
If you're using Gradle, run
```bash
./gradlew build
```
Download WebDriver binaries:

Download ChromeDriver or GeckoDriver and add them to your system PATH, or use WebDriverManager to manage it automatically.
Running Tests
To run tests with Maven:

```bash
mvn test
```
To run tests with Gradle:
```bash
./gradlew test
```
To run specific tests (e.g., LoginTest):

```bash
mvn -Dtest=LoginTest test
```
Or with Gradle:

```bash
./gradlew test --tests "LoginTest"
```
Test Reporting
Test results are generated in the target (Maven) or build (Gradle) directories. You can view detailed reports in the following format:

JUnit HTML Report: Located in the target/surefire-reports (Maven) or build/test-results (Gradle).
Folder Structure
```scss

UI-Defect-Detection
│
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── page
│   │   │   │   └── HomePage.java
│   │   │   └── utils
│   │   │       └── WebDriverManager.java
│   │   └── resources
│   ├── test
│   │   └── java
│   │       └── tests
│   │           ├── HomePageTest.java
│   │           └── ProductTest.java
│   └── resources
│       └── test-data
│           └── products.csv
│
├── pom.xml (Maven) or build.gradle (Gradle)
└── README.md
```
Contributing
Fork the repository.
Create a new branch (git checkout -b feature/your-feature).
Commit your changes (git commit -am 'Add new feature').
Push to the branch (git push origin feature/your-feature).
Open a pull request.
License
This project is licensed under the MIT License - see the LICENSE file for details.

Acknowledgements
Selenium WebDriver: For browser automation.
JUnit: For running and structuring the tests.
WebDriverManager: For automatically managing WebDriver binaries.
```markdown

### Penjelasan:
1. **Project Description**: Bagian pertama memberikan gambaran umum tentang apa yang dilakukan oleh proyek ini, seperti pengujian otomatis UI menggunakan Selenium WebDriver.
2. **Prerequisites**: Menyebutkan semua persyaratan yang diperlukan untuk menjalankan proyek ini.
3. **Installation**: Menyediakan langkah-langkah instalasi untuk mengkloning repositori dan mengatur dependensi.
4. **Running Tests**: Cara menjalankan pengujian menggunakan Maven atau Gradle.
5. **Test Reporting**: Memberikan informasi tentang di mana hasil pengujian dapat ditemukan.
6. **Folder Structure**: Menjelaskan struktur folder dari proyek ini.
7. **Contributing**: Memberikan panduan bagaimana orang lain dapat berkontribusi pada proyek ini.
8. **License**: Menyediakan informasi lisensi (misalnya MIT).
9. **Acknowledgements**: Memberikan penghargaan kepada alat dan pustaka yang digunakan dalam proyek ini.
```
Anda bisa menyesuaikan bagian tertentu sesuai dengan detail proyek Anda, seperti nama repositori, URL, dan instruksi spesifik lainnya.
