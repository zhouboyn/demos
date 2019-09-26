package thisescape;

import java.util.ArrayList;
import java.util.List;

/**
 * @desc:
 * @author: zhoubo
 * @date: 2019-02-22
 **/

/**
 * this 对象逸出
 * 1. 线程a还未构造好对象之前就注册了监听器
 * 2. 线程b触发了event事件,就调用this.doSomething函数，造成空指针异常
 *
 * 相当于在对象成功构造成功之前，就把this引用拿给外界调用了。
 */
public class ThisEscape {


    private final List<Event> listOfEvents;


    public ThisEscape(EventSource source) {
        source.registerListener(new EventListener() {
            @Override
            public void onEvent(Event e) {
                doSomething(e);
            }
        });

        listOfEvents = new ArrayList<>();
    }

    void doSomething(Event e) {
        listOfEvents.add(e);
    }

    interface  EventSource{
        void registerListener(EventListener e);
    }

    interface EventListener {
        void onEvent(Event e);
    }

    interface Event{

    }
}
