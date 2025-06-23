package com.example.demodatastructure.queueIMP;

import java.util.Arrays;

public class CircularArrQueue {
    int front;
    int rear;
    int size;
    int[] arr;

    CircularArrQueue(int size) {
        this.size=size;
        this.arr= new int[size];
        this.front = -1;
        this.rear = -1;
    }

    boolean isFull() {
        return (rear + 1) % size == front;
    }

    void AddEleToCirQue(int data) {
        if(isFull()) return;
        if(front == -1) {
            front++;
        }
        rear = (rear + 1) % size;
        arr[rear] = data;
    }

     int removeCirQue() {
        if(front == -1) return -1;
        int res = arr[front];
        arr[front] = 0;
        front = (front+1) % size;
        System.out.println("res ---  "+res);
        return  res;
    }

    void print() {
        System.out.println(Arrays.toString(arr));
    }
}
