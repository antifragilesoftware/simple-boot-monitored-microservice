# Sample Monitored Spring Boot Service using New Relic

## Prerequisites

* Yoou will need an account on New Relic.

* You need to download a suitable newrelic.yaml and to place that, with the appropriate entry for your New Relic license key, into the root directory of this service before running/packaging it.

## To Build into Docker using Maven

First make sure you're running in an environment that has docker available to you. Then execute:

$ ./mvnw package docker:build

Once completed you will have an antifragilesoftware/simple-boot-monitored-microservice image available, as seen by executing:

$ docker images

```
REPOSITORY                         TAG                 IMAGE ID            CREATED             SIZE
antifragilesoftware/simple-boot-monitored-microservice   latest              6efd07dc12fc        5 seconds ago       667.1 MB
```

## Sources

* Used [this article's instructions](http://www.kubrynski.com/2014/12/include-java-agent-in-standalone-spring.html) to integrate the New Relic library into the container-less Spring Boot runtime.