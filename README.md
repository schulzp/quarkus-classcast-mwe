# Minimal Working Example for ClassCastException in Quarkus 1.3.1.Final

Running `com.example.ExampleResourceTest` results in a `ClassCastException`:

```
java.lang.ClassCastException: class org.hamcrest.core.Is cannot be cast to class org.hamcrest.Matcher (
org.hamcrest.core.Is is in unnamed module of loader 'app';
org.hamcrest.Matcher is in unnamed module of loader io.quarkus.bootstrap.classloading.QuarkusClassLoader @3e11f9e9
)
```
