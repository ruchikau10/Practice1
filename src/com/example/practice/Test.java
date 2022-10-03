package com.example.practice;

 class Queue {
     int rear, front, size;
     int capacity;
     int arr[];

     public Queue(int capacity) {
         this.capacity = capacity;
         front = this.size = 0;
         rear = capacity - 1;
         arr = new int[this.capacity];  //array element till capacity
     }

     //when size is full
     boolean QueueFull(Queue queue) {
         return (queue.size == queue.capacity);
     }

     //queue is empty
     boolean EmptyQueue(Queue queue) {
         return (queue.size == 0);
     }

     //Enqueue: will add the element
     void Enqueue(int item) {
         if (QueueFull(this))
             System.out.println("Queue is full");
         this.rear = (this.rear + 1) % capacity;
         this.arr[this.rear] = item;
         this.size = this.size + 1;
         System.out.println("Enqueued to the queue:" + item);
     }

     //Dequeue : will change the front and capacity
     int Dequeue() {
         if (EmptyQueue(this))
             return Integer.MIN_VALUE;
         int item = this.arr[this.front];
         this.front = (this.front + 1) % capacity;
         this.size = this.size - 1;
         return item;
     }
 }

    public class Test{
    public static void main(String[] args) {
         Queue queue= new Queue(20);

         queue.Enqueue(10);
         queue.Enqueue(20);
         queue.Enqueue(30);

        System.out.println("Dequeue from the list:" + queue.Dequeue());
    }
}
