import model.CabType;
import service.CabScheduler;

public class Main {

    public static void main(String[] args){
       // Registration reg = new Registration();
        CabScheduler cabScheduler = new CabScheduler();
        cabScheduler.registercab("1234", "d1", CabType.SEDAN, 4);
        cabScheduler.registercab("1235", "d2", CabType.SEDAN, 4);
        cabScheduler.registercab("1236", "d3", CabType.SUV, 6);
        cabScheduler.registercab("1237", "d4", CabType.SUV, 6);


        cabScheduler.schedule_cab("1", "9:00");
        cabScheduler.schedule_cab("2", "9:00");
        cabScheduler.schedule_cab("3", "10:00");
        cabScheduler.schedule_cab("4", "10:00");
        cabScheduler.schedule_cab("5", "9:00");
        cabScheduler.schedule_cab("6", "9:00");
        cabScheduler.schedule_cab("7", "9:00");

    }

}
