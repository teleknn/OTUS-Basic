package HomeWorkTesting.db;


import HomeWorkTesting.domain.Event;

public interface EventsDb {
    Event findById(long id);
    void saveEvent(Event event);
    void deleteEventById(long id);
}
