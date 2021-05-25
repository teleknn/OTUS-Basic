package HomeWorkTesting;


import HomeWorkTesting.db.EventsDb;
import HomeWorkTesting.db.InMemoryEventsDb;
import HomeWorkTesting.service.ConsoleServiceLogger;
import HomeWorkTesting.service.EventsService;
import HomeWorkTesting.service.ServiceLogger;

public class Demo {
    public static void main(String[] args) {
        EventsDb eventsDb = new InMemoryEventsDb();
        ServiceLogger serviceLogger = new ConsoleServiceLogger();
        EventsService eventsService = new EventsService(eventsDb, serviceLogger);

        System.out.println(eventsService.mergeTwoCloseEvents(1, 2));
        //System.out.println(eventsService.mergeTwoCloseEventsCorrected(1, 2));

    }
}
