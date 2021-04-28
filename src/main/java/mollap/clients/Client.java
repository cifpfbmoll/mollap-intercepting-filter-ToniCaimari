package mollap.clients;

import mollap.administrator.TaskProgramator;

public interface Client {
    void setProgramatorTasks(TaskProgramator programator);

    void sendPetition(String petition);

}
