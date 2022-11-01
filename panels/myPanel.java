package panels;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class myPanel extends JPanel implements ActionListener{

    protected int timesClicked;
    protected JLabel label;
    protected JButton button;

    public myPanel(){
        timesClicked = 0;
        this._setup();
    }

    private void _setup(){
        label = new JLabel("Hello!"); 
        button = new JButton("Click Me!");
        button.addActionListener(this);

        this.setBorder(BorderFactory.createLineBorder(Color.black));

       
        this.add(button);
        this.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        timesClicked++;
        label.setText("" + timesClicked);
    }
}
