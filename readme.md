# Todo Rest APIs Connecting to H2 In memory database running on port 7100

Run com.yogesh.rest.webservices.restfulwebservices.RestfulWebServicesApplication as a Java Application.



## Todo Resource

- GET - http://localhost:7100/jpa/users/yogesh/todos

```
[
  {
    "id": 1,
    "username": "yogesh",
    "description": "Going world Tour",
    "targetDate": "2020-06-27T06:30:30.696+0000",
    "isCompleted": "completed"
  },
  {
    "id": 2,
    "username": "yogesh",
    "description": "Play cricket",
    "targetDate": "2020-06-27T06:30:30.700+0000",
    "isCompleted": "completed"
  },
  {
    "id": 3,
    "username": "yogesh",
    "description": "Learn Microservices",
    "targetDate": "2020-06-27T06:30:30.701+0000",
    "isCompleted": "Not completed"
  }
]
```

#### Retrieve a specific todo

- GET - http://localhost:7100/jpa/users/yogesh/todos/1

```
{
    "id": 1,
    "username": "yogesh",
    "description": "Going world Tour",
    "targetDate": "2020-06-27T06:30:30.696+0000",
    "isCompleted": "completed"
  }
```

#### Creating a new todo



- POST to http://localhost:7100/jpa/users/yogesh/todos with BODY of Request given below

```
{
  "username": "yogesh",
  "id" : "4",
  "description": "Learn to Drive a Car",
  "targetDate": "2030-11-09T10:49:23.566+0000",
  "isCompleted": "completed"
}
```

#### Updating an existing todo

- PUT Request to http://localhost:7100/jpa/users/yogesh/todos/4 with BODY of Request given below

```
{
  "username": "yogesh",
   "id": 4,
  "description": "Learn to Drive a Car@BMW",
  "targetDate": "2045-11-09T10:49:23.566+0000",
  "isCompleted": "completed"
}
```

#### Delete todo

- DELETE to http://localhost:7100/jpa/users/yogesh/todos/1


## H2 Console

- http://localhost:7100/h2-console
- Use `jdbc:h2:mem:testdb` as JDBC URL 
