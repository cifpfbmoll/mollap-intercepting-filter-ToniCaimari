package mollap.administrator;

import mollap.filters.Filter;
import mollap.targets.Target;

public class TaskProgramator {
    private Tasks tasks = null; // why???

    public TaskProgramator(Target target) {
        tasks = new Tasks();
        tasks.setTarget(target);
    }

    public Tasks getTasks() {
        return this.tasks;
    }

    public void setTask(Filter task) {
        getTasks().addTask(task);
    }

    public void execTasks(String message) {
        tasks.execution(message);
    }
}
