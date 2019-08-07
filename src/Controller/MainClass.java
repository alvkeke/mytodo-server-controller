package Controller;


import Controller.Network.NetworkCallback;
import Controller.Network.RefreshRunnable;
import Controller.UI.MainWin;
import Controller.UI.UICallback;

import java.net.DatagramSocket;
import java.net.SocketException;

import static Server.Controller.Constant.*;

public class MainClass implements UICallback, NetworkCallback{

    private int adminId;
    private MainWin win;

    private MainClass(){

        win = new MainWin(this);
    }

    @Override
    public void refreshUserList() {
        new Thread(new RefreshRunnable()).start();
    }

    @Override
    public void addUser(String username, String password) {
        try {
            DatagramSocket socket = new DatagramSocket();

            String s = CONTROLLER_ADD_USER + username +"";

        } catch (SocketException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void addProject(String username, long proId, String proName, int proColor) {

    }

    @Override
    public void addTask(String username, long taskId, long proId, String content, long time, int level) {

    }


    public static void main(String[] args){

        MainClass mc = new MainClass();

    }
}
