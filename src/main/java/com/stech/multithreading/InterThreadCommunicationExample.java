package com.stech.multithreading;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by sandeeplulla
 */
public class InterThreadCommunicationExample {
    public static void main(String[] args) throws InterruptedException {
        ArrayList arrayList = new ArrayList();
        for(int i=0; i<100; i++) {
            arrayList.add("S" + i);
        }

        for(int i=0; i<100; i++) {
            arrayList.add("B" + i);
        }

        MyInterThread t1 = new MyInterThread(arrayList, "S");
        t1.start();
        synchronized (t1) {
            t1.wait();
        }

        MyInterThread t2 = new MyInterThread(arrayList, "B");
        t2.start();

        synchronized (t2) {
            t2.wait();
        }

        System.out.println("Size of arraylist : " + arrayList.size());
    }
}

class MyInterThread extends Thread {
    private ArrayList arrayList;
    private String strToRemove;

    public MyInterThread(ArrayList arrayList, String strToRemove) {
        this.arrayList = arrayList;
        this.strToRemove = strToRemove;
    }

    public void run() {
        try {
            removeElements();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void removeElements() throws InterruptedException {
        synchronized (arrayList) { //remove this synchronized block to see concurrentmodificaitonexception
            Iterator it = arrayList.iterator();

            while (it.hasNext()) {
                String s = (String) it.next();

                if (s.contains(strToRemove)) {
                    it.remove();
                    System.out.println("Removed element : " + s);
                }
            }
            arrayList.notify();
        }
    }
}