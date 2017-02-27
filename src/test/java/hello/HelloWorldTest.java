package hello;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Project: myfirstweb
 * FileName: HelloWorldTest
 * Date: 2017-02-27
 * Time: 오전 10:29
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class HelloWorldTest {
    @Test
    public void message() throws Exception {
        HelloWorld hw = new HelloWorld();
        assertEquals("Hello World", hw.message());
    }
}