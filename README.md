# Decision Starter

## Run it

```
mvn clean compile exec:java
```

## Change it

Edit `src/main/java/org/camunda/bpm/dmn/DecisionStarter.java`

## Note

Due this example uses a SNAPSHOT dependency it is required that maven
has at least the sonatype or camunda snapshot repository configured.
For example see the `settings.xml` how to configure the camunda snapshot
repository. Or use it directly with:

```
mvn -s settings.xml clean compile exec:java
```
