package menu;

import javax.swing.ButtonGroup;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;

public class myMenuBar extends JMenuBar{
    protected JMenu menu;
    protected JMenuItem menuItem;
    protected JRadioButtonMenuItem rbMenuItem;


    public myMenuBar(){
        this._setup();
    }

    private void _setup(){
        menu = new JMenu("A Menu");
        this.add(menu);

        menuItem = new JMenuItem("Option 1");
        menu.add(menuItem);
        menu.addSeparator();

        ButtonGroup group = new ButtonGroup();
        rbMenuItem = new JRadioButtonMenuItem("Radio Buttons");
        rbMenuItem.setSelected(true);

        group.add(rbMenuItem);
        menu.add(rbMenuItem);
        rbMenuItem = new JRadioButtonMenuItem("Option 2 RB"); 
        group.add(rbMenuItem);
        menu.add(rbMenuItem);

        this.add(menu);
    }
}
