# Java_Lab_Rest
### Task
 - Write code for Lab 2
 - Use java code convention
 - CLasses must be distributed in packages
 - Work with console must be minimal
 - Code must contain only that classes that are described in the diagram
 - Sorting must use java built-in methods
 - Sorting must be implemented in separate method
 - No static methods/attributes are allowed (the only exception is a main method)
 - You must use an Enum
 - Code must be in a separate branch with PR
 - Comparison must be implemented using lambdas
 - Instead of getters/setters you should use @Data annotation from lombok
 - Use maven and Jococo(in build section), FindBugs, PMD, CheckStyle plugins(reporting section)
 - Run `mvn site` and fix errors reported by checkstyle, pmd and findbugs

## To run:
 - git clone 
 - Intellij IDEA: push 'RUN'
## Or:
 - `cd` into repo folder
 - Run `mvn compile`
 - Run `mvn exec:java -Dexec.mainClass=ua.lviv.iot.equipment.App` 

## Lab 9
### Task
 - Build REST service
 - Use JAX-RS
 - Create ArmamentController and implement GET/POST/PUT/DELETE
 - Check code with findbags/checkstyle/pmd plugins
 - Code from ArmamentController and RestApplication must be in different packages
 - Use Map for saving objects
 - modify your pom.xml

## To run server:
 - git clone 
 - Intellij IDEA: push 'RUN'
## Or:
 - Run `mvn compile`
 - Run `mvn package` - Run `mvn exec:java -Dexec.mainClass=ua.lviv.iot.equipment.SceneryProjectApplication`


## Lab 10
### Task
 - Code from lab 9 must be modified so that dota is stored and read using a database
 - Use java code convention
 - Check code with findbags/checkstyle/pmd plugins
 - The code must contain classes Controller, Service and interface Repository
 - Modify your pom.xml
 - Use Spring boot, Spring data, MYSQL

## To run server:
 - git clone
 - Intellij IDEA: push 'RUN'
## Or:
 - Run mvn compile
 - Run mvn package
 - Run mvn exec:java -Dexec.mainClass=ua.lviv.iot.equipment.SceneryProjectApplication
