# TestFX-spock template
#### with TestFX, TestFX-spock and groovy tests for JavaFX application, included as repository code in test project

### Prerequisites
* gradle
* JavaFX application repository code to test

### Initial
* clone repository
* open build.gradle file in IDE (IntelliJ)
* import dependencies with gradle

### Customise TestFX tests
* delete javaFXSimpleApp package with code
* include your JavaFX application repository code for test
* or include testFX-spock template in existing JavaFX application project (without javaFXSimpleApp code)
* import your JavaFX application Main.class in TestFXSpockAppRunner class (in FxToolkit.setupApplication() method)
* add your test classes with tests cases

### How to run tests:
#### With gradle command:
To run TestFX tests type command:
* 'clean test'
* 'clean build'

#### With IDE (JUnit):
* run SimpleTestFXSpockTest / your test class
* or run only method 'def' in SimpleTestFXSpockTest / your test class

### Reports
Reports are placed in 'build' directory (after running tests with gradle task 'clean test' / 'clean build').
To run report in browser, open 'build\reports\tests\test\index.html' file and choose browser.
