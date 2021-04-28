package mollap.administrator;

import java.util.ArrayList;
import java.util.List;

import mollap.filters.Filter;
import mollap.targets.Target;

import java.util.Optional;

public class Tasks {
    private List<Filter> tasks = new ArrayList<>();

    private Optional<Target> target;// why optional??

    public List<Filter> getTasks() {
        return this.tasks;
    }

    public Optional<Target> getTarget() {
        return this.target;
    }

    public void addTask(Filter filter) {
        getTasks().add(filter);
    }

    public void setTarget(Target target) {
        this.target = Optional.ofNullable(target);
    }

    public void execution(String message) {
        getTasks().forEach(item -> item.execution(message));
        if (getTarget().isPresent()) {
            getTarget().get().execution(message);
        } else {
            // mi no entiende :c
        }
    }
}
