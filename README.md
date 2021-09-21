# JADLE
.

## Setup/Installation Requirements
* Fork/Clone the repository
```
   $ git clone https://github.com/andreassenmarvin/Jadle.git
```
* Open your project on IntelliJ
* Run project
```
   $ gradle run
```
## Database Setup Instructions
##### In PSQL:
* CREATE DATABASE wildlife_tracker;
* CREATE TABLE animals (id serial PRIMARY KEY, name varchar,type varchar,health varchar,age varchar);
* CREATE TABLE locations (id serial PRIMARY KEY,name varchar);
* CREATE TABLE rangers (id serial PRIMARY KEY,name varchar,badge_number varchar);
* CREATE TABLE sightings (id serial PRIMARY KEY,animal_id int,ranger_id int,location_id int,time timestamp);

* CREATE DATABASE wildlife_tracker_test WITH TEMPLATE wildlife_tracker;
## Known Bugs
No known bugs
## Technologies Used
* Handlebars
* CSS
* Java
* Spark 
* PostgreSQL
## Support and contact details
 Incase of any contributions,query or issues,you can reach me through the email below:
machariamarvin625@gmail.com
### License
This project is licensed under the [MIT License](https://github.com/andreassenmarvin/Jadle/blob/master/LICENSE).