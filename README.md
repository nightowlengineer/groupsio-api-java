![alt text](https://groups.io/img/logofull.png "Groups.io logo")
# groupsio-api-java
Java client library for the [Groups.io](https://groups.io) API.

[![Build Status](https://travis-ci.org/lake54/groupsio-api-java.svg?branch=master)](https://travis-ci.org/lake54/groupsio-api-java)

[![GitHub license](https://img.shields.io/badge/license-AGPL-blue.svg)](https://raw.githubusercontent.com/lake54/groupsio-api-java/master/LICENSE)

## What is Groups.io?
Groups.io is a service that provides online communities and mailing lists - essentially a modern alternative to Yahoo! Groups.

See https://groups.io to find out more about the service.

## Download
As the project isn't yet available via Maven Central, install to your local repository:
```bash
git clone https://github.com/lake54/groupsio-api-java.git
cd groupsio-api-java
mvn install
```
... then add the dependency to your project's pom.xml:
```xml
<dependency>
    <groupId>com.github.lake54</groupId>
    <artifactId>groupsio-api-java</artifactId>
    <version>0.0.1-SNAPSHOT</version>
</dependency>
```

## API documentation
The client is based on the [API Docs](https://groups.io/static/api). As the API is under active development and not yet considered stable, the project will be updated as soon as possible after updates are published.

```java
GroupsIOApiClient client = new GroupsIOApiClient(apiKey, email);
```

### Login
Use the provided password to login to Groups.io and generate an API token, which will be stored in the client instance. The token is returned should you need it.

```java
String apiToken = client.user().login("password");
```

## Error Handling
The client will throw `GroupsIOApiException` when an error is returned by the Groups.io API, or if an internal error occurs.

With the API, only invalid_value will contain an 'extra' value, all other errors just return the error type.
```javascript
{
  type: "invalid_value",
  extra: "groupId"
}
```

## Issue Reporting
If you've found an issue or have a request with this client, please [create an issue](https://github.com/lake54/groupsio-api-java/issues/new).

If you have an issue or question about the API itself, a mailing list is available [here](https://beta.groups.io/g/api).

## Author
[James Milligan](https://github.com/lake54)

## Legal
This project is licensed under the GPLv3 license. See the [LICENSE](LICENSE) file for more info.

The Groups.io name and logo are copyright of Groups.io, Inc, and use of the service is subject to their [Terms of Service](https://groups.io/static/tos).
