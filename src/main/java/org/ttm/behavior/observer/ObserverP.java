package org.ttm.behavior.observer;

import java.util.ArrayList;
import java.util.List;

public class ObserverP {
    public static void main(String[] args) {
        Publisher publisher = new Publisher();
        Listener listener = new Listener();
        publisher.subscribe(listener);
        publisher.logic();
        listener.unsubscribe(publisher);
        publisher.logic();
    }
}

class Publisher{
    public List<Listener> listeners;

    public String state;

    public Publisher() {
        this.listeners = new ArrayList<>();
        this.state = "START";
    }

    public void subscribe(Listener listener){
        listeners.add(listener);
    }

    public void unSubscribe(Listener listener){
        boolean removed = listeners.remove(listener);
        System.out.println("removed = " + removed);
    }

    public void logic(){
        // result logic
        var result = state ;
        notify(result);
    }
    public void notify(Object toNotified){
        for (Listener l:listeners) {
            l.update(toNotified);
        }
    }

}

interface IListener{
    void update(Object info);
    void unsubscribe(Publisher publisher);
}

class Listener implements IListener{

    public Listener() {
    }

    public void unsubscribe(Publisher publisher){
        publisher.unSubscribe(this);
    }

    public void update(Object info){
        // do something
        System.out.println(info);
    }
}
