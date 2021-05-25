package HomeWorkTesting.test;

import HomeWorkTesting.db.EventsDb;
import HomeWorkTesting.domain.Event;
import HomeWorkTesting.service.EventsService;
import HomeWorkTesting.service.ServiceLogger;
import HomeWorkTesting.test.assertions.Assertion;

public class EventServiceTest {

    public class InsteadLambda implements Runnable {
        private final EventsService eventsService;

        public InsteadLambda(EventsService eventsService) {
            this.eventsService = eventsService;
        }

        @Override
        public void run() {
            eventsService.mergeTwoCloseEvents(1L, 1L);
        }
    }

    //1переданы одинаковые параметры
    public void testThrowExceptionIfEqPrm() {
        EventsDb db = new EventsDbMock();
        ServiceLogger logger = new ConsoleServiceLoggerDummy();
        EventsService eventsService = new EventsService(db, logger);
        //Assertion.assertThrows(IllegalArgumentException.class, () -> eventsService.mergeTwoCloseEvents(1L, 1L));
        Assertion.assertThrows(IllegalArgumentException.class, new InsteadLambda(eventsService));
    }

    //1переданы одинаковые параметры, корректный
    public void testThrowExceptionIfEqPrmCorrect() {
        EventsDb db = new EventsDbMock();
        ServiceLogger logger = new ConsoleServiceLoggerDummy();
        EventsService eventsService = new EventsService(db, logger);
        //Assertion.assertThrows(IllegalArgumentException.class, () -> eventsService.mergeTwoCloseEventsCorrected(1L, 1L));
        Assertion.assertThrows(IllegalArgumentException.class, new Runnable() {
            @Override
            public void run() {
                eventsService.mergeTwoCloseEventsCorrected(1L, 1L);
            }
        });
    }

    //2первое значение больше второго
    public void testFirstParamGtSecondPrm() {
        EventsDb db = new EventsDbMock();
        ServiceLogger logger = new ConsoleServiceLoggerDummy();
        EventsService eventsService = new EventsService(db, logger);
        Assertion.assertThrows(IllegalArgumentException.class, () -> eventsService.mergeTwoCloseEvents(2L, 1L));
    }

    //2первое значение больше второго, корректный
    public void testFirstParamGtSecondPrmCorrect() {
        EventsDb db = new EventsDbMock();
        ServiceLogger logger = new ConsoleServiceLoggerDummy();
        EventsService eventsService = new EventsService(db, logger);
        Assertion.assertThrows(IllegalArgumentException.class, () -> eventsService.mergeTwoCloseEventsCorrected(2L, 1L));
    }
    //3после объединнения id от второго события
    public void testResultIdEvent() {
        EventsDb db = new EventsDbMock();
        ServiceLogger logger = new ConsoleServiceLoggerDummy();
        EventsService eventsService = new EventsService(db, logger);
        Event event = eventsService.mergeTwoCloseEvents(1L, 2L);
        Assertion.assertEquals(2L, event.getId());
    }
    //3после объединнения id от второго события, корректный
    public void testResultEventIdCorrect() {
        EventsDb db = new EventsDbMock();
        ServiceLogger logger = new ConsoleServiceLoggerDummy();
        EventsService eventsService = new EventsService(db, logger);
        Event event = eventsService.mergeTwoCloseEventsCorrected(1L, 2L);
        Assertion.assertEquals(2L, event.getId());
    }
    //4правильность имени обьеденного события
    public void testResultEventMessage() {
        EventsDb db = new EventsDbMock();
        ServiceLogger logger = new ConsoleServiceLoggerDummy();
        EventsService eventsService = new EventsService(db, logger);
        Event event = eventsService.mergeTwoCloseEvents(1L, 2L);
        Assertion.assertEquals("(" + EventsDbMock.EVENT_1 + ", " + EventsDbMock.EVENT_2 + ")",
                event.getName());
    }
    //4правильность имени обьеденного события, корректный
    public void testResultEventMessageCorrect() {
        EventsDb db = new EventsDbMock();
        ServiceLogger logger = new ConsoleServiceLoggerDummy();
        EventsService eventsService = new EventsService(db, logger);
        Event event = eventsService.mergeTwoCloseEventsCorrected(1L, 2L);
        Assertion.assertEquals("(" + EventsDbMock.EVENT_1 + ", " + EventsDbMock.EVENT_2 + ")",
                event.getName());
    }
}
