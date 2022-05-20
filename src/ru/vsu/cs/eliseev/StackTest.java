package ru.vsu.cs.eliseev;

import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {

    @Test
    public void empty() {
        Stack<String> test = new Stack<>();

        assertTrue(test.empty());
    }

    @Test
    public void push() throws Exception {
        Stack<String> test = new Stack<>();

        test.push("Hello, Word");
        String actual = test.peek();

        assertEquals("Hello, Word", actual);
    }

    @Test
    public void pop() throws Exception {
        Stack<Double> test = new Stack<>();

        test.push(20.0);
        test.push(30.8);
        test.push(40.8);
        test.push(50.45);
        Double expected = 50.45;

        assertEquals(expected, test.pop());
    }

    @Test
    public void peek() throws Exception {
        Stack<String> test = new Stack<>();

        test.push("6 буби");
        test.push("6 черви");
        test.push("6 пики");
        test.push("6 крести");
        test.pop();

        assertEquals("6 пики", test.peek());
    }

    @Test
    public void search() throws Exception {
        Stack<String> test = new Stack<>();

        test.push("6 буби");
        test.push("6 черви");
        test.push("6 пики");
        test.push("6 крести");
        test.pop();

       // assertEquals(2, test.search("6 черви"));
    }
}