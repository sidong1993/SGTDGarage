package com.sg.tdgarage.event;

import java.util.PriorityQueue;

public class EventRecorder {
    private static PriorityQueue<Event> eventQueue = new PriorityQueue<>();

    public static void record(Event event){
        eventQueue.add(event);
    }

    public static void print() {
        while(!eventQueue.isEmpty()){
            Event event = eventQueue.poll();
            event.action();
        }
    }
}
