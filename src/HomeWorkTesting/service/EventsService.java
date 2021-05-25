package HomeWorkTesting.service;

import HomeWorkTesting.db.EventsDb;
import HomeWorkTesting.domain.Event;

public class EventsService {

    private final EventsDb db;
    private final ServiceLogger logger;

    public EventsService(EventsDb db, ServiceLogger logger) {
        this.db = db;
        this.logger = logger;
    }

    public Event mergeTwoCloseEvents(long firstEventId, long secondEventId) {
        logger.log("Загрузка событий из БД");

        Event firstEvent = db.findById(firstEventId);
        Event secondEvent = db.findById(secondEventId);
        logger.log(String.format("Событие #1: %s", firstEvent));
        logger.log(String.format("Событие #2: %s", secondEvent));

        logger.log("Объединение событий");
        Event mergedEvent = new Event(firstEvent.getId(),
                firstEvent.getStart(),
                secondEvent.getEnd(),
                String.format("%s, %s", firstEvent.getName(), secondEvent.getName()));

        logger.log("Удаление старых событий");
        db.deleteEventById(firstEventId);
        db.deleteEventById(secondEventId);

        logger.log("Сохранение объединенного события");
        db.saveEvent(mergedEvent);

        return mergedEvent;
    }

    public Event mergeTwoCloseEventsCorrected(long firstEventId, long secondEventId) {
        if (firstEventId == secondEventId) {
            throw new IllegalArgumentException("firstEventId==secondEventId");
        }

        if (firstEventId > secondEventId) {
            throw new IllegalArgumentException("firstEventId > secondEventId");
        }
        logger.log("Загрузка событий из БД");

        Event firstEvent = db.findById(firstEventId);
        Event secondEvent = db.findById(secondEventId);
        logger.log(String.format("Событие #1: %s", firstEvent));
        logger.log(String.format("Событие #2: %s", secondEvent));

        logger.log("Объединение событий");
        //Изменил конечное событие от второго
        Event mergedEvent = new Event(secondEvent.getId(),
                firstEvent.getStart(),
                secondEvent.getEnd(),
                //Используем скобки вместо ковычек
                String.format("(%s, %s)", firstEvent.getName(), secondEvent.getName()));

        logger.log("Удаление старых событий");
        db.deleteEventById(firstEventId);
        db.deleteEventById(secondEventId);

        logger.log("Сохранение объединенного события");
        db.saveEvent(mergedEvent);

        return mergedEvent;
    }

}
