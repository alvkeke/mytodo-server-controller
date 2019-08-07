package Controller.UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWin extends JFrame {

    public DataList lvOLUser;
    public DataList lvDBUser;
    public DataList lvProject;
    public DataList lvTasks;

    private JLabel adminId;

    private JButton btnRefreshUsers;
    private JButton btnAddUser;
    private JButton btnAddProject;
    private JButton btnAddTask;

    private UICallback callback;

    public MainWin(UICallback callback){

        this.callback = callback;

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,100,700,800);

        setUI();

        lvDBUser.addData("用户1");

    }

    private void setUI(){

        JPanel pMain = new JPanel(new GridLayout(1,4,5,5));
        pMain.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        this.add(pMain);

        lvOLUser = new DataList("online");
        lvDBUser = new DataList("all users");
        lvProject = new DataList("projects");
        lvTasks = new DataList("tasks");

        pMain.add(lvDBUser);
        pMain.add(lvOLUser);
        pMain.add(lvProject);
        pMain.add(lvTasks);


        adminId = new JLabel("admin ID: ");
        adminId.setBorder(BorderFactory.createRaisedBevelBorder());
        this.add(adminId, BorderLayout.NORTH);


        JPanel pButtons = new JPanel(new GridLayout(1,4,5,5));
        pButtons.setBorder(BorderFactory.createEmptyBorder(0,5,5,5));
        this.add(pButtons, BorderLayout.SOUTH);

        btnRefreshUsers = new JButton("Refresh User");
        btnAddUser = new JButton("Add User");
        btnAddProject = new JButton("Add Project");
        btnAddTask = new JButton("Add Task");

        pButtons.add(btnRefreshUsers);
        pButtons.add(btnAddUser);
        pButtons.add(btnAddProject);
        pButtons.add(btnAddTask);

        adminId.setFont(new Font("Noto Sans Mono", Font.PLAIN, 16));
        btnRefreshUsers.setFont(new Font("Noto Sans Mono", Font.PLAIN, 16));
        btnAddProject.setFont(new Font("Noto Sans Mono", Font.PLAIN, 16));
        btnAddTask.setFont(new Font("Noto Sans Mono", Font.PLAIN, 16));
        btnAddUser.setFont(new Font("Noto Sans Mono", Font.PLAIN, 16));


    }

    private void setListener(){
        btnRefreshUsers.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                callback.refreshUserList();
            }
        });

        btnRefreshUsers.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JDialog jd = new JDialog(MainWin.this);
                jd.setVisible(true);
            }
        });
    }
}
