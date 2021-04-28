package mollap.clients;

import mollap.administrator.TaskProgramator;

public class Mollapp implements Client {

    private TaskProgramator programator = null;

    @Override
    public void setProgramatorTasks(TaskProgramator programator) {
        this.programator = programator;
    }

    @Override
    public void sendPetition(String petition) {
        programator.execTasks(petition);
    }
}