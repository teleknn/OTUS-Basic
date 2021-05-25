package HomeWorkTesting.db;


import HomeWorkTesting.domain.Event;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.Map;

public class InMemoryEventsDb implements EventsDb {

    private final Map<Long, Event> eventMap;

    public InMemoryEventsDb() {
        eventMap = new HashMap<>();
        generateInitialData();
    }


    @Override
    public Event findById(long id) {
        return eventMap.get(id);
    }

    @Override
    public void saveEvent(Event event) {
        eventMap.put(event.getId(), event);
    }

    @Override
    public void deleteEventById(long id) {
        eventMap.remove(id);
    }

    private void generateInitialData() {
        //Объявление переменной без указния типа
        //Тоже самое что  LocalDateTime start = LocalDateTime.of(2021, 2, 2, 6, 0);
        var startTime = LocalDateTime.of(2021, 2, 2, 6, 0);
        for (int id = 1; id < 6; id++) {
            //Добавляем к новому событию 30 минут
            var endTime = startTime.plus(30, ChronoUnit.MINUTES);
            var event = new Event(id, startTime, endTime, "Event" + id);
            eventMap.put(event.getId(), event);
            startTime = endTime;
        }
    }
}