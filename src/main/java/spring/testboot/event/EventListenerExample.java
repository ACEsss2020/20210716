package spring.testboot.event;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.context.event.EventListener;

public class EventListenerExample {

    @EventListener
    public void handleApplicationReady(ApplicationReadyEvent applicationReadyEvent) {
        System.out.println("起動完了後、該当メソッドを呼び出される");
    }

    @EventListener
    public void handleApplicationStopped(ContextStoppedEvent contextStoppedEvent) {
        System.out.println("起動停止後、呼び出し");
    }

}
