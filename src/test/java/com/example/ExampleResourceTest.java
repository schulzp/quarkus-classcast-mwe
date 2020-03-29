package com.example;

import java.util.Map;
import java.util.stream.Stream;

import io.quarkus.test.junit.QuarkusTest;
import org.hamcrest.Matcher;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
class ExampleResourceTest {

    @ParameterizedTest
    @MethodSource("args")
    void testHelloEndpoint(Map<String, Matcher<?>> tests) {
        tests.forEach((path, matcher) -> {
            given()
              .when().get(path)
              .then()
                 .statusCode(200)
                 .body(matcher);
        });
    }

    static Stream<Arguments> args() {
        return Stream.of(Arguments.of(Map.of("/hello", is("hello"))));
    }

}
