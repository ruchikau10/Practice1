package com.example.practice;

public class StackAppl {
    public static void main(String[] args) {
        StackImpl stack = new StackImpl();
        stack.push(1);
        stack.push(4);
        stack.push(5);
        System.out.println(stack.pop());

    }
}
