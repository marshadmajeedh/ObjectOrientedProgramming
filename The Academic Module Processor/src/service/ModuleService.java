package service;

import exception.ModuleNotFoundException;
import entity.Record;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ModuleService {
    private final List<Record> modules;

    public ModuleService() {
        modules = new ArrayList<>();
    }

    public void addModule(Record module) {
        modules.add(module);
    }

    public Record getModuleById(long id) {

        return modules.stream()
                .filter(module -> module.getId() == id)
                .findFirst()
                .orElseThrow(() -> new ModuleNotFoundException("ID "+id+" not found"));
    }

    public List<Record> getHighAchievingModules() {
        return modules.stream()
                .filter(module -> module.getGrade().equals("A") || module.getGrade().equals("A-"))
                .collect(Collectors.toList());
    }
}
