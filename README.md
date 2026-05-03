# ReqRes API Test Automation

API test automation framework using Rest Assured, TestNG, and Java.

## Tech Stack
- Java 11
- Rest Assured 5.3.2
- TestNG 7.8.0
- Maven

## What is tested
- GET /users — list users, single user, user not found (404)
- POST /users — create user
- PUT /users — update user
- DELETE /users — delete user
- POST /login — valid login, missing password (400)

## How to run
1. Clone the repo
2. Add your ReqRes API key in BaseTest.java
3. Right-click testng.xml → Run As → TestNG Suite

## Assertions covered
- Status codes (200, 201, 400, 404)
- Response body field values
- Response time under 2000ms