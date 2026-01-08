package org.example.structure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    @Test
    void shouldBeEmptyWhenCreated() {
        var stack = new Stack<Integer>();
        assertTrue(stack.isEmpty());
    }

    @Test
    void shouldNotBeEmptyAfterPush() {
        var stack = new Stack<Integer>();
        stack.push(1);
        assertFalse(stack.isEmpty());
    }

    @Test
    void shouldCarryItem() {
        var stack = new Stack<Integer>();
        stack.push(5);
        assertEquals(5, stack.pop());
    }

    @Test
    void shouldCarryStringItems() {
        var stack = new Stack<String>();
        stack.push("hello");
        stack.push("world");
        stack.push("!");
        assertEquals("!", stack.pop());
        assertEquals("world", stack.pop());
        assertEquals("hello", stack.pop());
    }

    @Test
    void shouldFollowLifoFor1000Items() {
        var stack = new Stack<Integer>();
        for (int i = 0; i < 1000; i++) {
            stack.push(i);
        }
        for (int i = 999; i >= 0; i--) {
            assertEquals(i, stack.pop());
        }
        assertTrue(stack.isEmpty(), "Stack should be empty after popping all items");
    }

}