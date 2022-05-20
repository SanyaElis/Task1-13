package ru.vsu.cs.eliseev;

class Node<T> {

    final T data;
    private Node<T> next;

    public Node(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}

public class Stack<T> implements StackInterface<T> {
    private Node<T> head;

    public Stack() {
        head = null;
    }

    /**
     * @return empty Stack?
     */
    public boolean empty() {
        return head == null;
    }

    /**
     Inserts the specified element into this queue
     */
    public void push(T data) {
        Node<T> temp = new Node<>(data);
        temp.setNext(head);
        head = temp;
    }

    /**
     * @return Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
     * @throws Exception если stack пустой
     */
    public T pop() throws Exception {
        if (empty()) {
            throw new Exception("Stack is empty");
        }
        T temp = head.getData();
        head = head.getNext();
        return temp;

    }

    /**
     * @return возвращает верхний элемент стека
     * @throws Exception если stack пустой
     */
    public T peek() throws Exception {
        if (empty()) {
            throw new Exception("Stack is empty");
        }
        return head.getData();
    }

    public void print() {
        Node<T> temp = head;

        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }

    @Override
    public String toString() {
        return "Stack{" +
                "head=" + head +
                '}';
    }
}
