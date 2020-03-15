[![Build Status](https://travis-ci.org/cosh/spring-boot-sqlserver-test.svg?branch=master)](https://travis-ci.org/cosh/spring-boot-sqlserver-test)

# spring boot sqlserver test on Azure

this is a small test project in order to verify the jdbc connection string for a MSSQL server on azure

## build
<pre><code>mvn clean package
</code></pre>


## run
set the following config parameter:
* sqlserver.test.database (the database name)
* sqlserver.test.node (the database host/node)
* spring.datasource.username
* spring.datasource.password

<pre><code>java -jar target/sqlserver-0.0.1-SNAPSHOT.jar --sqlserver.test.node=YOURDATABASENODE --sqlserver.test.database=YOURDATABASENAME --spring.datasource.username=YOURUSERNAME --spring.datasource.password=YOURPW
</code></pre>

## test

### create a new person
<pre><code>curl --user user:password  -X POST -d '{"name": "cosh", "salary": 23}' http://localhost:8080/person --header "Content-Type:application/json"
</code></pre>

### get all created persons
<pre><code>curl --user user:password  -X GET http://localhost:8080/person --header "Content-Type:application/json"
</code></pre>
