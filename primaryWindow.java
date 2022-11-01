import javax.swing.JFrame;
import javax.swing.JMenuBar;

import java.awt.*;
import javax.swing.*;
import menu.myMenuBar;
import panels.myPanel;
import panels.myTable;

public class primaryWindow extends JFrame{
    public primaryWindow(){
        this._setup();
        this.setVisible(true); 
    }

    private void _setup(){
        this.setTitle("Example Title");
        this.setSize(800,600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        this.setJMenuBar(new myMenuBar());

        JPanel overView = new JPanel(new GridLayout(0,3));
        overView.add(new myTable());
        overView.add(new myPanel());

        this.add(overView);
    }

    public static void main(String args[]){
        new primaryWindow();
    }
}
