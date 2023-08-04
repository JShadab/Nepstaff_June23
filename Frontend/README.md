# QuarkusLab

## Commands
### Quarkus CLI 
    quarkus ext add io.quarkus:<extension-name>
### Maven
    ./mvnw quarkus:add-extension -Dextensions="io.quarkus:<extension-name>"
### Gradle
    ./gradlew addExtension --extensions="io.quarkus:<extension-name>"
---------------------------------------------------------------------
## Extensions
### *./mvnw quarkus:add-extension -Dextensions="io.quarkus:__<extension_name>__"*

- ### **quarkus-smallrye-graphql** | GRAPHQL - *Create GraphQL Endpoints using the code-first approach from MicroProfile GraphQL*
- ### **quarkus-smallrye-graphql-client** | GRAPHQL CLIENT - *Create GraphQL Clients*
- ### **quarkus-smallrye-openapi** | OPENAPI - *Document your REST APIs with OpenAPI - comes with Swagger UI*
- ### **quarkus-smallrye-reactive-messaging-kafka** | REACTIVE MESSAGING - KAFKA - *Connect to Kafka with Reactive Messaging*
- ### **quarkus-smallrye-metrics** | METRICS - *Expose metrics for your services*
- ### **quarkus-smallrye-jwt** | JWT - *Secure your applications with JSON Web Token*
- ### **quarkus-smallrye-fault-tolerance** | FAULT TOLERANCE - *Define fault-tolerant services*
- ### **quarkus-smallrye-reactive-messaging** | REACTIVE MESSAGING - *Produce and consume messages and implement event driven and data streaming applications*
-------------------------------------------------
- ### **quarkus-arc** | ARC - *Build time CDI dependency injection*
- ### **quarkus-hibernate-orm** | HIBERNATE ORM - *Define your persistent model with Hibernate ORM and JPA*
- ### **quarkus-hibernate-reactive** | HIBERNATE REACTIVE - *A reactive API for Hibernate ORM, supporting non-blocking database drivers and a reactive style of interaction with the database.*
- ### **quarkus-flyway** | FLYWAY - *Handle your database schema migrations*
- ### **quarkus-amazon-lambda** | AWS LAMBDA - *Write AWS Lambda functions*
- ### **quarkus-quarkus-grpc** | GRPC - *Serve and consume gRPC services*
- ### **quarkus-mutiny** | MUTINY - *Write reactive applications with the modern Reactive Programming library Mutiny*
- ### **quarkus-reactive-pg-client** | REACTIVE POSTGRESQL CLIENT - *Connect to the PostgreSQL database using the reactive pattern*
-----------------------------
    SELECT CONF.NAME AS CONFIGURATION,  CASE WHEN (HPOURSTABLE.Q1 IS NOT NULL OR HPOURSTABLE.Q1 <> 0) THEN CONCAT("$",CAST(ROUND((HPOURSTABLE.Q1)*(SUBSTRING(CONF.PRICE, 2, LENGTH(CONF.PRICE)-6)),3) AS DECIMAL(10,3))," = ",HPOURSTABLE.Q1," hours * ",CONF.PRICE) ELSE NULL END AS "Q1'21",  CASE WHEN (HPOURSTABLE.Q2 IS NOT NULL OR HPOURSTABLE.Q2 <> 0) THEN CONCAT("$",CAST(ROUND((HPOURSTABLE.Q2)*(SUBSTRING(CONF.PRICE, 2, LENGTH(CONF.PRICE)-6)),3) AS DECIMAL(10,3))," = ",HPOURSTABLE.Q2," hours * ",CONF.PRICE) ELSE NULL END AS "Q2'21",CASE WHEN (HPOURSTABLE.Q3 IS NOT NULL OR HPOURSTABLE.Q3 <> 0) THEN CONCAT("$",CAST(ROUND((HPOURSTABLE.Q3)*(SUBSTRING(CONF.PRICE, 2, LENGTH(CONF.PRICE)-6)),3) AS DECIMAL(10,3))," = ",HPOURSTABLE.Q3," hours * ",CONF.PRICE) ELSE NULL END AS "Q3'21",  CASE WHEN (HPOURSTABLE.Q4 IS NOT NULL OR HPOURSTABLE.Q4 <> 0) THEN CONCAT("$",CAST(ROUND((HPOURSTABLE.Q4)*(SUBSTRING(CONF.PRICE, 2, LENGTH(CONF.PRICE)-6)),3) AS DECIMAL(10,3))," = ",HPOURSTABLE.Q4," hours * ",CONF.PRICE) ELSE NULL END AS "Q4'21" FROM CONFIGURATIONS CONF,  (SELECT ID,
       MAX(CASE WHEN SEQNUM = 1 then HOURS end) as Q1,
       MAX(CASE WHEN SEQNUM = 2 then HOURS end) as Q2,
        MAX(CASE WHEN SEQNUM = 3 then HOURS end) as Q3,
       MAX(CASE WHEN SEQNUM = 4 then HOURS end) as Q4 FROM (SELECT t.*,              ROW_NUMBER() OVER (PARTITION BY ID ORDER BY (SELECT QUARTER)) AS SEQNUM
      from (SELECT CONFIGURATION_ID ID,CASE QUARTER(DT_START)   WHEN 1 THEN 'Q1' 
        WHEN 2 THEN 'Q2'
          WHEN 3 THEN 'Q3'
            WHEN 4 THEN 'Q4'  END AS QUARTER, SUM(CEILING(TIMESTAMPDIFF(SECOND, DT_START, DT_END)/3600)) AS HOURS FROM DEPLOYMENTS WHERE YEAR(DT_START) = 2021 AND YEAR(DT_END) =2021  GROUP BY ID,QUARTER ORDER BY ID,QUARTER) t)
            t GROUP BY ID) AS HPOURSTABLE WHERE HPOURSTABLE.ID = CONF.ID ORDER BY CONF.PRICE;



