# Phone API
## Functional Specification
Phone API has 1 endpoint `/phones`, which returns a couple of mobile phones like iPhone 7, Samsung Galaxy S7 etc. with some simple attributes like product image (just take some off of google images), title, description, color, price etc.

## Technical Specification
Gradle 3 java web application.
* Spring boot (REST)
* Jackson
* HSQLDB

## API documentation
Launch `/swagger-ui.html` resource.

## Run from local
Build and run with
```
gradle clean build && java -jar ./build/libs/phone-api-1.0.1.jar
```
## Run with docker
Image is published in docker hub

You can run it with docker
```
docker run --rm -p 8080:8080 luchoct/phone-api:1.0.1
```
Published port should be `8080` as that is the port used by phone-web website.

### Create image and push image to registry
```
gradle build buildDocker
```

# Changelog
* 2017-06-13 Version 1.0 Initial version

# Areas of improvement
* Use HTTPs
* Authenticate the client
* Do not use an in-memory data store for production
* Define production and stage environments

