package panels;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;

public class myTable extends JPanel{
    public myTable(){
        this._setup();
    }

    private void _setup(){
        String data[][] = {
            {"KD2","PA3"},
            {"QG4","BB3"},
            {"RE7","KiG4"}
        };
        String columns[] = {"WHITE","BLACK"};
        JTable jt = new JTable(data,columns);
        this.add(jt);
    }
}
