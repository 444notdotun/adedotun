package dba;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyStackTest {
    MyStack stack;
    @Before
    public void setUp(){
       stack = new MyStack();
    }

    @Test
    public void MyStack_IsEmptyTest(){
        assertTrue(stack.isEmpty());
    }

    @Test
    public void Mystack_isNotEmptyTest(){
        stack.add("ade");
        assertFalse(stack.isEmpty());
    }

    @Test
    public void Mystack_canPopElementsTest() {
        stack.add("ade");
        assertEquals("ade", stack.pop());

    }

    @Test
    public void Mystack_canDoLastInFirstOutTest() {
        stack.add("ade");
        stack.add("adenike");
        stack.add("adefemi");
        stack.add("adeniyi");
        assertEquals("adeniyi", stack.pop());
    }

    @Test
    public void Mystack_canNotPopWhenEmptyTest(){
        assertThrows(Exception.class, ()->stack.pop());
    }

    @Test
    public void Mystack_canPeekTest(){
        stack.add("ade");
        stack.peek();
        stack.add("never");

        assertEquals("never",stack.peek());
    }

    @Test
    public void Mystack_canNotPeekWhenStackIsEmptyTest(){
        assertThrows(Exception.class, ()->stack.peek());
    }




}
