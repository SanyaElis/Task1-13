package ru.vsu.cs.eliseev;

public class Program {

    public static void main(String[] args) throws Exception {

        Stack<Double> test = new Stack<>();

        test.push(20.0);
        test.push(30.8);
        test.push(40.8);
        test.push(50.45);

        test.print();


        System.out.println("-----------------------------------");
        System.out.println(test.pop());
        System.out.println("-----------------------------------");

        test.print();

        System.out.println("-----------------------------------");
        System.out.println(test.peek());

        System.out.println("-----------------------------------");
        System.out.println(test.peek());
        System.out.println("-----------------------------------");
        test.print();


        System.out.println(test.pop());
        System.out.println(test.pop());
        System.out.println(test.pop());
        test.push(2.0);
        test.push(1.0);

        System.out.println(test.pop());
        System.out.println(test.pop());

    }
}
