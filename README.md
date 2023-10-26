## MongoDB Java Developer Path
- MongoDB Atlas, Developer Data Platform

In the project's root folder, run the following command to compile your Maven project and connect to your Atlas cluster
```
mvn compile exec:java -Dexec.mainClass="com.mongodb.quickstart.Connection" -Dmongodb.uri="<connectionString>"
```

