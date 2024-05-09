# -Automation-testing_Project-trytestingthis

# Automated Testing with Selenium WebDriver

This project demonstrates automated testing using Selenium WebDriver for a sample web application deployed on Netlify.

## Prerequisites

- Java Development Kit (JDK)
- Maven
- WebDriverManager
- Selenium WebDriver
- Web browser (e.g., Firefox)

## Setup

1. Install Java Development Kit (JDK) and Maven.
2. Add WebDriverManager and Selenium WebDriver dependencies to your Maven project.
3. Ensure you have the appropriate web browser installed (e.g., Firefox).

## Execution

1. Clone this repository.
2. Navigate to the project directory.
3. Run the `trytestingthis` class.

## Test Scenarios

1. **Fill Form**: Enters first name, last name, selects gender, and selects an option from a dropdown.
2. **Checkbox Selection**: Selects any two checkboxes.
3. **File Upload**: Uploads a file to the file input field.
4. **Button Click**: Clicks a button that opens a new window/tab.

## Notes

- The test script uses WebDriverManager to manage WebDriver binaries automatically.
- Thread.sleep() is used for demonstration purposes. In real-world scenarios, you might want to use more robust synchronization techniques.
- Assertions are used to verify various actions during the test execution.


