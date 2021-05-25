package HomeWorkTesting.test;

import HomeWorkTesting.db.EventsDb;
import HomeWorkTesting.domain.Event;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class EventsDbMock implements EventsDb {
    public static final String EVENT_1 = "Event1";
    public static final String EVENT_2 = "Event2";
    private final LocalDateTime startTime = LocalDateTime.of(2021, 2, 2, 6, 0);
    private final LocalDateTime endTime = startTime.plus(30, ChronoUnit.MINUTES);
    private final LocalDateTime startTime2 = endTime;
    private final LocalDateTime endTime2 = startTime2.plus(30, ChronoUnit.MINUTES);

    @Override
    public Event findById(long id) {

        if (id == 1) {
            return new Event(1, startTime, endTime, EVENT_1);
        }
        if (id == 2) {
            return new Event(2, startTime2, endTime2, EVENT_2);
        }
        throw new IllegalArgumentException();
    }

    @Override
    public void saveEvent(Event event) {
    }

    @Override
    public void deleteEventById(long id) {
    }
}
