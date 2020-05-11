# How to run

inside the directory run

`mvn spring-boot:run`

# Configurations

`looker-mock/src/main/resources/application.properties` 
* api tokens
* expiry interval

`looker-mock/src/main/resources/static/usernames.csv`
* mock csv

# Sample calls

## Login

### Request

`curl --location --request POST 'localhost:8080/api/3.1/login' \
 --header 'client_id: 1234' \
 --header 'client_secret: asldkfjlaksjdfa'`

### Response

`{
     "access_token": "4QDkCyCtZzYgj4C2p2cj3csJH7zqS5RzKs2kTG4m",
     "token_type": "token",
     "expires_in": "60"
 }`

## Get look

### Request

`curl --location --request GET 'localhost:8080/api/3.1/looks/123/run/qwe' \
 --header 'Authorization: token 4QDkCyCtZzYgj4C2p2cj3csJH7zqS5RzKs2kTnG4m'`
 
 ### Response
 
 Users Username,Reports From Invitations Created At By Hacker Joined Month
123,123