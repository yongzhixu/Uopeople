package edu.uopeople.cs3303datastructures.unit3;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;

import java.util.Date;

/**
 * StackCarInspection Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>07/07/2021</pre>
 */
@Slf4j
public class StackCarInspectionTest {

    @BeforeEach
    public void before() throws Exception {
        log.info("test start at {}", new Date().getTime());
    }

    @AfterEach
    public void after() throws Exception {
        log.info("test end at {}", new Date().getTime());
    }

    /**
     * Method: isEmpty()
     */
    @Test
    public void testIsEmpty() throws Exception {
//TODO: Test goes here...

        StackCarInspection<Integer> stackCarInspection = new StackCarInspection<>();
        Assertions.assertTrue(stackCarInspection.isEmpty());
        stackCarInspection.push(1);
        Assertions.assertFalse(stackCarInspection.isEmpty());
        stackCarInspection.pop();
        Assertions.assertTrue(stackCarInspection.isEmpty());
    }

    /**
     * Method: push(int x)
     */
    @Test
    public void testPush() throws Exception {
//TODO: Test goes here...
        StackCarInspection<Integer> stackCarInspection = new StackCarInspection<>();
        stackCarInspection.push(1);
        Assertions.assertEquals(stackCarInspection.top, 0);
        stackCarInspection.push(12);
        Assertions.assertEquals(stackCarInspection.top, 1);
        Assertions.assertEquals(stackCarInspection.pop(), 12);
    }

    /**
     * Method: pop()
     */
    @Test
    public void testPop() throws Exception {
//TODO: Test goes here...
        StackCarInspection<Integer> stackCarInspection = new StackCarInspection<>();
        stackCarInspection.push(1);
        stackCarInspection.push(12);
        Assertions.assertEquals(stackCarInspection.pop(), 12);
    }

    /**
     * Method: peek()
     */
    @Test
    public void testPeek() throws Exception {
//TODO: Test goes here...
        StackCarInspection<Integer> stackCarInspection = new StackCarInspection<>();
        stackCarInspection.push(12);
        Assertions.assertEquals(stackCarInspection.peek(), 12);
    }


} 
