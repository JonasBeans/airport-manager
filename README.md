## Airport manager
## Description
This application serves as an example to how I interpret a   
minimalistic airport manager application would look like. 

This application has the ability to register pilots as well as passengers.    
It also has the ability to register airplanes that will use the airport. 

Lastly to combine to two it has the ability to register a flight.   
The flight has a list of passengers, a pilot (MVP*), an airplane and an   
arrival time and place and departure time and destination airport. 

*MVP    
For the MVP a flight will only have one pilot. In future plans it will have the ability to register    
a Captain, and a First Officer. 

## UML



## How to run it localy
### Docker
``docker run ... <INSERT DOCKER COMMAND>`` 

### Liquibase

Liquibase should do the database initialisation

### Profile
There is no production profile.    
The app can run localy without specific profile. 

## Technologies

- Liquibase
- SpringBoot
- Testcontainers
- Swagger-ui
- Lombok
