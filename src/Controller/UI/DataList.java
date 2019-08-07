package Controller.UI;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.util.Vector;

public class DataList extends JList<String> {

    private Vector<String> listData;
    private JPopupMenu menu;

    public DataList(String title){
        Font font = new Font("Noto Sans Mono", Font.PLAIN, 16);
        TitledBorder border = BorderFactory.createTitledBorder(title);
        border.setTitleFont(font);
        this.setBorder(border);

        listData = new Vector<>();
        menu = new JPopupMenu();

        this.setListData(listData);
        this.setComponentPopupMenu(menu);

        this.setFont(new Font("文泉驿正黑", Font.PLAIN, 16));
    }

    public void addMenuItem(JMenuItem item){
        menu.add(item);
    }

    public void addData(String d){
        listData.add(d);
    }
    public void delData(int index){
        listData.remove(index);
    }
    public void clearData(){
        listData.clear();
    }

}
