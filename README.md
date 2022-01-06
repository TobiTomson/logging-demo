# Remoting Example

The projects contains a simple spring boot application reachable on port 8888.

## Build and Run

### Build

```shell
./gradlew bootBuildImage --imageName=test/logging-demo
```

### Run

```shell
docker run -d -p 8888:8888 --name logging --rm test/logging-demo
```

### log file location in container

```
/tmp/spring.log
```