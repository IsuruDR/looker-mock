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
 01005453861,2020-03
 011eleven011,2020-03
 0097,2020-03
 0100100110,2020-03
 0101jyks_xx,2020-03
 0115689920,2020-03
 007-amateur_gamer,2020-03
 008john,2020-03
 00hyla,2020-03
 00xdev,2020-03
 01010100110101,2020-03
 01012225434488642487,2020-03
 011010000110010101101100011011,2020-03
 0110299,2020-03
 000310,2020-03
 00700700710101,2020-03
 007-nicogamer,2020-03
 0087367838238777888,2020-03
 00error00,2020-03
 00hunter00,2020-03
 00ramhacker,2020-03
 00soph13,2020-03
 0101001000,2020-03
 001011,2020-03
 010101010101010101010,2020-03
 0101222213335426,2020-03
 0103636,2020-03
 001aadesh,2020-03
 001agent,2020-03
 011011011,2020-03
 001bhadana,2020-03
 001bkictmasterclass,2020-03
 0004,2020-03
 00000000001,2020-03
 007hackerdeepu,2020-03
 007hackinglegend,2020-03
 001sam001,2020-03
 007rup,2020-03
 000hack,2020-03
 0000777766,2020-03
 000lionel111professor222fishin,2020-03
 00280kacks,2020-03
 000lionel111professor222hackin,2020-03
 00nu,2020-03
 0__,2020-03
 00sahil007,2020-03
 003riturajsaikia,2020-03
 0-0-0-0,2020-03
 005eelmarag,2020-03
 01234uuu0,2020-03