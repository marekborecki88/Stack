package org.example.structure;

public class Stack<T> {

    private Element top;

    public void push(T value) {
        this.top = new Element(value, this.top);
    }

    public T pop() {
        var currentTop = this.top.value;
        this.top = this.top.previous;
        return currentTop;
    }

    public boolean isEmpty() {
        return this.top == null;
    }

    private class Element {
        T value;
        Element previous;

        public Element(T value, Element previous) {
            this.value = value;
            this.previous = previous;
        }
    }
}
