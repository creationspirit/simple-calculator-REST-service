## Simple Calculator for REST Service

Spring Boot REST service exposing calculations API for a simple calculator <br>

Service currently exposes only one route: `GET /api/calculation?a=<number>&b=<number>&op=<operation>` <br>

Parameters:
a, b - operands for binary operations. Value can be floating point number
op - operation to execute. Possible values are +, -, *, /

All other values and or missing query parameters returns 400 BAD_REQUEST.

Clone application and start server with command: `./gradlew bootRun`

One example of front-end app that is consuming this service is a react app that can be found in [this repository](https://github.com/creationspirit/simple-calculator-react-app).
