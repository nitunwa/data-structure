package com.example.demodatastructure.queueIMP;

import java.util.Arrays;

public class ArrayQueue {
    int rear;
    int size;
    int[] arr;

    ArrayQueue(int size) {
        this.rear = -1;
        this.size = size;
        this.arr = new int[size];
    }
    boolean arrQueFull() {
        return rear == (size-1);
    }

    // enqueue into array
    // O(1), O(n) worst case (due to resizing)
    void addArrQue(int data) {
       //  rear++;
        if(!arrQueFull()) {
            rear++;
            arr[rear] = data;
        }
    }

    // dequeue from the array at arr[0] and shift indexes
    // O(n) --> limitation
    int  removeArrQue() {

        if(rear == -1) return -1;

        int front = arr[0];
        for(int i=0; i<size -1; i++) {
            arr[i] = arr[i+1];
        }
        arr[rear] = 0;
        rear--;
        return front;
    }

    // return element without remove. O(1)
    int peekArrQue() {
        if(arrQueFull()) return -1;
        return arr[0];
    }

    void printArrQue() {
        System.out.println(Arrays.toString(arr));

    }
}
