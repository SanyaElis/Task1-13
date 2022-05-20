package ru.vsu.cs.eliseev;

public interface StackInterface<T> {

    boolean empty();

    void push(T data);

    T pop() throws Exception;

    T peek() throws Exception;

    void print();

    String toString();
}
