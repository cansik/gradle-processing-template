# Gradle Processing Template
A very basic Gradle &amp; Processing template to be used with IntelliJ.

### Quick Start

Just [generate](https://github.com/cansik/gradle-processing-template/generate) a new repository!

### Code

The project contains a `Sketch.java` class which contains the three basic Processing methods:

- `settings()` - Used to set pre-setup settings like the size of the sketch.
- `setup()` - Used to setup sketch relevant things (run once).
- `draw()` - Used to draw the sketch (looping).

### Processing
The Processing version used is `3.3.7`, which does not support `circle()`, `pop()` and other syntactic sugar methods. It is recommended to use Java 8 by Oracle.

### Gradle

To use the project just with gradle, run the following command to build & run the project:

```bash
# Windows
gradlew.bat run

# MacOS / Unix
./gradlew run
```

### IntelliJ

To use this project with IntelliJ, just open the root folder and refresh the gradle project (if it does not happen automatically).

### About
Implemented by Florian @ 2020
