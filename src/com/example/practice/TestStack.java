package com.example.practice;

import java.util.Stack;

class TestStack {
  static class StackFunc {
    static Stack<Integer> stack1 = new Stack<>();
    static Stack<Integer> stack2 = new Stack<>();

    //Move all element to stack2
    static void Enqueue(int element) {
      while (!stack1.isEmpty())
      {
      stack2.push(stack1.pop());
      }
      stack1.push(element);

      while(!stack2.isEmpty())
      {
        stack1.push(stack2.pop());
      }
      System.out.println("Enqueued elements:" +element);
    }

      //Dequeue from stack
    static int Dequeue(){
      while (stack1.isEmpty())
      {
        System.out.println("Stack is empty");
      }
      int element= stack1.peek();
      stack1.pop();
      return element;
    }
  };

    public static void main(String[] args) {
        StackFunc s= new StackFunc();
        s.Enqueue(12);
        s.Enqueue(13);
        s.Enqueue(15);

      System.out.println(s.Dequeue() + " : Dequeued from stack");
      System.out.println(s.Dequeue() + " : Dequeued from stack");
    }
}
