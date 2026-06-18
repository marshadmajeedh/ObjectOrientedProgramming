import entity.Record;
import service.ModuleService;

public class Main {
    public static void main(String[] args) {

        Record record1 = new Record(2004, "Marshad", 4, "A");
        Record record2 = new Record(2005, "Ahamed", 4, "B");
        Record record3 = new Record(2006, "Nasry", 4, "A-");
        Record record4 = new Record(2007, "Zeena", 4, "B");

        ModuleService ms = new ModuleService();
        ms.addModule(record1);
        ms.addModule(record2);
        ms.addModule(record3);
        ms.addModule(record4);

        System.out.println(ms.getModuleById(2004)+"\n");
        System.out.println(ms.getHighAchievingModules());
    }
}