package Controller.UI;

public interface UICallback {
    void refreshUserList();
    void addUser(String username, String password);
    void addProject(String username, long proId, String proName, int proColor);
    void addTask(String username, long taskId, long proId, String content, long time, int level);
}
