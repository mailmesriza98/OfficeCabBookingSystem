import model.CabType;
import service.CabScheduler;
import service.Registration;

public class Main {

    public static void main(String[] args){
        Registration reg = new Registration();
        reg.registercab("1234", "d1", CabType.SEDAN, 4);
        reg.registercab("1235", "d2", CabType.SEDAN, 4);
        reg.registercab("1236", "d3", CabType.SUV, 6);
        reg.registercab("1237", "d4", CabType.SUV, 6);

        reg.registerEmployee("1", "e1");
        reg.registerEmployee("2", "e1");
        reg.registerEmployee("3", "e1");
        reg.registerEmployee("4", "e1");
        reg.registerEmployee("5", "e1");
        reg.registerEmployee("6", "e1");
        reg.registerEmployee("7", "e1");
        reg.registerEmployee("8", "e1");

        CabScheduler cabScheduler = new CabScheduler();
        cabScheduler.schedule_cab("1", "9:00");
        cabScheduler.schedule_cab("2", "9:00");
        cabScheduler.schedule_cab("3", "9:00");
        cabScheduler.schedule_cab("4", "9:00");

    }

}
