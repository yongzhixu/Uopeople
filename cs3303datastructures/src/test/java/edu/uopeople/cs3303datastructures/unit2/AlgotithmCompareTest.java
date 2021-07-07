package edu.uopeople.cs3303datastructures.unit2;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;
import org.springframework.test.context.event.annotation.BeforeTestClass;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * AlgotithmCompare Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>07/07/2021</pre>
 */
@Slf4j
public class AlgotithmCompareTest {

    @BeforeAll
    static void beforeAll() {

        log.info("before all");
    }

    @BeforeTestClass
    public void beforeTestClass() {

        log.info("before beforeTestClass");
    }

    @BeforeEach
    public void before() throws Exception {
        log.info("before each");
    }

    @AfterEach
    public void after() throws Exception {
        log.info("after each");
    }

    /**
     * Method: main(String[] args)
     */
    @Test
    public void testMain() throws Exception {
//TODO: Test goes here...
        log.info("234234234");
    }

    @Override
    public String toString() {
        return "AlgotithmCompareTest{}";
    }
}
