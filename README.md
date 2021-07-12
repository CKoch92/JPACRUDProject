# JPACRUDProject

## Developers
#### [Caleb Koch](https://github.com/CKoch92)

## Overview
This is a full stack Java application and implements JPA C.R.U.D. functionality, utilizing Spring MVC and the DAO pattern. The DAO implementation uses JPA to persist and retrieve data through MySQL.

## Functionality
####Menu Site
This site serves as a primitive model for an online menu application, where restaurants can add, delete, and modify menu items. To test these functions out, a small wines my the bottle menu has been created. With more testing, the database can grow into a larger beverage menu and incorporate food menus, as well.

#### Search For Wine Bottles
A user can search for wine bottles under four methods. 1) A user can view the entire wines by the bottle menu. 2) A user can search for bottles by vineyard. 3) A user can search for wines by varietal. 4) A user can search for wines by type (red, white, or sparkling).

All search methods result in the user's search term being mapped to a WineBottleController class that calls a DAO method with the search term as a parameter. The DAO method substitutes a JPQL query's bind variable with the search term and returns the results as a List of Winebottle objects that are displayed on a results page.

#### Add Wine Bottle
A user can choose to add a new wine bottle. They can enter all the properties/fields of the bottle. Upon submission, the user inputs are mapped as parameters and used by the DAO to create a new Winebottle object that is added to the menudb Database by the EntityManager.

#### Delete Bottle
Any time a Wine Bottle is displayed, the user is given the option of deleting the bottle. Once the delete button is select, the bottle's id is mapped to a Controller method that sends the id to a DAO method, where the EntityManager uses the id to retrieve the Winebottle and delete it.

#### Update Bottle
Like the delete method, a user is given the option of updating a bottle's properties/fields. The edit button takes the user to page where a form exists with all the wine bottle's parameters (expect id) displayed as inputs and pre-populated with present values. The user is given the option to modify any values. Once submit is clicked, all values are sent mapped to the controller (including a hidden id value) and used as parameters in a DAO method that creates a new Winebottle object to replace previous object existing in the menudb at the same id value.


## Technologies Used
- Java
- HTML
- Spring ToolSuite
- Gradle
- MySQL
- MySQLWorkbench
- JPA
- MAMP

## How to Run
This full stack Java application runs on an Apache Tomcat webserver. User can interact with the application through online navigation.
To host your own instance, you are going to need a similar webserver that implements Java servlet containers. We recommend importing the program to Eclipse IDE, and installing a Tomcat instance within Eclipse to run locally.

## Lessons Learned
Biggest lessons in this project were simply within getting familiar with JPA and and JPQL's syntax. After working with JDBC, this project required constant double-checking of correct syntax alignment between the Winebottle entity, jpql queries, and the menudb database.

Also, the imagination of the project nearly superseded the crud functionality, with a lot of trial and error being sent on front end user functionality that didn't quite pan out (a lot within the a potential diner's ability to locate their wine). I think macro-planning of what the app should look like and how it should satisfy the project requirements first would have saved plenty of time. 
