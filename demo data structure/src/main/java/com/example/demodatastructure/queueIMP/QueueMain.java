package com.example.demodatastructure.queueIMP;

import com.example.demodatastructure.queueIMP.ArrayQueue;

public class QueueMain {
    public static void main(String[] args) {
        ArrayQueue arrayQueue = new ArrayQueue(3);

        /*arrayQueue.addArrQue(10);
        arrayQueue.addArrQue(100);
        arrayQueue.addArrQue(200);
        arrayQueue.printArrQue();
        System.out.println(" +++++++++++++++++++ ");

        arrayQueue.removeArrQue();
        arrayQueue.printArrQue();
        arrayQueue.addArrQue(500);
        System.out.println(" --------------------- ");
        arrayQueue.printArrQue();*/

        /*CircularArrQueue circularArrQueue = new CircularArrQueue(3);
        circularArrQueue.AddEleToCirQue(10);
        circularArrQueue.AddEleToCirQue(80);
        circularArrQueue.AddEleToCirQue(90);
        circularArrQueue.AddEleToCirQue(900);

        circularArrQueue.print();

        circularArrQueue.removeCirQue();

        circularArrQueue.print();

        circularArrQueue.AddEleToCirQue(900);
        circularArrQueue.print();*/

        SingleLinkedListQue test = new SingleLinkedListQue();
        test.insertRearNode(3);
        test.insertRearNode(5);
        test.insertRearNode(7);

        test.display();

        test.removeFront();
        test.removeFront();
        test.removeFront();
        test.display();

    }
}
